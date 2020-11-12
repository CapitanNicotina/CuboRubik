
public class Main {

	public static void main(String[] args) {

		/*	esto no sirve para nada pero es para que vea que numero de cara 
		 *  epresenta cada cara: 	  0   1   2   3   4   5           
					                 'w','b','r','o','g','y'  */

		/* w = white (blanco)
		 * b = blue (azul)
		 * r = red (rojo)
		 * o = orange (naranja)
		 * g = green (verde)
		 * y = yellow (amarillo)
		 */




		//		aquí se declaran todas las instancias de la clase "Cara"
		//		osea las 6 caras basicamente


		Cara wFace = new Cara((byte)0);
		Cara bFace = new Cara((byte)1);
		Cara rFace = new Cara((byte)2);
		Cara oFace = new Cara((byte)3);
		Cara gFace = new Cara((byte)4);
		Cara yFace = new Cara((byte)5);

		Cubo cubo = new Cubo(wFace, bFace, rFace, oFace, gFace, yFace);

		cubo.horario((byte)0);
//		cubo.horario((byte)1);
//		cubo.horario((byte)2);
//		cubo.horario((byte)3);
//		cubo.horario((byte)4);
//		cubo.horario((byte)5);
		


		//		se imprimen todas las caras
		Cara.imprimirCarasEnConsola(wFace, bFace, rFace, oFace, gFace, yFace);
		System.out.println();
		


	}


}