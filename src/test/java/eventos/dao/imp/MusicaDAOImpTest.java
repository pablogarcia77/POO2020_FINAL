package eventos.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import eventos.aplicacion.modelo.dominio.Musica;
import eventos.dao.IMusicaDAO;

public class MusicaDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

    @Test
    public void agregarMusicaTest() {
        IMusicaDAO musicaDAO = new MusicaDAOImp();

        emf = Persistence.createEntityManagerFactory("eventos");
        manager = emf.createEntityManager();

        Musica unaMusica = new Musica(true, 5000.0, 5000.0);

        musicaDAO.save(unaMusica);

        assertEquals(10000, unaMusica.calcularTotalServicio());
    }
}
