package Ejercicio;
public class Persona {

	String nombre;

	String apellido;

	String rut;

	String sexo;

	String Residencia;

	boolean vegetariano;

	String nivelEstudios;

	public Persona() {

	}

	public Persona(String _nombre, String _apellido, String _rut, String _sexo,
			String _residencia, boolean _vegetariano, String _nivelEstudios) {
		super();
		this.nombre = _nombre;
		this.apellido = _apellido;
		this.rut = _rut;
		this.sexo = _sexo;
		this.Residencia = _residencia;
		this.vegetariano = _vegetariano;
		this.nivelEstudios = _nivelEstudios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getResidencia() {
		return Residencia;
	}

	public void setResidencia(String residencia) {
		Residencia = residencia;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public String getNivelEstudios() {
		return nivelEstudios;
	}

	public void setNivelEstudios(String nivelEstudios) {
		this.nivelEstudios = nivelEstudios;
	}

}
