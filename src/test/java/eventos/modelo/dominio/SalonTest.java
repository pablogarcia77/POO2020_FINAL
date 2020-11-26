package eventos.modelo.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Salon;

class SalonTest {

	Salon target;

	@BeforeEach
	void setUp() throws Exception {
		target = new Salon("1","Mitre 33",50,2500.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		target = null;
	}

	@Test
	void test() {
		assertNotNull(target);
	}

}