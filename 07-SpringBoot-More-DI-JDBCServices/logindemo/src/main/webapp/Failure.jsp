<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Authentication Failed</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #fff3f3;
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }
    .error-box {
      max-width: 400px;
      text-align: center;
      padding: 30px;
      background-color: #fff;
      border: 2px solid #f5c2c7;
      border-radius: 12px;
      box-shadow: 0 4px 15px rgba(0,0,0,0.1);
    }
    .error-icon {
      font-size: 50px;
      color: #dc3545;
    }
  </style>
</head>
<body>
  <div class="error-box">
    <div class="error-icon mb-3">❌</div>
    <h4 class="text-danger">Authentication Failed</h4>
    <p class="text-muted">Invalid username or password. Please try again.</p>
    <a href="/login" class="btn btn-outline-danger mt-3">Go Back to Login</a>
  </div>
</body>
</html>