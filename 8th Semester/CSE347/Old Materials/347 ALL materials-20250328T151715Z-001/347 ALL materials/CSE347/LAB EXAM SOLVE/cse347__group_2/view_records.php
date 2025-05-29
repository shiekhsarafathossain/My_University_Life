<?php
require_once 'config/db_connect.php';

$result = $conn->query('SELECT * FROM course_table');
?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles.css">
  <title>View Records</title>
</head>

<body>
  <h1>All Records</h1>

  <a href="index.php" class="add-record-btn">Return</a>

  <table>
    <thead>
      <tr>
        <th>Course Code</th>
        <th>Course Name</th>
        <th>Credit</th>
        <th>Allocated Sections</th>
      </tr>
    </thead>

    <tbody>
      <?php
      $result = $conn->query('SELECT * FROM course_table');

      while ($row = $result->fetch_assoc()) {
      ?>
        <tr>
          <td><?php echo $row['course_code']; ?></td>
          <td><?php echo $row['course_name']; ?></td>
          <td><?php echo $row['credit']; ?></td>
          <td><?php echo $row['allocated_section']; ?></td>
        </tr>
      <?php } ?>
    </tbody>
  </table>
</body>

</html>
