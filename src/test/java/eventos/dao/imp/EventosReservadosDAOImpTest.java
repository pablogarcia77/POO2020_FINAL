package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Salon salon = new Salon("1", "Mitre 33", 50, 2500.0);
        Cliente cliente = new Cliente("1", "Pedro", "3888450035", "pedro@gmail.com");
        Reserva reserva = new Reserva("1", new Date(1, 1, 1), 9999.99, 17, 21, true);
        IEventosReservadosDAO eventoResDAO = new EventosReservadosDAOImp();
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        EventosReservados unEventoRes = new EventosReservados(reserva, salon, cliente);

        eventoResDAO.save(unEventoRes);

        // assertTrue("0001" == unEventoRes.reservas.get(1).getId_reserva());

    }
}
