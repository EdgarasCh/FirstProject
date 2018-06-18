<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Patiekalo info</title>
	</head>
	<body class="container">
		<#include "templates/header.ftl">
		<div class="table-responsive">
			<caption>Patiekalo informacija</caption>
			<table class="table table-striped">
				<tr>
					<td><b>Id:</b></td>
					<td>${menu.id}</td>
				</tr>
				<tr>
					<td><b>Grupe:</b></td>
					<td>${menu.group}</td>
				</tr>
				<tr>
					<td><b>Pavadinimas:</b></td>
					<td>${menu.name}</td>
				</tr>
				<tr>
					<td><b>Kalorijos:<b></td>
					<td>${menu.calory}</td>
				</tr>
				<tr>
					<td><b>Kaina:<b></td>
					<td>${menu.price}</td>
				</tr>
			</table>
		</div>
		<br>
		<a type="button" href="/FirstProject/menus" class="button">Atgal</a>
	</body>
</html>
