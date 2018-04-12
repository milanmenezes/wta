<!DOCTYPE html>
<html>
<head>
	<title>First php</title>
</head>
<body>
<?php
echo "Usnig pre version <br>";
echo "Name: ".$HTTP_GET_VARS['name']."<br>";
echo "Age: ".$HTTP_GET_VARS['age']."<br>";
echo "Usnig post version <br>";
echo "Name: ".$_GET['name']."<br>";
echo "Age: ".$_GET['age']."<br>";
?>
</body>
</html>