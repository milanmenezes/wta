<!DOCTYPE html>
<html>
<head>
	<title>Database</title>
</head>
<body>
<?php
$id=$_POST["id"];
$mysql = mysql_connect("localhost","viics57","viics57") or die("cannot connect").mysql_errno()." ".mysql_error();
$res = mysql_db_query("csb3", "Select * from emp_milan where eno=$id");
$a=mysql_fetch_row($res);
echo '<table border="2px solid black"><tr><th>Eno</th><th>Name</th><th>Salary</th></tr>';
echo "<tr><td>$a[0]</td> <td>$a[1]</td> <td>$a[2]</td></tr>";
echo "</table>";
?>
</body>
</html>