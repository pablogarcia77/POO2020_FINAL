package eventos.modelo.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Catering;
import eventos.aplicacion.modelo.dominio.Reserva;
import eventos.aplicacion.modelo.dominio.Servicio;


class ReservaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

    @Test
    @DisplayName("Calcular Total de Reserva")
	void getTotalReserva() {
		Servicio servicio1 = new Catering(3,500.0);
		Reserva target = new Reserva();
		target.agregarServicio(servicio1);
		
		assertTrue(target.calcularTotalReserva() == 1500.0);
	}

}

