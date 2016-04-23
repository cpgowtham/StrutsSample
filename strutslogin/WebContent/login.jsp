<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
 
<s:form action="loginprocess">
 
<s:textfield name="username" label="Enter Username" /><br>
<s:password name="password" label="Enter Password" /><br>
<s:submit value="Sign In" align="center" />
 
</s:form>
</body>
</html>