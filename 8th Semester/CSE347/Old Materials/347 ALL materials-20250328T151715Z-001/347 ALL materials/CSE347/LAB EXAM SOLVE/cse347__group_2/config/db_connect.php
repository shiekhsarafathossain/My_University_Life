<?php
// database credentials
$servername = 'localhost';
$username = 'cse347';
$password = '1234';
$dbname = 'cse347__lab_exam';

// create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// check connection
if ($conn->connect_error) {
  die('Connection failed: ' . $conn->connect_error);
}
