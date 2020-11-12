import java.util.Scanner;

public class ProcesoCubo {
		static Scanner input = new Scanner (System.in);
		static Usuario Usuario1 = new Usuario ("Usuario1",0);
		static Caras caraBlanca = new Caras(0, "blanco", null);
		static Caras caraAzul = new Caras(1, "azul", null) ;
		static Caras caraRoja = new Caras(2, "roja", null) ;
		static Caras caraNaranja = new Caras(3, "Naranja", null) ;
		static Caras caraVerde = new Caras(4, "verde", null) ;
		static Caras caraAmarilla = new Caras(5, "Amarilla", null) ;
	public static void main(String[] args) {
		int modo = 0;
		Usuario1.pedirNombreYEdad();
		Saludar();
		System.out.println("Por favor " + Usuario1.nombre + ", dejanos saber que modo quieres usar" );
		System.out.println("opciones:\n"
				+ "1 - Armar cubo (El cubo se encuentra desarmado)\n"
				+ "2 - Desarmar cubo(El cubo se encuentra armado)");
		if (input.hasNextInt()) {	
			modo = input.nextInt();
			if (modo > 2 || (modo < 1)) {
				System.out.println("Error, por favor ingrese un dato valido");
				System.exit(0);
			}
		}
		else {
			System.out.println("Error, digite un dato valido");
			System.exit(0);
		} 
		EscogerModo(modo);
		
	}
	private static void Saludar() {
		System.out.println("Hola, buen día, bienvenido al programa de cubo rubik");
		System.out.println("Hemos creado esta aplicación pensando en ti " + Usuario1.nombre + ".");
	}
	private static void EscogerModo (int modo) {
		if (modo == 1) {
			caraBlanca.organizada();
			caraAzul.organizada();
			caraRoja.organizada();
			caraNaranja.organizada();
			caraVerde.organizada();
			caraAmarilla.organizada();
		}
		else if (modo == 2) { 
			caraBlanca.desorganizada();
			caraAzul.desorganizada();
			caraRoja.desorganizada();
			caraNaranja.desorganizada();
			caraVerde.desorganizada();
			caraAmarilla.desorganizada();
		}
	} 
	
	
	
}
