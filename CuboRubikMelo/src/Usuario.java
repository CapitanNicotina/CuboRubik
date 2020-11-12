import java.util.Scanner;
public class Usuario {
	String nombre;
	int edad;
	
	/**
	 * 
	 * @param nombre
	 * @param edad
	 */
	Scanner input = new Scanner(System.in);
	
	public Usuario(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void pedirNombreYEdad () {
		System.out.println("por favor ingresa tu nombre: ");
		this.nombre = input.nextLine();
		System.out.println("Ahora por favor digita tu edad: ");
		this.edad = input.nextInt();
	} 
	
	
	
}
