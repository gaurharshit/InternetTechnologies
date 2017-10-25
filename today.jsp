<%-- 
    Document   : today
    Created on : Oct 25, 2017, 2:52:27 PM
    Author     : bsc3
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Date get</title>
    </head>
    <body>
        <%@ page language="java" import="java.util.*,java.text.*"%>
        <% DateFormat df=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
           Date dateobj=new Date(10);
           String temp=df.format(dateobj).toString();
           int time=Integer.parseInt(""+temp.charAt(9)+temp.charAt(10));
          out.println(time);
        %>
                   
            
        
               
    </body>
</html>
