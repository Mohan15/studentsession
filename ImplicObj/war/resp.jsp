<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%   
String name=request.getParameter("uname");
out.print(name);
String url="https://www.google.co.in/search?q='name'";
response.sendRedirect(url);  
%>