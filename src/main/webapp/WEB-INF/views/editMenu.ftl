<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Esamo menu redagavimas</title>
	</head>
	<body>
		<form name="menu" action="/FirstProject/updateMenu" method="post">
			<input placeholder="ID"     	type="text"   	name="id"  		value="${menu.id}"><p>
			<input placeholder="Patiekalo grupe"     type="text"   	name="group"  	value="${menu.group}"><p>
			<input placeholder="Patiekalo pavadinimas" type="text"   	name="name" 	value="${menu.name}"><p>
			<input placeholder="Kaloriju skaicius"      type="text" 	name="calory"   	value="${menu.calory}"><p>
			<input placeholder="Kaina"      type="text" 	name="price"   	value="${menu.price}"><p>
			<input type="submit" value="redaguoti">
		</form>
	</body>
</html>
