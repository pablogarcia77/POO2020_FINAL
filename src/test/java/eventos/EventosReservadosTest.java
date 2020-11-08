package eventos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.EventosReservados;

class EventosReservadosTest {

	EventosReservados target;
	
	@BeforeEach
	void setUp() throws Exception {
		target = new EventosReservados();
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
	}

    @Test
    @DisplayName("Mostrar Reserva")
	void mostrarReserva() {
		assertNotNull(target);
	}

}
