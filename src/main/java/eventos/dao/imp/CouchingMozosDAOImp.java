package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.CouchingMozos;
import eventos.dao.ICouchingMozosDAO;

public class CouchingMozosDAOImp implements ICouchingMozosDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Override
    public void save(CouchingMozos couchingMozos) {
        // TODO Auto-generated method stub
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(couchingMozos);
        manager.getTransaction().commit();

    }
    
}
