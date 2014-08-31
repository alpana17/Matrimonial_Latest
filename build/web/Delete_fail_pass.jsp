<%-- 
    Document   : Delete_fail_pass
    Created on : Jul 24, 2014, 3:58:11 AM
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
        <title>Password Mismatch</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1><br>
        <html:link href="Login_success.jsp" >Home  </html:link>|
        <html:link href="AboutUs_login.jsp">About Us</html:link>|
        <html:link href="ContactUs_login.jsp">Contact Us</html:link>
        <br><br>
        <html:form action="delete" method="post">
            e-mail:          <input type="email" name="email"/>
            <html:errors property="email"/><br><br>
            Username:        <html:text property="uname"/>
            <html:errors property="email"/><br><br>
            Password:        <html:password property="pass"/>
            <html:errors property="pass"/><br><br>
            Confirm Password: <html:password property="c_pass"/>
            <html:errors property="c_pass"/><br><br><br>
            <html:submit property="Delete"/>
        </html:form>
        <html:link href="Login_success.jsp">Cancel</html:link>|
        <html:link href="Logout.jsp">Logout</html:link>
        <p align="center">Password and Confirm Password did not match.</p>
    </body>
</html:html>
