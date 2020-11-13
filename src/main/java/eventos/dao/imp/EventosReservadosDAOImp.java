package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.EventosReservados;
import eventos.dao.IEventosReservadosDAO;

public class EventosReservadosDAOImp implements IEventosReservadosDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    
    @Override
    public void save(EventosReservados eventosReservados) {
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(eventosReservados);
        manager.getTransaction().commit();
    }
    
}
