<html>
<head><title>Login</title></head>
<body>
	<?php
		$loginname=$_REQUEST["login"];
		$userpassword=$_REQUEST["password"];
		
			$connection=mysql_connect("localhost","root","");
			$db=mysql_select_db("test",$connection);
			
			$query="Insert into user_login values('$loginname','$userpassword');";
			$result=mysql_query($query);
			
			echo "insert successfully";
			//mysql_close($db);	
		
	?>
</body>
</html>