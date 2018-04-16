<!DOCTYPE html>
<html>
<head>
	<title>Database</title>
</head>
<body>
<form action="p7.php" method="post">
Eno : <input type="text" name="id"/>
<br/>
<br/>
Name : <input type="text" name="name"/>
<br/>
<br/>
Salary : <input type="text" name="salary"/>
<br/>
<br/>

<input type="submit" value="Submit"/>
&nbsp; &nbsp; 
<input type="reset" value="Reset"/>
</form>
<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
$id=$_POST["id"];
$name=$_POST["name"];
$salary=$_POST["salary"];
$mysql = mysql_connect("localhost","viics57","viics57") or die("cannot connect").mysql_errno()." ".mysql_error();
$res = mysql_db_query("csb3", "insert into emp_milan values($id, '$name', $salary)");
echo "<br><h2>Inserted to database sucessfully </h2><br>";
echo "<h1>Table Contents</h1>";
$res1 = mysql_db_query("csb3", "Select * from emp_milan");

echo '<table border="2px solid black"><tr><th>Eno</th><th>Name</th><th>Salary</th></tr>';
while ($a=mysql_fetch_row($res1)) {
	echo "<tr><td>$a[0]</td> <td>$a[1]</td> <td>$a[2]</td></tr>";
}
echo "</table>";
}

?>
</body>
</html>