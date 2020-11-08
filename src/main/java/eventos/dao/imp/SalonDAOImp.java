package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.Salon;
import eventos.dao.ISalonDAO;

public class SalonDAOImp implements ISalonDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    
    @Override
    public void save(Salon salon) {
        // TODO Auto-generated method stub
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(salon);
        manager.getTransaction().commit();
    }
    
}
