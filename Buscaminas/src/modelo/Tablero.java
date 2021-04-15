package modelo;

import java.util.ArrayList;

import logica.GeneradorMinas;
import modelo.Dificultad;

public class Tablero {

	private GeneradorMinas generadorMinas;
	private Casilla[][] casillas;

	public Tablero(int lado, ArrayList<Coordenada> minas) {
		this(lado);
		colocarMinas(minas);
	}

	private void colocarMinas(ArrayList<Coordenada> retorno) {
		
	}

	public Tablero(int lado) {
		this(lado, lado);
	}

	public Tablero(int ancho, int alto) {
		assert ancho > 0 && alto > 0;
	}

	public int getAlto() {
		return casillas.length;
	}

	public int getAncho() {
		return casillas[0].length;
	}

}
