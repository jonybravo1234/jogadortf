<?php

/* $host = "localhost";
$user = "root";
$pass = "";
$database = "teste";
$connection = mysql_connect($host, $user, $pass) or die (mysql_error());
mysql_select_db($database) or die(mysql_error());
 */

	$connect = mysql_connect("localhost","root","");
	$db = mysql_select_db ("teste");



?>
