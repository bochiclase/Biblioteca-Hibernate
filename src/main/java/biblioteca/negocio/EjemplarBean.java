package biblioteca.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Ejemplar")
public class EjemplarBean {
	
	@Id
	@Column(name="Codigo_ejemplar")
	private int Codigo;
	@Column(name="Localizacion")
	private String Localizacion;
	
	
	/*Relaciones*/
	
	/*Libros*/
	@ManyToOne
	private LibroBean Libro;
	
	
	/*Sacar*/
	@OneToMany(mappedBy = "Ejemplar")
	private List<SacarBean> Prestamos = new ArrayList <SacarBean>();
	
	public void addPrestamos(SacarBean saque) {
		if(!Prestamos.contains(saque)) {
			Prestamos.add(saque);
			saque.setEjemplar(this);
		}
	}

	
	
	public int getCodigo() {
		return Codigo;
	}


	public void setCodigo(int codigo) {
		Codigo = codigo;
	}



	public String getLocalizacion() {
		return Localizacion;
	}



	public void setLocalizacion(String localizacion) {
		Localizacion = localizacion;
	}



	public LibroBean getLibro() {
		return Libro;
	}


	public void setLibro(LibroBean libro) {
		Libro = libro;
	}



	public List<SacarBean> getPrestamos() {
		return Prestamos;
	}



	public void setPrestamos(List<SacarBean> prestamos) {
		Prestamos = prestamos;
	}
	
	
	
}
