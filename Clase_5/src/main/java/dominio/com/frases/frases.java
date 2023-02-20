package dominio.com.frases;


import java.util.ArrayList;
import java.util.Random;

public class frases {

	private ArrayList<String> frases2;

	public frases() {
		frases2 = new ArrayList<String>();
		frases2.add("El éxito es un viaje, no un destino.");
		frases2.add("No te rindas, nunca sabes lo cerca que estás del éxito.");
		frases2.add("El éxito no es la clave de la felicidad. La felicidad es la clave del éxito.");
		frases2.add("La motivación es lo que te hace comenzar. El hábito es lo que te hace seguir.");
		frases2.add("No es la más fuerte de las especies la que sobrevive, ni la más inteligente, sino la que mejor se adapta al cambio.");
		frases2.add("El fracaso es la oportunidad de comenzar de nuevo con más inteligencia.");
		frases2.add("La paciencia es una virtud.");
		frases2.add("La vida es 10% lo que te pasa y 90% cómo reaccionas a ello.");
		frases2.add("El éxito es la suma de pequeños esfuerzos repetidos día tras día.");
		frases2.add("La vida es corta, vive intensamente.");
	}

	public String obtenerFraseAleatoria() {
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(frases2.size());
		return frases2.get(numeroAleatorio);
	}

}