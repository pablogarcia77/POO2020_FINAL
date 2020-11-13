package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.Reserva;
import eventos.dao.IReservaDAO;

public class ReservaDAOImp implements IReservaDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    
    @Override
    public void save(Reserva reserva) {
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(reserva);
        manager.getTransaction().commit();
    }
    
}
