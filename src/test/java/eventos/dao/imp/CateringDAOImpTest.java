package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        Catering unCatering = new Catering(4, 500.0);

        cateringDAO.save(unCatering);

        assertEquals(2000.0, unCatering.calcularTotalServicio());
    }
}
