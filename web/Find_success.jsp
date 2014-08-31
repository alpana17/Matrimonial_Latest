<%-- 
    Document   : Find_success
    Created on : Aug 2, 2014, 10:26:47 PM
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
        <title>Match Found</title>
    </head>
    <body bgcolor="antiquewhite" align="center"><br>
        <h1 align="center"><image src="images/background.jpg" height="200" width="400" >
        </h1>
        <html:form action="add">
        <% HttpSession h=request.getSession(true);
        String uname=(String)h.getAttribute("uname");
        String gen = (String)h.getAttribute("gen");
        String rel = (String)h.getAttribute("rel");
        int i = (Integer)h.getAttribute("num");
        array_to_store_data a= new array_to_store_data();
        int count = a.getI(gen, rel);
        //a.create(gen, rel);
        %>
        <html:link href="Login_success.jsp" >Home  </html:link>|
        <html:link href="AboutUs_login.jsp">About Us</html:link>|
        <html:link href="ContactUs_login.jsp">Contact Us</html:link>
        <br><br>
        
             <%
        if((a.getUname(i, gen, rel))==null || i>=count)
                 {
                     h.setAttribute("intIn", null);
                     out.println("No match..");
                     
         }
        else //if(i<count)
        {
                    out.println(a.getName(i, gen, rel)+"\t"+a.getGen(i, gen,rel)+"\t"+a.getRel(i, gen, rel));
                    h.setAttribute("intIn", a.getUname(i, gen, rel));
                    i=i+1;
                    h.setAttribute("num", i);
                 }
      %>
      <br><br>
      <html:submit value="Add"></html:submit>
      <html:link href="Find_success.jsp"><html:button property="next" value="Next"/></html:link>
      
         <br><br>
        </html:form>
          <html:link href="Logout.jsp">Logout</html:link><br>
          <html:link href="Delete_form.jsp">Delete Account</html:link>
    </body>
</html:html>