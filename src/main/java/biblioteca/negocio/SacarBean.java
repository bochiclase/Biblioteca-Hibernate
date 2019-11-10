package biblioteca.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Usuarios_Ejemplares")
public class SacarBean {
	
	@Id
	@Column(name="Codigo_prestamo")
	private int Codigo;
	@Column(name="Fecha_prestamo")
	private String Fecha_prestamo;
	@Column(name="Fecha_entrega")
	private String Fecha_entrega;
	
	
	
	/*Relaciones*/
	
	@ManyToOne
	private EjemplarBean Ejemplar;
	
	@ManyToOne
	private UsuarioBean Usuario;

	
	
	
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getFecha_prestamo() {
		return Fecha_prestamo;
	}

	public void setFecha_prestamo(String fecha_prestamo) {
		Fecha_prestamo = fecha_prestamo;
	}

	public String getFecha_entrega() {
		return Fecha_entrega;
	}

	public void setFecha_entrega(String fecha_entrega) {
		Fecha_entrega = fecha_entrega;
	}

	public EjemplarBean getEjemplar() {
		return Ejemplar;
	}

	public void setEjemplar(EjemplarBean ejemplar) {
		Ejemplar = ejemplar;
	}

	public UsuarioBean getUsuario() {
		return Usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		Usuario = usuario;
	}
	
	
	
}
