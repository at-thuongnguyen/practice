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
	<title>Quản lý đặt sân</title>
	<link rel="stylesheet" href="css/style.css"/>
</head>

<body >
<jsp:include page="index.jsp"></jsp:include>
<div class="jumbotron" style="margin-left: 250px; margin-right: 20px; margin-top: 20px ;" >

<div class="x_content well" >
<div class="x_content well" >
	<html:form action="/datsan" method="post">
        <div class="row form-group">
            <label class="col-lg-2"> Tên Sân</label>
            <div class="col-lg-3">
            	<html:select property="idPitch" styleClass="form-control">
            		<html:optionsCollection name="footballPitchForm" property="listSan" label="pitchName" value="idPitch" />
            	</html:select>
            </div>
        </div>
        <div class="row form-group">
            <label class="col-lg-2"> Khung giờ</label>
            <div class="col-lg-3">
            	<html:select property="idHour" styleClass="form-control">
            		<html:optionsCollection name="hourForm" property="listHour" label="frame" value="idHour" />
            	</html:select>
            </div>
        </div>
        <div class="input-group date" data-provide="datepicker">
		    <input type="text" class="form-control">
		    <div class="input-group-addon">
		        <span class="glyphicon glyphicon-th"></span>
		    </div>
		</div>
        
        
        <div class="row form-group">
            <div class="col-lg-3 col-lg-offset-2">
                <html:submit styleClass="btn btn-primary" property="submit" value="submit">Xem</html:submit>
            </div>
        </div>
    </html:form>
    </div>
    </div>
</div>


</body>
</html>