<?php
require_once 'config/db_connect.php';

// CREATE operation
if (isset($_POST['save'])) {
    $name = $conn->real_escape_string($_POST['name']);
    $email = $conn->real_escape_string($_POST['email']);
    $contact_no = $conn->real_escape_string($_POST['contact_no']);
    $address = $conn->real_escape_string($_POST['address']);
    $age = (int) $_POST['age'];
    $gender = $conn->real_escape_string($_POST['gender']);

    $sql = "INSERT INTO users (name, email, contact_no, address, age, gender)
            VALUES ('$name', '$email', '$contact_no', '$address', $age, '$gender')";
    if ($conn->query($sql)) {
        header('Location: output.php');
    } else {
        echo 'Error: ' . $conn->error;
    }
}

// UPDATE operation
if (isset($_POST['update'])) {
    $id = $_POST['id'];
    $name = $conn->real_escape_string($_POST['name']);
    $email = $conn->real_escape_string($_POST['email']);
    $contact_no = $conn->real_escape_string($_POST['contact_no']);
    $address = $conn->real_escape_string($_POST['address']);
    $age = (int) $_POST['age'];
    $gender = $conn->real_escape_string($_POST['gender']);

    $sql = "UPDATE users 
            SET name='$name', email='$email', contact_no='$contact_no', 
                address='$address', age=$age, gender='$gender'
            WHERE id=$id";
    if ($conn->query($sql)) {
        header('Location: output.php');
    } else {
        echo 'Error: ' . $conn->error;
    }
}
?>
