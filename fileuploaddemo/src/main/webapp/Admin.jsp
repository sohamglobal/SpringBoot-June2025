<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Panel - File Upload Project</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f2f2f2;
        }
        .admin-container {
            margin-top: 50px;
        }
        .card {
            border-radius: 12px;
            box-shadow: 0 0 12px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>
    <div class="container admin-container">
        <div class="row justify-content-center">
            <div class="col-md-8 col-lg-6">
                <div class="card p-4">
                    <div class="card-body">
                        <h2 class="card-title text-center mb-4">Admin Panel</h2>

                        <form method="post" action="/upload" enctype="multipart/form-data">
                            <div class="mb-3">
                                <label for="file" class="form-label">Upload PDF File</label>
                                <input type="file" class="form-control" id="file" name="file" accept="application/pdf" required>
                            </div>
                            <div class="d-grid">
                                <button type="submit" class="btn btn-success">Upload</button>
                            </div>
                        </form>

                        <hr class="my-4">

                        <div class="text-center">
                            <a href="/files" class="btn btn-outline-primary">View Uploaded Files List</a>
                        </div>

                        <div class="mt-4 text-center text-muted">
                            <small>Welcome Admin | Powered by SohamGlobal</small>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
