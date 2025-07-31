<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Uploaded PDF Files</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f8;
        }
        .container {
            margin-top: 60px;
        }
        table {
            background: white;
            border-radius: 8px;
            box-shadow: 0 0 8px rgba(0, 0, 0, 0.05);
        }
    </style>
</head>
<body>

<div class="container">
    <h2 class="mb-4 text-center">List of Uploaded PDF Files</h2>

    <c:choose>
        <c:when test="${not empty files}">
            <table class="table table-bordered table-hover">
                <thead class="table-dark">
                <tr>
                    <th>#</th>
                    <th>File Name</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="file" items="${files}" varStatus="loop">
                    <tr>
                        <td>${loop.index + 1}</td>
                        <td>${file}</td>
                        <td>
                            <a class="btn btn-sm btn-primary" href="/view/${file}" target="_blank">View</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <div class="alert alert-info text-center">No PDF files found in the upload directory.</div>
        </c:otherwise>
    </c:choose>

    <div class="text-center mt-4">
        <a href="/admin" class="btn btn-outline-secondary">Back to Admin Panel</a>
    </div>
</div>

</body>
</html>
