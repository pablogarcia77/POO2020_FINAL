package eventos.modelo.dominio;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

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
		Servicio servicio1 = new Catering(3, 500.0);
		Reserva target = new Reserva();
		target.agregarServicio(servicio1);

		assertTrue(target.calcularTotalReserva() == 1500.0);
	}

	@Test
	@DisplayName("Calcular el Saldo")
	void getSaldo() {
		Reserva reserva = new Reserva("2", new Date(2020, 12, 15), 10700.0, 3000.0, 17, 20, false);
		assertEquals(7700.0, reserva.calcularSaldo());
	}
}
