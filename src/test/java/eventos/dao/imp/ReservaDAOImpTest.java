package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Reserva;
import eventos.dao.IReservaDAO;

public class ReservaDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarReservaTest() {
        IReservaDAO reservaDAO = new ReservaDAOImp();

        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();

        Reserva unaReserva = new Reserva("0001", new Date(), 9999.99, true, 0.0, 17, 21, true);

        reservaDAO.save(unaReserva);

        assertEquals("0001", manager.find(Reserva.class, "0001").getId_reserva());

    }

}
