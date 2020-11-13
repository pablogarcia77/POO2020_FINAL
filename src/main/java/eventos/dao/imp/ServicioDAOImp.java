package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.Servicio;
import eventos.dao.IServicioDAO;

public class ServicioDAOImp implements IServicioDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    
    @Override
    public void save(Servicio servicio) {
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(servicio);
        manager.getTransaction().commit();
    }
    
}
