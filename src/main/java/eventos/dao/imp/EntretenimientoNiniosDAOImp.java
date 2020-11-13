package eventos.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.aplicacion.modelo.dominio.EntretenimientoNinios;
import eventos.dao.IEntretenimientoNiniosDAO;

public class EntretenimientoNiniosDAOImp implements IEntretenimientoNiniosDAO{

    public static EntityManager manager;
    public static EntityManagerFactory emf;

	@Override
	public void save(EntretenimientoNinios entretenimientoNinios) {
		emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(entretenimientoNinios);
        manager.getTransaction().commit();
	}
    
}
