<%-- 
    Document   : Register
    Created on : Jul 23, 2014, 9:20:53 PM
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
        <title>Register</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1>
         <html:link href="Home.jsp" >Home  </html:link>|
        <html:link href="Login.jsp">Login</html:link>|
        <html:link href="Register.jsp">Register</html:link>|
        <html:link href="AboutUs.jsp">About Us</html:link>|
        <html:link href="ContactUs.jsp">Contact Us</html:link>
        <html:form action="register" method="post">
            Name : <html:text property="fname"/><br>
            <html:errors property="fname"/>
            Gender : <html:select property="gen">
            <option label="Nill"></option>
            <option label="M">Male</option>
            <option label="F">Female</option>
            </html:select><br>
            <html:errors property="gen"/>
            <%--DOB:<input type="date" name="dob"/><br>
            <html:errors property="dob"/> --%>
            Religion:        <html:select property="rel">
            <html:option value="nill"></html:option>
            <html:option value="christian">Christian</html:option>
            <html:option value="hindu">Hindu</html:option>
            <html:option value="jain">Jain</html:option>
            <html:option value="muslim">Muslim</html:option>
            <html:option value="sikh">Sikh</html:option>
            </html:select><br>
            <html:errors property="rel"/> 
            e-mail:          <input type="email" name="email"/><br>
            <html:errors property="email"/>
            Username:        <html:text property="uname"/><br>
            <html:errors property="uname"/>
            Password:        <html:password property="pass"/><br>
            <html:errors property="pass"/>
            Confirm Password: <html:password property="c_pass"/><br><br>
            <html:errors property="c_pass"/>
            <html:submit value="Register"/>
        </html:form>
    </body>
</html:html>
