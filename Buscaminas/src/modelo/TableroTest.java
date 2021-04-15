package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableroTest {

	@Test
	void test() {

		Dificultad dificultades[] = { Dificultad.facil, Dificultad.medio, Dificultad.dificil };
		Tablero tablero;
		for (Dificultad dificultad : dificultades) {
			tablero = new Tablero(dificultad.getLongitud());
			assertEquals(dificultad.getLongitud(), tablero.getAncho());
			assertEquals(dificultad.getLongitud(), tablero.getAlto());

		}

	}

}
