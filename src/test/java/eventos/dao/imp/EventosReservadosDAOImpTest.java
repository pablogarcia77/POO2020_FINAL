package eventos.dao.imp;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Cliente;
import eventos.aplicacion.modelo.dominio.EventosReservados;
import eventos.aplicacion.modelo.dominio.Reserva;
import eventos.aplicacion.modelo.dominio.Salon;
import eventos.dao.IEventosReservadosDAO;

public class EventosReservadosDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarEventoReservadoTest() {
        IEventosReservadosDAO eventoResDAO = new EventosReservadosDAOImp();
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        EventosReservados unEventoRes = new EventosReservados(
                new Reserva("0001", new Date(0, 0, 0), 9999.99, true, 0.0, 17, 21, true), new Salon(), new Cliente());
        eventoResDAO.save(unEventoRes);
        // assertEquals("0001", manager.find(EventosReservados.class,
        // "0001").reservas.get(0).getId_reserva());
        System.out.println(manager.find(EventosReservados.class, "0001").reservas.get(0).getId_reserva());
    }
}
