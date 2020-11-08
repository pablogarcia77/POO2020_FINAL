package eventos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.EntretenimientoNinios;

class EntretenimientoNiniosTest {
	
	EntretenimientoNinios target;

	@BeforeEach
	void setUp() throws Exception {
		target = new EntretenimientoNinios(true,500.0,15,100.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
	}

    @Test
    @DisplayName("Calcular total")
	void getTotal() {
		assertTrue(target.calcularTotalServicio() == 2000.0);
	}

}
