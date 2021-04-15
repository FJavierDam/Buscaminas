package logica;

import java.util.ArrayList;
import java.util.Random;

import modelo.Coordenada;

public class GeneradorMinas {

	public ArrayList<Coordenada> sortearPosiciones(int minas, int longitud) {
		
		int xAleatoria=0;
		int yAleatoria=0;
		
		assert minas > 0 && longitud > 0;
		assert minas < longitud * longitud;

		ArrayList<Coordenada> retorno = new ArrayList<Coordenada>();

		Random aleatorio = new Random();

		Coordenada matriz[][] = new Coordenada[longitud][longitud];


		for (int i = 0; i < minas; i++) {
			xAleatoria = aleatorio.nextInt(longitud);
			yAleatoria = aleatorio.nextInt(longitud);

			Coordenada cordAleatoria = new Coordenada(xAleatoria, yAleatoria);
			retorno.add(cordAleatoria);

		}

		return retorno;
	}

}
