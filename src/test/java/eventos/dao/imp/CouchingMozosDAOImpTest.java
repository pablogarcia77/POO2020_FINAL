package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.CouchingMozos;
import eventos.dao.ICouchingMozosDAO;

public class CouchingMozosDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarCouchingMozosTest() {
        ICouchingMozosDAO mozosDAO = new CouchingMozosDAOImp();
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        CouchingMozos unCouchingMozos = new CouchingMozos(2, 700);
        mozosDAO.save(unCouchingMozos);
        assertEquals(1400, unCouchingMozos.calcularTotalServicio());
    }

}
