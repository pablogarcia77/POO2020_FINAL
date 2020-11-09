package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Cliente;
import eventos.dao.IClienteDAO;

public class ClienteDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarClienteTest(){
        IClienteDAO clienteDAO = new ClienteDAOImp();

        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();

        Cliente unCliente = new Cliente("1","Fulanito","3888123456","fulano@gmail.com");

        clienteDAO.save(unCliente);

        assertEquals("1", ((Cliente)manager.find(Cliente.class, "1")).getId_cliente());
    }
}
