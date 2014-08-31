<%-- 
    Document   : Login
    Created on : Jul 23, 2014, 9:59:41 PM
    Author     : Alpana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1>
         <html:link href="Home.jsp" >Home  </html:link>|
        <html:link href="Login.jsp">Login</html:link>|
        <html:link href="Register.jsp">Register</html:link>|
        <html:link href="AboutUs.jsp">About Us</html:link>|
        <html:link href="ContactUs.jsp">Contact Us</html:link>
        <html:form action="login" method="post">
            UserName : <html:text property="uname"/><br>
            <html:errors property="uname"/>
            Password:        <html:password property="pass"/>
            <html:errors property="pass"/><br><br>
            
            <html:submit value="Login"/>
        </html:form>
    </body>
</html:html>
