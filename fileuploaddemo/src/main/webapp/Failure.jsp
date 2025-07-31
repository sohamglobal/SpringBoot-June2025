<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Authentication Failed</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8d7da;
        }
        .error-container {
            margin-top: 100px;
        }
        .card {
            border-radius: 12px;
            border: none;
            box-shadow: 0 0 12px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <div class="container error-container">
        <div class="row justify-content-center">
            <div class="col-md-6 col-lg-4">
                <div class="card p-4 bg-white text-center">
                    <h3 class="text-danger mb-3">Authentication Failed</h3>
                    <p class="text-muted">Invalid username or password. Please try again.</p>
                    <a href="/" class="btn btn-outline-primary mt-3">Back to Home</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
