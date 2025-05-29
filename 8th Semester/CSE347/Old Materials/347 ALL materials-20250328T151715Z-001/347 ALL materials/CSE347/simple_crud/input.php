<?php
require_once 'config/db_connect.php';

// Initialize variables
$id = $name = $email = $contact_no = $address = $age = $gender = '';
$isEdit = false;

// Check if the page is loaded for editing
if (isset($_GET['edit'])) {
    $id = $_GET['edit'];
    $isEdit = true;

    // Fetch record for pre-filling
    $result = $conn->query("SELECT * FROM users WHERE id=$id");
    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        $name = $row['name'];
        $email = $row['email'];
        $contact_no = $row['contact_no'];
        $address = $row['address'];
        $age = $row['age'];
        $gender = $row['gender'];
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Input Page</title>
</head>
<body>
    <h1><?php echo $isEdit ? 'Edit Record' : 'Add New Record'; ?></h1>
    <form action="process.php" method="POST">
      <input type="hidden" name="id" value="<?php echo $id; ?>">

      <label for="name">Name:</label>
      <input type="text" name="name" id="name" value="<?php echo $name; ?>" required>

      <label for="email">Email:</label>
      <input type="email" name="email" id="email" value="<?php echo $email; ?>" required>

      <label for="contact_no">Contact No:</label>
      <input type="text" name="contact_no" id="contact_no" value="<?php echo $contact_no; ?>" required>

      <label for="address">Address:</label>
      <textarea name="address" id="address" required><?php echo $address; ?></textarea>

      <label for="age">Age:</label>
      <input type="number" name="age" id="age" value="<?php echo $age; ?>" required>

      <label for="gender">Gender:</label>
      <select name="gender" id="gender" required>
          <option value="Male" <?php echo ($gender === 'Male') ? 'selected' : ''; ?>>Male</option>
          <option value="Female" <?php echo ($gender === 'Female') ? 'selected' : ''; ?>>Female</option>
          <option value="Other" <?php echo ($gender === 'Other') ? 'selected' : ''; ?>>Other</option>
      </select>

      <button type="submit" name="<?php echo $isEdit ? 'update' : 'save'; ?>">
          <?php echo $isEdit ? 'Update' : 'Save'; ?>
      </button>
    </form>

    <a href="output.php" class="view-records-btn">View All Records</a>
</body>
</html>
