package com.javatpoint;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class EmployeeCustTag extends TagSupport{

	private String color;
	private String size;
	private String userName=null;
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		 //Get the writer object for output.
       
        
        try {
        	 JspWriter out = pageContext.getOut();
             
             HttpSession session = pageContext.getSession();
             
             Employee emp  = (Employee) session.getAttribute("user");
             
			 out.println("<label style=\"color:"+getColor()+"; font-size:"+getSize()+";\"> Welcome "+emp.getUsername()+"</label>");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return SKIP_BODY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
