<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Menu</title>
	</head>
	<body>
		<h1>Siandienos meniu</h1>
		<table>
			<tr>
				<th>Id</th>
				<th>Patiekalo grupe</th>
				<th>Patiekalo pavadinimas</th>
				<th>Kaloriju skaicius</th>
				<th>Kaina</th>
			</tr>
			<#list menus as menu>
				<tr>
					<td><a href="/FirstProject/menu/${menu.id}">${menu.id}</a></td>
					<td>${menu.group}</td>
					<td>${menu.name}</td>
					<td>${menu.calory}</td>
					<td>${menu.price}</td>
					<td><a href="/FirstProject/delete/${menu.id}">Trinti</a></td>
					<td><a href="/FirstProject/update/${menu.id}">Redaguoti</a></td>
				</tr>
			</#list>
		</table>
		<p>
		<a href="/FirstProject/addMenu">Sukurti</a>
	</body>
</html>
