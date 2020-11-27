package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Catering;
import eventos.aplicacion.modelo.dominio.Servicio;
import eventos.dao.IServicioDAO;

public class ServicioDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarServicioTest() {

        IServicioDAO servicioDAO = new ServicioDAOImp();

        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();

        Servicio unServicio = new Catering("1", "Servicio Completo", 5000.0, 2, 500.0);

        servicioDAO.save(unServicio);

        assertEquals("1", manager.find(Servicio.class, "1").getId_servicio());

    }

}