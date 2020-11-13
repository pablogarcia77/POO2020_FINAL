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

    // private final class ServicioExtension extends Servicio {
    //     private ServicioExtension(String id_servicio, String descripcion, double precio) {
    //     }

    //     @Override
    //     public double calcularTotalServicio() {
    //         return 0;
    //     }
    // }

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarServicioTest() {

        IServicioDAO servicioDAO = new ServicioDAOImp();

        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();

        // Servicio unServicio = new ServicioExtension("0001", "Servicio Completo", 3500.00);
        Servicio unServicio = new Catering("0001", "Servicio Completo", 3500.00,2,500.0);

        servicioDAO.save(unServicio);

        assertEquals("0001", manager.find(Servicio.class, "0001").getId_servicio());

    }

}