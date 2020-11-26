package eventos.modelo.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Catering;
import eventos.aplicacion.modelo.dominio.Cliente;
import eventos.aplicacion.modelo.dominio.EventosReservados;
import eventos.aplicacion.modelo.dominio.Musica;
import eventos.aplicacion.modelo.dominio.Reserva;
import eventos.aplicacion.modelo.dominio.Salon;

class EventosReservadosTest {

	EventosReservados target;
	Cliente cliente;
	Salon salon;
	Reserva reserva;
	Catering catering;
	Musica musica;
	
	@BeforeEach
	void setUp() throws Exception {
		double totalReserva = 0.0;
		cliente = new Cliente("12","Pablo","3888525708","pablo@gmail.com");
		salon = new Salon("1","Mitre 33",50,2500.0);
		catering = new Catering(3, 500.0);
		musica = new Musica(true,500.0,1000.0);
		totalReserva += salon.getPrecio() + catering.calcularTotalServicio() + musica.calcularTotalServicio();
		reserva = new Reserva("2", new Date(2020,12,15), totalReserva, 17, 20, false);
		reserva.agregarServicio(catering);
		reserva.agregarServicio(musica);
		target = new EventosReservados(reserva,salon,cliente);
	}

	@AfterEach
	void tearDown() throws Exception {
		cliente = null;
		salon = null;
		catering = null;
		musica = null;
		reserva = null;
		target = null;
	}

    @Test
    @DisplayName("Mostrar Reserva")
	void mostrarReserva() {
		assertNotNull(target);
	}

	@Test
	@DisplayName("CalcularTotal")
	void calcularTotal(){
		double total = target.calcularTotal();
		assertEquals(5500.0, total,0);
	}



}
