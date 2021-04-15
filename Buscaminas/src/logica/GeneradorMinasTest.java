package logica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Coordenada;
import modelo.Dificultad;

class GeneradorMinasTest {

	@Test
	void testSortearPosiciones() {
		Dificultad dificultad = Dificultad.facil;
		int minas = 2;
		GeneradorMinas generadorMinas = new GeneradorMinas();
		ArrayList<Coordenada> posiciones = generadorMinas.sortearPosiciones(minas, dificultad.getLongitud());

		assertEquals(minas, posiciones.size());

		for (int i = 0; i < posiciones.size(); i++) {
			for (int j = i + 1; j < posiciones.size(); j++) {
				if (posiciones.get(i).equals(posiciones.get(j))) {
					fail("coordenada repetida");
				}

			}

		}
	}
}
