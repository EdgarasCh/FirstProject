<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Naujo patiekalo sukurimas</title>
	</head>
	<body>
		<@spring.bind "menu"/>
        <#if noErrors??>
            Ivesti duomenys<br>
            Grupe: 	${menu.group}<br>
            Pavadinimas: ${menu.name}<br>
            Kalorijos: 		${menu.calory}<p>
            Kaina: 		${menu.price}<p>            
            <a href="/FirstProject/menus">Rodyti meniu</a>
        <#else>		
			<form name="menu" action="/FirstProject/addMenu" 	method="post">
				Id:<br>
				<@spring.formInput "menu.id"/>
                <@spring.showErrors "<br>"/><p>
				Grupe:<br>
				<@spring.formInput "menu.group"/>
                <@spring.showErrors "<br>"/><p>
				Pavadinimas:<br>
			    <@spring.formInput "menu.name"/>
            	<@spring.showErrors "<br>"/><p>
				Kalorijos:<br>
				<@spring.formInput "menu.calory"/>
            	<@spring.showErrors "<br>"/><p>
            	Kaina:<br>
				<@spring.formInput "menu.price"/>
            	<@spring.showErrors "<br>"/><p>
				<input type="submit" value="prideti">
			</form>
		</#if>
	</body>
</html>
