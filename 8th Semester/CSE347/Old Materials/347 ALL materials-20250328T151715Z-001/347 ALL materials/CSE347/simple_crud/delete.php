<?php
require_once 'config/db_connect.php';

if (isset($_GET['delete'])) {
    $id = $_GET['delete'];

    $sql = "DELETE FROM users WHERE id=$id";
    if ($conn->query($sql)) {
        header('Location: output.php');
    } else {
        echo 'Error: ' . $conn->error;
    }
}
?>
