<%-- 
    Document   : Add_Exist
    Created on : Aug 18, 2014, 10:43:08 AM
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
        <title>Find</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1><br>
        
        <%HttpSession h=request.getSession();
        String uname=(String)h.getAttribute("uname");
        String pass=(String)h.getAttribute("pass");
        h.setAttribute("num",0);%>
        
        <html:link href="Login_success.jsp" >Home  </html:link>|
        <html:link href="AboutUs_login.jsp">About Us</html:link>|
        <html:link href="ContactUs_login.jsp">Contact Us</html:link>
        <br><br>
        <html:form action="find" method="post">
            <p align="center">You have already sent a request to this person.<br>
            Please make another selection..</p><br>
            Gender:         <html:select property="gen">
            <option label="Nill"></option>
            <option label="M">Male</option>
            <option label="F">Female</option>
            </html:select><br>
            <html:errors property="gen"/><br>
            Religion:        <html:select property="rel">
            <html:option value="nill"></html:option>
            <html:option value="christian">Christian</html:option>
            <html:option value="hindu">Hindu</html:option>
            <html:option value="jain">Jain</html:option>
            <html:option value="muslim">Muslim</html:option>
            <html:option value="sikh">Sikh</html:option>
            </html:select><br>
            
            <html:submit value="Find"/><br><br>
        </html:form>
        <html:link href="Login_success.jsp">Cancel</html:link>|
        <html:link href="Logout.jsp">Logout</html:link>
    </body>
</html:html>
