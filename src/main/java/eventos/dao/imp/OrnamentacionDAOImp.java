package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.Ornamentacion;
import eventos.dao.IOrnamentacionDAO;

public class OrnamentacionDAOImp implements IOrnamentacionDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    
    @Override
    public void save(Ornamentacion ornamentacion) {
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(ornamentacion);
        manager.getTransaction().commit();
    }
    
}
