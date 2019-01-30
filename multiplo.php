<?php
$texto = '';
$numero1 = 0;
$numero2 = 0;

if(isset($_POST["numero1"])){
	$numero1 = $_POST["numero1"];
}
if(isset($_POST["numero2"])){
	$numero2 = $_POST["numero2"];
}

if(isset($_POST["comprobar"])){
	$texto = comprobar($numero1, $numero2);
}

function comprobar($dividendo, $divisor) {
	if($divisor == 0){
        	return " NO ES multiplo de ";
    	}
    	else{
		if ($dividendo % $divisor == 0) {
			return " ES multiplo de ";
		} else {
			return " NO ES multiplo de ";
		}
	}
}

function mostrar($text){
	echo $text;
}
?>

<!DOCTYPE html>
<html>
	<head>
		<title>Multiplo</title>
		<meta name="description" content="" />
		<meta name="author" content="rafa" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>

		<form action="" method="post">
			<p>
				Veamos si un número es múltiplo de otro.<br>
				<input type="number" name="numero1" value="<?php echo $numero1; ?>"> <?php mostrar($texto); ?> <input type="number" name="numero2" value="<?php echo $numero2; ?>">
			</p>
			<p>
				<input type="submit" name="comprobar" value="Comprobar">
			</p>
		</form>

	</body>
</html>
