<?php
require_once 'config/db_connect.php';

// initialize variables
$course_code = $course_name = $credit = $allocated_section = '';
$message = isset($_GET['message']) ? $_GET['message'] : '';


if (isset($_POST['search'])) {
  $search_course_code = $conn->real_escape_string(
    $_POST['course_code']
  );

  // fetch record for pre-filling
  $result = $conn->query("SELECT * FROM course_table WHERE course_code='$search_course_code'");

  if ($result->num_rows > 0) {
    echo $result->num_rows;

    $row = $result->fetch_assoc();

    $course_code = $search_course_code;
    $course_name = $row['course_name'];
    $credit = $row['credit'];
    $allocated_section = $row['allocated_section'];
  } else {
    // if no record is found, set the message
    $message = "Course with code $search_course_code was not found.";
  }
}

// check if the page is loaded for editing
if (isset($_POST['edit'])) {
  // fetch record for pre-filling
  $result = $conn->query("SELECT * FROM course_table WHERE course_code='$course_code'");

  if ($result->num_rows > 0) {
    $row = $result->fetch_assoc();

    $course_code = $row['course_code'];
    $course_name = $row['course_name'];
    $credit = $row['credit'];
    $allocated_section = $row['allocated_section'];
  }
}
?>


<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles.css">
  <title>Home</title>
</head>

<body>
  <!-- display message if it exists -->
  <?php if (!empty($message)): ?>
    <div class="message">
      <?php echo htmlspecialchars($message); ?>
    </div>
  <?php endif; ?>

  <h1>Enter Course Code:</h1>

  <form action="index.php" method="POST">
    <input type="text" name="course_code" id="course_code" value="<?php echo $course_code; ?>">

    <button type="submit" name="search">Submit</button>
  </form>

  <h1>Course Information</h1>

  <form action="process.php" method="POST">
    <input type="text" name="old_course_code" id="old_course_code" value="<?php echo $course_code; ?>" hidden>

    <label for="course_code">Course Code:</label>
    <input type="text" name="course_code" id="course_code" value="<?php echo $course_code; ?>">

    <label for="course_name">Course Name:</label>
    <input type="text" name="course_name" id="course_name" value="<?php echo $course_name; ?>">

    <label for="credit">Credit:</label>
    <input type="text" name="credit" id="credit" value="<?php echo $credit; ?>" required>

    <label for="allocated_section">Allocated Sections:</label>
    <input type="number" name="allocated_section" id="allocated_section" value="<?php echo $allocated_section; ?>" required>

    <button type="submit" name="edit">Edit</button>
    <button type="submit" name="delete">Delete</button>
  </form>

  <a href="view_records.php" class="view-records-btn">View All Records</a>
</body>

</html>
