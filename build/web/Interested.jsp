<%-- 
    Document   : Interested.jsp
    Created on : Jul 30, 2014, 4:39:26 AM
    Author     : Alpana
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page import="Model.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interested</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1>
        <%HttpSession h=request.getSession();
        String uname=(String)h.getAttribute("uname");
        String pass=(String)h.getAttribute("pass");
        int count=0;
        %>
        <html:link href="Login_success.jsp" >Home  </html:link>|
        <html:link href="AboutUs_login.jsp">About Us</html:link>|
        <html:link href="ContactUs_login.jsp">Contact Us</html:link>
        <br><br>
        
         <%Connection con = Connect.create();
         Statement st=con.createStatement();
         String query ="select name,gen, rel,email,intIn from register JOIN interested ON register.uname=interested.uname";
         ResultSet rs=st.executeQuery(query);
         
         while(rs.next())
         {
             if(uname.equals(rs.getString("intIn")))
             {
                 count++;
                 break;
             }
         }
         rs=st.executeQuery(query);
         if(count==0)
             out.println("No Requests..");
         else
         { 
             out.println("Contact to the person if You are interested..");%><br><br><%
             out.println("Name         Gender         Religion         E-mail");%><br><%
             while(rs.next())
             {
                 if(uname.equals(rs.getString("intIn")))
                 out.println(rs.getString("name")+"    "+rs.getString("gen")+"    "+rs.getString("rel")+"    "+rs.getString("email"));
                 out.println();
             }
         }
         con.close();
         %>
         <br><br>
        <html:link href="Find.jsp">Find match</html:link><br><br>
          <html:link href="Logout.jsp">Logout</html:link><br>
          <html:link href="Delete_form.jsp">Delete Account</html:link>
    </body>
</html:html>
