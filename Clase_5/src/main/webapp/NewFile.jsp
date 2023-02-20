<%@ page import="dominio.com.frases.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Indice de Frases</title>
</head>
<body>
	<h1>Indice de Frases</h1>
	<ul>
		<%
		ImagePhrases frases = new ImagePhrases();
			out.println(frases.mostrarEnlaces());
		%>
	</ul>
</body>
</html>

