<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>All Rfp</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2>List of RFP</h2>  
    <h1>ID ${id}</h1>
    <table>
        <tr>
            <td>NAME</td>
        </tr>
        <c:forEach items="${rfps}" var="rfp">
            <tr>
            <td>${rfp.name}</td>
            <td><a href="<c:url value='/map-${rfp.id}' />">VIEW GRAPTH</a></td>            
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/newrfp' />">Add New RFP</a>
</body>
</html>