<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Store Dashboard</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
    }
    .card {
      margin-bottom: 20px;
    }
    .dashboard-header {
      background-color: #0d6efd;
      color: white;
      padding: 15px;
      border-radius: 8px;
      margin-bottom: 20px;
    }
  </style>
</head>
<body>
  <div class="container mt-4">
    <div class="dashboard-header text-center">
      <h3>Welcome to Mobile Store</h3>
      <p>Dashboard Overview</p>
    </div>

    <div class="row">
      <div class="col-md-4 col-sm-6">
        <div class="card text-white bg-primary">
          <div class="card-body">
            <h5 class="card-title">Total Sales</h5>
            <p class="card-text">₹75,000</p>
          </div>
        </div>
      </div>
      <div class="col-md-4 col-sm-6">
        <div class="card text-white bg-success">
          <div class="card-body">
            <h5 class="card-title">Orders</h5>
            <p class="card-text">250</p>
          </div>
        </div>
      </div>
      <div class="col-md-4 col-sm-6">
        <div class="card text-white bg-warning">
          <div class="card-body">
            <h5 class="card-title">Inventory</h5>
            <p class="card-text">120 items</p>
          </div>
        </div>
      </div>
    </div>

    <div class="row mt-3">
      <div class="col-12">
        <div class="card">
          <div class="card-header bg-light">
            Recent Orders
          </div>
          <ul class="list-group list-group-flush">
            <li class="list-group-item">Order #1234 - ₹2,499 - Delivered</li>
            <li class="list-group-item">Order #1235 - ₹1,199 - Shipped</li>
            <li class="list-group-item">Order #1236 - ₹4,099 - Processing</li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</body>
</html>