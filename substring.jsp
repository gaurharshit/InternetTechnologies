<%-- 
    Document   : substring
    Created on : Oct 25, 2017, 2:36:56 PM
    Author     : bsc3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String info= request.getParameter("string");
            int start=Integer.parseInt(request.getParameter("start"));
            int end=Integer.parseInt(request.getParameter("end"));
            for (int i=start;i<=end;i++)
            {
                out.println(info.charAt(i));
            }
            %>
    </body>
</html>
