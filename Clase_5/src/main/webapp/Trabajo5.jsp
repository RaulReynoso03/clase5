<%@ page import="dominio.com.frases.*"%>
<%@ page import="dominio.com.frases.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Frases aleatorias</title>
</head>
<body>
	<header>
		<h1 align="center">Programacion Modular</h1>
		<hr>
	</header>

	<div>
		<h1>Indice de Frases</h1>
		<section>
			<ul>
				<%
				ImagePhrases frases = new ImagePhrases();
				out.println(frases.getListaFrases());
				%>
			</ul>
			<%
			ImagePhrases imagePhrases = new ImagePhrases();
			String frasesTexto = imagePhrases.getFrasesTexto();
			%>



		</section>
	</div>
	<div>
		<h2>Lista de frases</h2>
		<section>
			<ul>
				<%=frasesTexto%>
			</ul>
		</section>
	</div>

	<main>
		<%
		frases frases2 = new frases();
		String fraseAleatoria = frases2.obtenerFraseAleatoria();
		String fraseAleatoria2 = frases2.obtenerFraseAleatoria();
		%>
		<div>
			<h2>Frase del día número uno</h2>
			<p><%=fraseAleatoria%></p>
		</div>

		<div>
			<h2>Frase del día número dos</h2>
			<p><%=fraseAleatoria2%></p>
		</div>
	</main>
</body>
</html>

