<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>User Management Login</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background: linear-gradient(135deg, #74ebd5, #acb6e5);
      height: 100vh;
    }
    .login-container {
      max-width: 400px;
      margin: auto;
      margin-top: 10%;
      background: white;
      border-radius: 15px;
      padding: 30px;
      box-shadow: 0 10px 25px rgba(0,0,0,0.2);
    }
    .btn-custom {
      background-color: #007BFF;
      color: white;
    }
    .btn-custom:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
  <div class="container">
    <div class="login-container">
      <h2 class="text-center mb-4">User Management</h2>
      <form action="/authenticate" method="POST">
        <div class="mb-3">
          <label for="username" class="form-label">Username</label>
          <input type="text" class="form-control" id="username" name="username" required autocomplete="off" />
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Password</label>
          <input type="password" class="form-control" id="password" name="password" required />
        </div>
        <button type="submit" class="btn btn-custom w-100">Login</button>
      </form>
    </div>
  </div>
</body>
</html>