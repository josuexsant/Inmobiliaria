package empleados;

import java.util.Date;

public class Empleado {
	
	private int id;
	private String nombre;
	private int edad;
	private String rfc;
	private Date fechaContratacion;
	private String direccion;
	private int nss;
	private String email;
	
	public Empleado(int id, String nombre, int edad, String rfc, Date fechaContratacion, String direccion, int nss, String email) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.rfc = rfc;
		this.fechaContratacion = fechaContratacion;
		this.direccion = direccion;
		this.nss = nss;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
