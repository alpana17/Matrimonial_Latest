<%-- 
    Document   : Delete_form
    Created on : Jul 24, 2014, 3:10:32 AM
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
        <title>Delete</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
         <%HttpSession h=request.getSession();
        String uname=(String) h.getAttribute("uname");
    %>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1><br>
        <html:link href="Login_success.jsp" >Home  </html:link>|
        <html:link href="AboutUs_login.jsp">About Us</html:link>|
        <html:link href="ContactUs_login.jsp">Contact Us</html:link>
        <br><br>
        <html:form action="delete" method="post">
            e-mail:          <input type="email" name="email"/><br>
            <html:errors property="email"/>
            Username:        <html:text property="uname"/><br>
            <html:errors property="uname"/>
            Password:        <html:password property="pass"/><br>
            <html:errors property="pass"/>
            Confirm Password: <html:password property="c_pass"/><br>
            <html:errors property="c_pass"/>
            <html:submit value="Delete"/><br><br>
        </html:form>
        <html:link href="Login_success.jsp">Cancel</html:link>|
        <html:link href="Logout.jsp">Logout</html:link>
    </body>
</html:html>
