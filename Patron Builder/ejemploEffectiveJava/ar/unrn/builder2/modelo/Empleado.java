package ar.unrn.builder2.modelo;

public class Empleado {

	private int id;
	private String nombre;
	private String usuario;

	public Empleado(int id, String nombre, String usuario) {
		
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
	}

	public int getId_user() {
		return this.id;
	}

	public String getName() {
		return this.nombre;
	}

	public String getSurname() {
		return this.usuario;
	}

	public void setId_user(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public void setSurname(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + "]";
	}
}