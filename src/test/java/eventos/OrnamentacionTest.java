package eventos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Ornamentacion;


class OrnamentacionTest {
	
	Ornamentacion target;

	@BeforeEach
	void setUp() throws Exception {
		target = new Ornamentacion(2,2000.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
	}

    @Test
    @DisplayName("Calcular total")
	void getTotal() {
		assertTrue(target.calcularTotalServicio() == 4000.0);
	}

}
