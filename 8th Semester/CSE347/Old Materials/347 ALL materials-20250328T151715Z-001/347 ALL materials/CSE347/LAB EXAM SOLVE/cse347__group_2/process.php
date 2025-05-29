<?php
require_once 'config/db_connect.php';

// for edit request
if (isset($_POST['edit'])) {
  $old_course_code = $conn->real_escape_string(
    $_POST['old_course_code']
  );
  $course_code = $conn->real_escape_string(
    $_POST['course_code']
  );
  $course_name = $conn->real_escape_string(
    $_POST['course_name']
  );
  $credit = $conn->real_escape_string(
    $_POST['credit']
  );
  $allocated_section = $conn->real_escape_string(
    $_POST['allocated_section']
  );

  $sql = "
    UPDATE course_table
    SET
      course_code='$course_code',
      course_name='$course_name',
      credit='$credit',
      allocated_section='$allocated_section'
    WHERE course_code='$old_course_code'
  ";

  if ($conn->query($sql)) {
    header("Location: index.php?message=Course+with+code+$course_code+was+successfully+updated");
  } else {
    echo 'Error: ' . $conn->error;
  }
}

// for delete request
if (isset($_POST['delete'])) {
  $course_code = $conn->real_escape_string(
    $_POST['course_code']
  );

  $sql = "DELETE FROM course_table WHERE course_code='$course_code'";

  if ($conn->query($sql)) {
    // redirect with a success message
    header("Location: index.php?message=Course+with+code+$course_code+was+successfully+deleted");
    exit;
  } else {
    // redirect with an error message
    header("Location: index.php?message=Error+deleting+course:+$conn->error");
    exit;
  }
}
