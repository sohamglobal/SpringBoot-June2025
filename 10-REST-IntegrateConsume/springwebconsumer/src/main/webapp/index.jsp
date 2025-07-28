<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Employee Table</title>
  <style>
    table {
      width: 70%;
      border-collapse: collapse;
      margin: 20px auto;
      font-family: Arial, sans-serif;
    }
    th, td {
      border: 1px solid #999;
      padding: 8px 12px;
      text-align: left;
    }
    th {
      background-color: #f2f2f2;
      color: #333;
    }
    tr:hover {
      background-color: #eef;
    }
  </style>
</head>
<body>
<h1>Employee List from REST</h1>
<hr>

  <table>
    <thead>
      <tr>
        <th>Employee Number</th>
        <th>Name</th>
        <th>Department</th>
        <th>Location</th>
        <th>Salary</th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach items="${list}" var="e">
    
      <tr>
        <td>${e.empNumber}</td>
        <td>${e.empName}</td>
        <td>${e.department}</td>
        <td>${e.baseLocation}</td>
        <td>₹ ${e.salary}</td>
      </tr>
      
      </c:forEach>
    </tbody>
  </table>

</body>
</html>