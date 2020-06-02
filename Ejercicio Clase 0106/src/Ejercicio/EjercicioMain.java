package Ejercicio;

import java.util.Scanner;

public class EjercicioMain {
	
	public static void main(String[] args){
		
		int respuestaFinal = 1;
		
		Scanner sc = new Scanner(System.in);
		
		Persona persona = new Persona();
		
		Militar militar1 = new Militar();
		Militar militar2 = new Militar("Mayor", true, true, 15);
		Militar militar3 = new Militar("Armando", "Casas", "18858271-0", "Varon", "Temuco", false, "Media Cumplida");
		
		Ejecutivo ejecutivo = new Ejecutivo();
		Ejecutivo ejecutivo2 = new Ejecutivo("Superior Cumplida Tecnico", "Empresas X", 3, false);
		
		
		do {
			System.out
					.println("Selecciona una opcion para obtener informacion de Muestra.");
			System.out.println("1. Personal Militar");
			System.out.println("2. Personal Ejecutivo");
			String respuesta = sc.next();

			switch (respuesta) {

			case "1":
				System.out.println("Nombre: " + militar3.getNombre());
				System.out.println("Apellido: " + militar3.getApellido());
				System.out.println("Rut: " + militar3.getRut());
				System.out.println("Rango: " + militar2.getRango());
				String habilidad = "";
				if (militar2.sabeDisparar) {
					habilidad = " Disparar-";
					if (militar2.sabePilotear) {
						habilidad = habilidad + "Piloto";
					}
				}
				System.out.println("Habilidades: " + habilidad);
				break;
			case "2":
				System.out.println("Educacion: " + ejecutivo2.nivelDeEstudios);
				System.out.println("Referencias: " + ejecutivo2.referencias);
				System.out.println("Años de experiencia: "
						+ ejecutivo2.añosExperiencia);
				System.out.println("Fue militar?: " + ejecutivo2.exMilitar);
				break;
			default:
				System.out.println("No ha seleccionado una opcion Valida");
				break;
			}
			System.out.println("");
			System.out.println("");
			System.out.println("¿Le gustaria consultar de nuevo?");
			System.out.println("1 Para seguir");
			System.out.println("0 Para Salir");
			System.out.println("Seleccione: ");
			respuesta = sc.next();
			respuestaFinal = Integer.parseInt(respuesta);

			if(respuestaFinal == 0){
				System.out.println("Gracias por su atencion!");
			}
		}while(respuestaFinal != 0);
		
	}

}
