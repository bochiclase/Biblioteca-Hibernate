package biblioteca.modelo.libro;

import javax.persistence.EntityManager;

import biblioteca.negocio.LibroBean;
import biblioteca.util.ConnectionEntityManagerFactory;

public class CreateLibro {
public void create(LibroBean libro) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(libro);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
