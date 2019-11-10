package biblioteca.start;

import biblioteca.modelo.autor.CreateAutor;
import biblioteca.modelo.ejemplar.CreateEjemplar;
import biblioteca.modelo.libro.CreateLibro;
import biblioteca.modelo.sacar.CreateSacar;
import biblioteca.modelo.usuario.CreateUsusario;
import biblioteca.negocio.AutorBean;
import biblioteca.negocio.EjemplarBean;
import biblioteca.negocio.LibroBean;
import biblioteca.negocio.SacarBean;
import biblioteca.negocio.UsuarioBean;

public class start {

	public static void main(String[] args) {
		AutorBean autor1 = new AutorBean();
		autor1.setCodigo(1);
		autor1.setNombre("Arturo Perez Rebelte");
		
		AutorBean autor2 = new AutorBean();
		autor2.setCodigo(2);
		autor2.setNombre("Elvira Lindo");
		
		SacarBean sacar1 = new SacarBean();
		sacar1.setCodigo(1);
		sacar1.setFecha_prestamo("12-5-19");
		sacar1.setFecha_entrega("12-4-20");
		
		SacarBean sacar2 = new SacarBean();
		sacar2.setCodigo(2);
		sacar2.setFecha_entrega("21-2-19");
		sacar2.setFecha_prestamo("12-5-20");
		
		UsuarioBean user1 = new UsuarioBean();
		user1.setCodigo(1);
		user1.setNombre("Pedro");
		user1.setTelefono("123123123");
		user1.setDireccion("Oviedo");
		user1.addPrestamos(sacar1);
		
		
		UsuarioBean user2 = new UsuarioBean();
		user2.setCodigo(2);
		user2.setNombre("Manolo");
		user2.setTelefono("456456456");
		user2.setDireccion("Siero");
		user2.addPrestamos(sacar2);
		
		EjemplarBean ejem1 = new EjemplarBean();
		ejem1.setCodigo(1);
		ejem1.setLocalizacion("Estanteria 1C");
		ejem1.addPrestamos(sacar1);
		
		
		EjemplarBean ejem2 = new EjemplarBean();
		ejem2.setCodigo(2);
		ejem2.setLocalizacion("Estanteria 2D");
		ejem2.addPrestamos(sacar2);
		
		
		LibroBean libro1 = new LibroBean();
		libro1.setCodigo(1);
		libro1.setTitulo("La guarida del perro sarnoso");
		libro1.setISBN("12334567890");
		libro1.setEditorial("SM");
		libro1.setPaginas(312);
		libro1.addAutor(autor1);
		libro1.addEjemplares(ejem1);
		
		
		LibroBean libro2 = new LibroBean();
		libro2.setCodigo(2);
		libro2.setTitulo("Manolito Gafotas");
		libro2.setISBN("0987654321");
		libro2.setEditorial("Altaya");
		libro2.setPaginas(150);
		libro2.addAutor(autor2);
		libro2.addEjemplares(ejem2);
		
		
		
		
		
		
		
		
		
		CreateAutor agregar_autor = new CreateAutor();
		agregar_autor.create(autor1);
		agregar_autor.create(autor2);
		
		CreateLibro agregar_libro = new CreateLibro();
		agregar_libro.create(libro1);
		agregar_libro.create(libro2);
		
		CreateUsusario agregar_user = new CreateUsusario();
		agregar_user.create(user1);
		agregar_user.create(user2);
		
		
		CreateEjemplar agregar_ejemplar = new CreateEjemplar();
		agregar_ejemplar.create(ejem1);
		agregar_ejemplar.create(ejem2);
		
		CreateSacar agregar_sacar = new CreateSacar();
		agregar_sacar.create(sacar1);
		agregar_sacar.create(sacar2);
		
		
		
	}

}
