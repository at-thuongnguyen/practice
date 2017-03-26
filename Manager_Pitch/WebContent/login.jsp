<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Đăng nhập</title>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Varela+Round">
  </head>

  <body>
  	<div class="container">
      <div class="login">
        <h2><span class="fontawesome-lock"></span>Login</h2>
        <html:form action="/login" method="post">
          <fieldset>
            <p><label for="email">E-mail address</label></p>
            <div><html:text property="email"  ></html:text></div>
            <p><label for="password">Password</label></p>
            <div><html:password property="password"  value="123"></html:password></div>
            <p><html:submit >Login</html:submit></p>
            <a href="register.jsp">Register</a>
            <a href="regetpassword.jsp">Forgot Password?</a>
          </fieldset>
        </html:form>
      </div> <!-- end login -->
    </div>
  </body>
</html>