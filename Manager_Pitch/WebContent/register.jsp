<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Đăng ký tài khoản</title>
	<link rel="stylesheet" href="css/style.css"/>
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Varela+Round">
</head>
<body>
	<div class="container">
      <div class="login">
        <h2><span class="fontawesome-lock"></span>Đăng Ký</h2>
       	 	<html:form action="/register" method="post">
    			<fieldset>
		            <p><label for="email">Email *</label></p>
		            <div ><html:text property="email" styleClass="text" ></html:text></div>
		            <p><label for="password">PassWord *</label></p>
		            <div ><html:password property="password"   styleClass="text"></html:password></div>
					<p><label for="first_name"> First Name</label></p>
		            <div ><html:text property="first_name" styleClass="text" ></html:text></div>
					<p><label for="last_name"> Last Name</label></p>
		            <div ><html:text property="last_name" styleClass="text" ></html:text></div>
					<p><label for="phone"> Phone</label></p>
		            <div ><html:text property="phone" styleClass="text" ></html:text></div>
		            <span><html:submit  property="submit" value="submit">Register</html:submit></span>
		            <span><input  type="submit" value="Cancel"></span>   
				</fieldset>
        	</html:form>
      </div> <!-- end login -->
    </div>
</body>
</html>