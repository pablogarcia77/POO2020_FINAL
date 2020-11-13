package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.Musica;
import eventos.dao.IMusicaDAO;

public class MusicaDAOImp implements IMusicaDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    
    @Override
    public void save(Musica musica) {
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(musica);
        manager.getTransaction().commit();
    }
    
}
