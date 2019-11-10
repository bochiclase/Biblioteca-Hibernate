package biblioteca.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Libros")
public class LibroBean {
	@Id
	@Column(name="Codigo_libro")
	private int Codigo;
	@Column(name="Titulo")
	private String Titulo;
	@Column(name ="ISBN")
	private String ISBN;
	@Column(name ="Editorial")
	private String Editorial;
	@Column(name ="Paginas")
	private int Paginas;
	
	/*Relacones*/
	
	
	/*Autores*/
	
	@ManyToMany
	private List <AutorBean> Autores = new ArrayList <AutorBean>();
	
	public void addAutor(AutorBean autor) {
		if(!Autores.contains(autor)) {
			Autores.add(autor);
			List <LibroBean> libros= autor.getLibros();
			if(!libros.contains(this)) {
				libros.add(this);
				autor.setLibros(libros);
			}
		}
	}
	
	/*Ejemplar*/
	
	@OneToMany(mappedBy="Libro")
	private List <EjemplarBean> Ejemplares = new ArrayList <EjemplarBean>();
	
	public void addEjemplares(EjemplarBean ejemplar) {
		if(!Ejemplares.contains(ejemplar)) {
			Ejemplares.add(ejemplar);
			ejemplar.setLibro(this);
		}
	}

	
	
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getPaginas() {
		return Paginas;
	}

	public void setPaginas(int paginas) {
		Paginas = paginas;
	}

	public List<AutorBean> getAutores() {
		return Autores;
	}

	public void setAutores(List<AutorBean> autores) {
		Autores = autores;
	}

	public List<EjemplarBean> getEjemplares() {
		return Ejemplares;
	}

	public void setEjemplares(List<EjemplarBean> ejemplares) {
		Ejemplares = ejemplares;
	}
	
	
}
