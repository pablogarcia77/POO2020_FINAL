package eventos.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Catering;

class CateringTest {

	Catering target;
	
	@BeforeEach
	void setUp() throws Exception {
		target = new Catering(3,500.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
	}

    @Test
    @DisplayName("Calcular Total")
	void getTotal() {
		double precio = target.calcularTotalServicio();
		assertTrue(precio==1500.0);
	}

}