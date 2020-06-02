package Ejercicio;

public class Militar extends Persona {

	String rango;

	boolean sabePilotear;

	boolean sabeDisparar;

	int añosDeServicio;

	public Militar() {
		super();
	}

	public Militar(String _rango, boolean _sabePilotear, boolean _sabeDisparar,
			int _añosDeServicio) {
		this.rango = _rango;
		this.sabePilotear = _sabePilotear;
		this.sabeDisparar = _sabeDisparar;
		this.añosDeServicio = _añosDeServicio;
	}

	public Militar(String _nombre, String _apellido, String _rut, String _sexo,
			String _residencia, boolean _vegetariano, String _nivelEstudios) {

		super(_nombre, _apellido, _rut, _sexo, _residencia, _vegetariano,
				_nivelEstudios);

	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public boolean isSabePilotear() {
		return sabePilotear;
	}

	public void setSabePilotear(boolean sabePilotear) {
		this.sabePilotear = sabePilotear;
	}

	public boolean isSabeDisparar() {
		return sabeDisparar;
	}

	public void setSabeDisparar(boolean sabeDisparar) {
		this.sabeDisparar = sabeDisparar;
	}

	public int getAñosDeServicio() {
		return añosDeServicio;
	}

	public void setAñosDeServicio(int añosDeServicio) {
		this.añosDeServicio = añosDeServicio;
	}

}
