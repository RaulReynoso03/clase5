package dominio.com.frases;
public class ImagePhrases {
	private String[] frases = {
		"El éxito es un viaje, no un destino.",
		"No te rindas, nunca sabes lo cerca que estás del éxito.",
		"El éxito no es la clave de la felicidad. La felicidad es la clave del éxito.",
		"La motivación es lo que te hace comenzar. El hábito es lo que te hace seguir.",
		"No es la más fuerte de las especies la que sobrevive, ni la más inteligente, sino la que mejor se adapta al cambio.",
		"El fracaso es la oportunidad de comenzar de nuevo con más inteligencia.",
		"La paciencia es una virtud.",
		"La vida es 10% lo que te pasa y 90% cómo reaccionas a ello.",
		"El éxito es la suma de pequeños esfuerzos repetidos día tras día.",
		"La vida es corta, vive intensamente."
	};

	public String[] getFrases() {
		return frases;
	}

	public String getListaFrases() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < frases.length; i++) {
			sb.append("<li><a target='_blank' href='img/img" + (i + 1) + ".jpg'>" + frases[i] + "</a></li>");
		}
		return sb.toString();
	}
	public String getFrasesTexto() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < frases.length; i++) {
			sb.append("<li>" + frases[i] + "</li>");
		}
		return sb.toString();
	}
}

