<!DOCTYPE html>
<html>
<head>
	<title>User defined function</title>
</head>
<body>
<?php
function abc(){
	$as = array('A' => 1, 'B' => 2);
	return $as;
}

$a=abc();
echo '<table border="2px solid black"><tr><th>Key</th><th>Value</th></tr>';
foreach ($a as $k => $v) {
	echo "<tr><td>$k</td> <td>$v</td></tr>";
}
echo "</table>";
?>
</body>
</html>