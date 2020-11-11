package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Salon;
import eventos.dao.ISalonDAO;

public class SalonDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarSalonTest() {
        ISalonDAO salonDAO = new SalonDAOImp();

        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();

        Salon unSalon = new Salon("0001", "9 de Julio 288", 150, 9999.90);

        salonDAO.save(unSalon);

        assertNotNull(manager.find(Salon.class, "0001"));
    }

}
