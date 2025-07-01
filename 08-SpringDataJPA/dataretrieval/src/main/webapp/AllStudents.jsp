<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>All students Report</h1>
<hr>

<table>
<tr>
<th>Roll number
<th>Student Name
<th>Course Joined
</tr>

<c:forEach items="${stlist}" var="st">

<tr>
<td>${st.rollno}
<td>${st.studnm}
<td>${st.course}
</td>


</c:forEach>


</table>

</body>
</html>