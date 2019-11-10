package biblioteca.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Autor")
public class AutorBean {
	
	@Id
	@Column(name="Codigo_autor")
	private int Codigo;
	@Column(name ="Nombre")
	private String Nombre;
	
	
	/*RELACIONES*/
	
	/*Libro*/
	
	@ManyToMany(mappedBy="Autores")
	private List <LibroBean> Libros = new ArrayList <LibroBean>();


	public int getCodigo() {
		return Codigo;
	}


	public void setCodigo(int codigo) {
		Codigo = codigo;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public List<LibroBean> getLibros() {
		return Libros;
	}


	public void setLibros(List<LibroBean> libros) {
		Libros = libros;
	}
	
	
	
}
