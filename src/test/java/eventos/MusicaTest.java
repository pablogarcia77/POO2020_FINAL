package eventos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Musica;


class MusicaTest {
	
	Musica target;

	@BeforeEach
	void setUp() throws Exception {
		target = new Musica(true,500.0,1000.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
	}

    @Test
    @DisplayName("Calcular Total")
	void getTotal() {
		assertTrue(target.calcularTotalServicio() == 1500.0);
	}

}

