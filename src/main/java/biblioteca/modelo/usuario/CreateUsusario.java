package biblioteca.modelo.usuario;

import javax.persistence.EntityManager;


import biblioteca.negocio.UsuarioBean;
import biblioteca.util.ConnectionEntityManagerFactory;

public class CreateUsusario {
public void create(UsuarioBean usuario) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(usuario);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
