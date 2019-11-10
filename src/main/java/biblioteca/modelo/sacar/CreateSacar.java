package biblioteca.modelo.sacar;

import javax.persistence.EntityManager;


import biblioteca.negocio.SacarBean;
import biblioteca.util.ConnectionEntityManagerFactory;

public class CreateSacar {
public void create(SacarBean sacar) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(sacar);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
