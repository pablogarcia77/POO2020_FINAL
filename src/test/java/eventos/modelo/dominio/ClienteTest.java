package eventos.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Cliente;
import eventos.aplicacion.modelo.dominio.Reserva;

class ClienteTest {

	Cliente target;
	Reserva reserva;

	@BeforeEach
	void setUp() throws Exception {
		target = new Cliente("1", "Pedro", "3888450035", "pedro@gmail.com");
		reserva = new Reserva("001", new Date(2020, 11, 10), 12.899, 17, 23, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
		reserva = null;
	}

	@Test
	@DisplayName("Obtener Datos")
	void testObtenerDatos() {
		assertNotNull(target);
	}

	@Test
	@DisplayName("Agregar Reserva")
	void testAgregarReserva() {
		reserva = new Reserva("002", new Date(2020, 11, 15), 15000.0, 14, 23, true);
		target.agregarReserva(reserva);
		assertTrue(target.verReservas().size() == 1);
	}

	@Test
	@DisplayName("Ver Reservas")
	void testVerReservas() {
		target.agregarReserva(reserva);
		assertFalse(target.verReservas().size() == 0);
	}

	@Test
	@DisplayName("Comprobar cliente")
	void testComprobarCliente() {
		assertEquals("1", target.getId_cliente());
	}

}
