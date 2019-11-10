package biblioteca.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class UsuarioBean {
	@Id
	@Column(name="Codigo_usuario")
	private int Codigo;
	@Column(name="Nombre")
	private String Nombre;
	@Column(name="Telefono")
	private String Telefono;
	@Column(name="Direccion")
	private String Direccion;
	
	/*Relaciones*/
	
	@OneToMany(mappedBy="Usuario")
	private List <SacarBean> Prestamos = new ArrayList <SacarBean>();
	
	public void addPrestamos(SacarBean sacar) {
		if(!Prestamos.contains(sacar)) {
			Prestamos.add(sacar);
			sacar.setUsuario(this);
		}
	}

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

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public List<SacarBean> getPrestamos() {
		return Prestamos;
	}

	public void setPrestamos(List<SacarBean> prestamos) {
		Prestamos = prestamos;
	}
	
}
