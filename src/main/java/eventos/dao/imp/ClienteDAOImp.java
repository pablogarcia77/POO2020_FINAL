package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.Cliente;
import eventos.dao.IClienteDAO;

public class ClienteDAOImp implements IClienteDAO {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    
    @Override
    public void save(Cliente cliente) {
        // Aquí se pone el código para realizar el acceso a la BD y persistir el Objeto
        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }
    
}
