<?php
// Database credentials
$servername = 'localhost';  // Change to your database host
$username = 'cse347';  // Change to your database username
$password = '1234';  // Change to your database password
$dbname = 'cse347__examdata';  // Change to your database name

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die('Connection failed: ' . $conn->connect_error);
}

// Optional: Message for successful connection
// echo "Connected successfully";
?>
