package biblioteca.modelo.autor;

import javax.persistence.EntityManager;

import biblioteca.negocio.AutorBean;
import biblioteca.util.ConnectionEntityManagerFactory;


public class CreateAutor {
public void create(AutorBean autor) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(autor);
		entityManager.getTransaction().commit();
		entityManager.close();  
	} 

}
