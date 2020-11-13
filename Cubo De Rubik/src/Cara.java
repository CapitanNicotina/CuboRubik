
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

	public Cara() {
	}

	/**
	 * Se ingresan los arreglos de todas las caras y las imprime en la consola
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

	public char getColorCuadrados(byte fila, byte columna) {
		return colorCuadrados[fila][columna];
	}

	public void setColorCuadrados(int f, int c, char colorCuadrado) {
		this.colorCuadrados[f][c] = colorCuadrado;
	}

	
	public void absorverColores(char[][] colores) {
		for(byte fila=0; fila<3; fila++) {
			for(byte columna=0; columna<3; columna++) {
				colores [fila][columna] = this.getColorCuadrados(fila, columna);
			}
		}
	}

	/**
	 * coje todos los colores de una cara y se los asigna a otra
	 * @param cara de la que se sacan los colores
	 */
	public void setAllColors(Cara cara) {
		for(byte l=0; l<3; l++) {
			for(byte c=0; c<3; c++) {
				this.colorCuadrados[l][c] = cara.getColorCuadrados(l, c);
			}
		}
	}


}