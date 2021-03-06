package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.Catering;
import eventos.dao.ICateringDAO;

public class CateringDAOImp implements ICateringDAO {
    
    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Override
    public void save(Catering catering) {
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(catering);
        manager.getTransaction().commit();

    }
    
}
