<!DOCTYPE html>
<html>
<head>
	<title>Array</title>
</head>
<body>
<?php
$en = array(1,2,3,4,5 );
$as = array('A' => 1, 'B' => 2);
echo "<p>Using enumerated array:<br>";
foreach ($en as $k) {
 echo "$k &nbsp;";
}
echo "<p>Using associative array:<br>";
foreach ($as as $k => $v) {
	echo "Key: $k and value: $v <br>";
}

?>
</body>
</html>