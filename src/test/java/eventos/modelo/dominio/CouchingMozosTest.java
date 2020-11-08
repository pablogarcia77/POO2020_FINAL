package eventos.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.CouchingMozos;

class CouchingMozosTest {
	
	CouchingMozos target;

	@BeforeEach
	void setUp() throws Exception {
		target = new CouchingMozos(10,200.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
	}

    @Test
    @DisplayName("Calcular Total")
	void getTotal() {
		assertTrue(target.calcularTotalServicio() == 2000.0);
	}

}
