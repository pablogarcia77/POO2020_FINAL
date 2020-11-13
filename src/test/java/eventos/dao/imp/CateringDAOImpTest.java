package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Catering;
import eventos.dao.ICateringDAO;

public class CateringDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarCateringTest() {

        ICateringDAO cateringDAO = new CateringDAOImp();

        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();

        Catering unCatering = new Catering(100, 85.50);

        cateringDAO.save(unCatering);

        // assertTrue("0001" == manager.find(Catering.class, "0001").getId_catering());

    }
}
