
public class Cara {
	private char color;
	private byte orientacion;
	private char [][] colorCuadrados = new char [3][3];


	/**
	 * este metodo crea una instancia de una cara
	 * @param orientacion    numero del uno al tres que indica en que posición de la cara en la
	 * impresión que se va a hacer. La cara de la izquierda del primer grupo de 3 caras va a ser 
	 * la cara 0, la siguiente, en sentido horario va a ser la 1 y la que queda es la 2. Para
	 * el segundo grupo de tres caras se repite lo mismo pero empezando desde la cara 4.
	 */
	public Cara(byte orientacion) {

		this.orientacion = orientacion;	

		//		se determina el color de la cara
		switch(orientacion) {
		case 0:
			this.color = 'w';
			break;
		case 1:
			this.color = 'b';
			break;
		case 2:
			this.color = 'r';
			break;
		case 3:
			this.color = 'o';
			break;
		case 4:
			this.color = 'g';
			break;
		case 5:
			this.color = 'y';
			break;
		}


		//		se determinan todos los cuadros de las caras
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				this.colorCuadrados[l][c] = this.color;
			}
		}
	}
	
	
	/**
	 * Se crea una cara sin parametros
	 */
	public Cara() {
	}

	
	/**
	 * Se ingresan los arreglos de todas las caras que se desean imprimir y las imprime 
	 * en la consola
	 * @param whiteFace
	 * @param blueFace
	 * @param redFace
	 * @param orangeFace
	 * @param greenFace
	 * @param yellowFace
	 */
	public static void imprimirCarasEnConsola(Cara whiteFace, Cara blueFace, 
			Cara redFace, Cara orangeFace, Cara greenFace, Cara yellowFace) {

		for(int n=0; n<6; n++) {
			for(int i=0; i<3; i++) {
				for(int e=0; e<3; e++) {
					switch(n){
					case 0:
						System.out.print(whiteFace.colorCuadrados[i][e]);
						if(e==2) {
							System.out.println();
							if(i==2) {
								System.out.println();
							}
						}
						break;
					case 1:
						System.out.print(blueFace.colorCuadrados[i][e]);
						if(e==2) {
							System.out.println();
							if(i==2) {
								System.out.println();
							}
						}
						break;
					case 2:
						System.out.print(redFace.colorCuadrados[i][e]);
						if(e==2) {
							System.out.println();
							if(i==2) {
								System.out.println();
							}
						}
						break;
					case 3:
						System.out.print(orangeFace.colorCuadrados[i][e]);
						if(e==2) {
							System.out.println();
							if(i==2) {
								System.out.println();
							}
						}
						break;
					case 4:
						System.out.print(greenFace.colorCuadrados[i][e]);
						if(e==2) {
							System.out.println();
							if(i==2) {
								System.out.println();
							}
						}
						break;
					case 5:
						System.out.print(yellowFace.colorCuadrados[i][e]);
						if(e==2) {
							System.out.println();
						}
						break;
					}
				}
			}
		}
	}

	
	/**
	 * Imrime La cara que sea seleccionada
	 * @param caraAImprimir
	 */
	public void imprimirCaraEnConsola() {
		for(int i=0; i<3; i++) {
			for(int e=0; e<3; e++) {
				System.out.print(this.colorCuadrados[i][e]);
				if(e==2) {
					System.out.println();

				}
			}
		}

	}

	
	/**
	 * devuelve el color de un cuadrado de una cara en una determinada fila y columna
	 * @param fila
	 * @param columna
	 * @return
	 */
	public char getColorCuadrados(byte fila, byte columna) {
		return colorCuadrados[fila][columna];
	}

	
	/**
	 * determina el color de un cuadrado de una fila y columna
	 * @param fila
	 * @param columna
	 * @param colorCuadrado
	 */
	public void setColorCuadrados(int f, int c, char colorCuadrado) {
		this.colorCuadrados[f][c] = colorCuadrado;
	}

	
	/**
	 * Coge todos los colores de un arreglo 3x3 y los asigna a los colores de la cara
	 * @param arreglo 3x3 del que se sacan los colores
	 */
	public void setAllColors(char[][] colores) {
		for(byte fila=0; fila<3; fila++) {
			for(byte columna=0; columna<3; columna++) {
				colores [fila][columna] = this.getColorCuadrados(fila, columna);
			}
		}
	}

	
	/**
	 * Coge todos los colores de una cara y se los asigna a otra
	 * @param cara de la que se sacan los colores
	 */
	public void setAllColors(Cara cara) {
		for(byte l=0; l<3; l++) {
			for(byte c=0; c<3; c++) {
				this.colorCuadrados[l][c] = cara.getColorCuadrados(l, c);
			}
		}
	}

	
	/**
	 * Le asigna un color seleccionado a todos los espacios de una cara
	 * @param color al cual va a pasar la cara
	 */
	public void setAllColors(char color) {
		for(byte f=0; f<3; f++) {
			for(byte c=0; c<3; c++) {
				this.colorCuadrados[f][c] = color;
			}
		}
	}
	
	
	
		
	
	
}