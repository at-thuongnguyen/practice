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
	<title>Danh Sách Sân</title>
	<link rel="stylesheet" href="css/style.css"/>
</head>

<body >
<jsp:include page="index.jsp"></jsp:include>
<div class="jumbotron" style="margin-left: 250px; margin-right: 20px; margin-top: 20px ;" >

<div class="x_content well" >
 <div class="row">
    </div>
    <h1> Danh sách Sân</h1>
    <br>
    <div class="bs-example">
  
        <table class="table">
            <thead>
            <tr>
                <th>Mã sân</th>
                <th>Tên sân</th>
                <th>Loại sân</th>
                <th>Khu Vực</th>
                <th>Giá sân</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="footballPitchForm" property="listSan" id="san">
            	<tr>
                <th scope="row">
                	<bean:write name="san" property="idPitch"/>
				</th>
                <td>
                	<bean:write name="san" property="pitchName"/>
                </td>
                <td>
                	<bean:write name="san" property="pitchSize"/>
				</td>
                <td>
                	<bean:write name="san" property="pitchZone"/>
                </td>
                <td>
                	<bean:write name="san" property="price"/>
                </td>
                <td>
                	<bean:define id="idPitch" name="san" property="idPitch"></bean:define>
                	<html:link action="/suaSan?idPitch=${idPitch}">
                		<span class="glyphicon glyphicon-edit"></span>
                	</html:link>
                	<html:link  action="/xoaSan?idPitch=${idPitch}" style="margin-left: 30px;" >
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