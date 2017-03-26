<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>  
	<title>Danh sách tài khoản</title>
	<link rel="stylesheet" href="css/style.css"/>
</head>

<body >
<jsp:include page="index.jsp"></jsp:include>
<div class="jumbotron" style="margin-left: 250px; margin-right: 20px; margin-top: 20px ;" >

<div class="x_content well" >
 <div class="row">
    </div>
    <h1> Tài khoản</h1>
    <br>
    <div class="bs-example">
  
        <table class="table">
            <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Birth day</th>
                <th>Phone</th>
                <th>Nric</th>
                <th>Address</th>
                <th>Email</th>
                <th>Password</th>
                <th></th>
               
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="usersForm" property="listUsers" id="user">
            	<tr>
                <th scope="row">
                	<bean:write name="user" property="first_name"/>
				</th>
                <td>
                	<bean:write name="user" property="last_name"/>
                </td>
                <td>
                	<bean:write name="user" property="birth_date"/>
				</td>
                <td>
                	<bean:write name="user" property="phone"/>
                </td>
                <td>
                	<bean:write name="user" property="nric"/>
                </td>
                <td>
                	<bean:write name="user" property="address"/>
                </td>
                <td>
                	<bean:write name="user" property="email"/>
                </td>
                <td>
                	<bean:write name="user" property="password"/>
                </td>
                <td>
                	<bean:define id="id" name="user" property="id"></bean:define>
                	<html:link action="/editUsers?id=${id}">
                		<span class="glyphicon glyphicon-edit"></span>
                	</html:link>
                	<html:link  action="/deleteUser?id=${id}" style="margin-left: 30px;" >
                		<span class="glyphicon glyphicon-trash" ></span>
                	</html:link>
                	
                </td>
            </tr>
            </logic:iterate>
            </tbody>
        </table>

    </div>
   
</div>
</div>

</body>
</html>