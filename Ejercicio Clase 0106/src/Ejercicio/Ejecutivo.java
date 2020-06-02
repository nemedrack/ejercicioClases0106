package Ejercicio;

public class Ejecutivo extends Persona {

	String nivelDeEstudios;

	String referencias;

	int añosExperiencia;

	boolean exMilitar;

	public Ejecutivo() {
		super();
	}

	public Ejecutivo(String nivelDeEstudios, String referencias,
			int añosExperiencia, boolean exMilitar) {
		super();
		this.nivelDeEstudios = nivelDeEstudios;
		this.referencias = referencias;
		this.añosExperiencia = añosExperiencia;
		this.exMilitar = exMilitar;
	}

	public Ejecutivo(String _nombre, String _apellido, String _rut,
			String _sexo, String _residencia, boolean _vegetariano,
			String _nivelEstudios) {

		super(_nombre, _apellido, _rut, _sexo, _residencia, _vegetariano,
				_nivelEstudios);

	}

	public String getNivelDeEstudios() {
		return nivelDeEstudios;
	}

	public void setNivelDeEstudios(String nivelDeEstudios) {
		this.nivelDeEstudios = nivelDeEstudios;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	public boolean isExMilitar() {
		return exMilitar;
	}

	public void setExMilitar(boolean exMilitar) {
		this.exMilitar = exMilitar;
	}

}
