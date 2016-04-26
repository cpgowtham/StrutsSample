package com.javatpoint;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements SessionAware,ModelDriven<Employee> {

SessionMap sessionmap;

Employee emp = new Employee();

@Override
public void setSession(Map map) {
	// TODO Auto-generated method stub
	sessionmap=(SessionMap)map;
	sessionmap.put("login","true");
}

@Override
public Employee getModel() {
	// TODO Auto-generated method stub
	return emp;
}

public String execute()
{
	if(emp.getUsername().equals("admin") && emp.getPassword().equals("admin"))
	{
		return SUCCESS;

	}else
		return ERROR;
}
}
