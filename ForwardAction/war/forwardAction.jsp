<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<body>  
<h2>this is index page</h2>  
  <jsp:include page="printdate.jsp" > 
<!-- <jsp:forward page="printdate.jsp" >  -->
<jsp:param name="name" value="Myname" />  
<!--</jsp:forward>-->
</jsp:include>
</body>   