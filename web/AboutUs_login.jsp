<%-- 
    Document   : AboutUs_login
    Created on : Aug 8, 2014, 1:22:15 AM
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
        <title>About Us</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1>
        <%HttpSession h=request.getSession();
        String uname=(String) h.getAttribute("uname");
    %>
        
        <html:link href="Login_success.jsp" >Home  </html:link>|
        <html:link href="AboutUs_login.jsp">About Us</html:link>|
        <html:link href="ContactUs_login.jsp">Contact Us</html:link>
        <br><br>
        <p align="center" >Welcome <%=uname%><br><br>
         </p>
         <p align="center">We are here to find a perfect match for you.<br>
        Please Register yourself to access the facility.</p><br><br>
         <html:link href="Interested.jsp">Requests</html:link><br>
        <html:link href="Find.jsp">Find match</html:link><br><br>
          <html:link href="Logout.jsp">Logout</html:link><br>
          <html:link href="Delete_form.jsp">Delete Account</html:link>
    </body>
</html:html>
