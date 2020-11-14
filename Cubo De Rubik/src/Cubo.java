import java.util.Random;

public class Cubo {

	private Cara c0;
	private Cara c1;
	private Cara c2;
	private Cara c3;
	private Cara c4;
	private Cara c5;
	public Cara [] caras = new Cara[6];
	public final char [] COLORES = {'w', 'b', 'r', 'o', 'g', 'y'};



	/**
	 * crea un cubo y un arreglo que contiene las caras
	 * @param c0
	 * @param c1
	 * @param c2
	 * @param c3
	 * @param c4
	 * @param c5
	 */
	public Cubo(Cara c0, Cara c1, Cara c2, Cara c3, Cara c4, Cara c5) {
		this.c0 = c0;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.caras[0] = c0;
		this.caras[1] = c1;
		this.caras[2] = c2;
		this.caras[3] = c3;
		this.caras[4] = c4;
		this.caras[5] = c5;
	}

	
	/**
	 * ejecuta un movimiento en sentido horario sobre la cara que se le indique
	 * @param # de cara
	 */
	public void horario(byte orientacion) {
		//		Se crea una cara con la información de la cara del primer movimiento
		Cara caraExtra = new Cara();
		char cuadradoExtra = ' ';
		byte revez;

		switch (orientacion){
		//		si la cara es blanca se ejecuta este codigo
		case 0:

			caraExtra.setAllColors(c3);     //se determina la cara extra
			//			movimiento 1
			for(byte c=0; c<3; c++) {
				this.c3.setColorCuadrados(c, 2, this.c4.getColorCuadrados((byte)0, c));
			}

			//			movimiento 2
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(0, c, this.c2.getColorCuadrados(revez, (byte)0));
				revez--;
			}

			//			movimiento 3
			for(byte c=0; c<3; c++) {
				this.c2.setColorCuadrados(c, 0, this.c1.getColorCuadrados((byte)2, c));
			}

			//			movimiento 4
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados(2, c, caraExtra.getColorCuadrados(revez, (byte)2));
				revez--;
			}

			//			movimiento 5 (esquinas)
			cuadradoExtra = c0.getColorCuadrados((byte)0, (byte)0);
			this.c0.setColorCuadrados(0, 0, this.c0.getColorCuadrados((byte)2, (byte)0));
			this.c0.setColorCuadrados(2, 0, this.c0.getColorCuadrados((byte)2, (byte)2));
			this.c0.setColorCuadrados(2, 2, this.c0.getColorCuadrados((byte)0, (byte)2));
			this.c0.setColorCuadrados(0, 2, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c0.getColorCuadrados((byte)1, (byte)0);
			this.c0.setColorCuadrados(1, 0, this.c0.getColorCuadrados((byte)2, (byte)1));
			this.c0.setColorCuadrados(2, 1, this.c0.getColorCuadrados((byte)1, (byte)2));
			this.c0.setColorCuadrados(1, 2, this.c0.getColorCuadrados((byte)0, (byte)1));
			this.c0.setColorCuadrados(0, 1, cuadradoExtra);
			break;

			//		si la cara es azul se ejecuta este codigo
		case 1:
			//			se determina la cara extra
			caraExtra.setAllColors(c5);
			for(byte c=0; c<3; c++) {
				//				movimiento 1
				this.c5.setColorCuadrados(0, c, this.c3.getColorCuadrados((byte)0, c));
			}
			for(byte c=0; c<3; c++) {
				//				movimiento 2
				this.c3.setColorCuadrados(0, c, this.c0.getColorCuadrados((byte)0, c));
			}
			for(byte c=0; c<3; c++) {
				//				movimiento 3
				this.c0.setColorCuadrados(0, c, this.c2.getColorCuadrados((byte)0, c));
			}
			for(byte c=0; c<3; c++) {
				//				movimiento 4
				this.c2.setColorCuadrados(0, c,caraExtra.getColorCuadrados((byte)0, c));
			}

			//			movimiento 5 (esquinas)
			cuadradoExtra = c1.getColorCuadrados((byte)0, (byte)0);
			this.c1.setColorCuadrados(0, 0, this.c1.getColorCuadrados((byte)2, (byte)0));
			this.c1.setColorCuadrados(2, 0, this.c1.getColorCuadrados((byte)2, (byte)2));
			this.c1.setColorCuadrados(2, 2, this.c1.getColorCuadrados((byte)0, (byte)2));
			this.c1.setColorCuadrados(0, 2, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c1.getColorCuadrados((byte)1, (byte)0);
			this.c1.setColorCuadrados(1, 0, this.c1.getColorCuadrados((byte)2, (byte)1));
			this.c1.setColorCuadrados(2, 1, this.c1.getColorCuadrados((byte)1, (byte)2));
			this.c1.setColorCuadrados(1, 2, this.c1.getColorCuadrados((byte)0, (byte)1));
			this.c1.setColorCuadrados(0, 1, cuadradoExtra);
			break;

			//		si la cara es rojo se ejecuta este codigo
		case 2:
			caraExtra.setAllColors(c1);		//se determina la cara extra

			//			movimiento 1
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados(c, 2, this.c0.getColorCuadrados(c, (byte)2));
			}

			//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c0.setColorCuadrados(c, 2, this.c4.getColorCuadrados(c, (byte)2));
			}

			//			movimiento 3
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(c, 2, this.c5.getColorCuadrados(revez, (byte)0));
				revez--;
			}

			//			movimiento 4
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c5.setColorCuadrados(c, 0,caraExtra.getColorCuadrados(revez, (byte)2));
				revez--;
			}

			//			movimiento 5 (esquinas)
			cuadradoExtra = c2.getColorCuadrados((byte)0, (byte)0);
			this.c2.setColorCuadrados(0, 0, this.c2.getColorCuadrados((byte)2, (byte)0));
			this.c2.setColorCuadrados(2, 0, this.c2.getColorCuadrados((byte)2, (byte)2));
			this.c2.setColorCuadrados(2, 2, this.c2.getColorCuadrados((byte)0, (byte)2));
			this.c2.setColorCuadrados(0, 2, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c2.getColorCuadrados((byte)1, (byte)0);
			this.c2.setColorCuadrados(1, 0, this.c2.getColorCuadrados((byte)2, (byte)1));
			this.c2.setColorCuadrados(2, 1, this.c2.getColorCuadrados((byte)1, (byte)2));
			this.c2.setColorCuadrados(1, 2, this.c2.getColorCuadrados((byte)0, (byte)1));
			this.c2.setColorCuadrados(0, 1, cuadradoExtra);
			break;

			//		si la cara es naranja se ejecuta este codigo
		case 3:
			//			se determina la cara extra
			caraExtra.setAllColors(c4);

			//			movimiento 1
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(c, 0, this.c0.getColorCuadrados(c, (byte)0));
			}

			//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c0.setColorCuadrados(c, 0, this.c1.getColorCuadrados(c, (byte)0));
			}

			//			movimiento 3
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados(c, 0, this.c5.getColorCuadrados(revez, (byte)2));
				revez--;
			}

			//			movimiento 4
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c5.setColorCuadrados(c, 2, caraExtra.getColorCuadrados(revez, (byte)0));
				revez--;
			}

			//			movimiento 5 (esquinas)
			cuadradoExtra = c3.getColorCuadrados((byte)0, (byte)0);
			this.c3.setColorCuadrados(0, 0, this.c3.getColorCuadrados((byte)2, (byte)0));
			this.c3.setColorCuadrados(2, 0, this.c3.getColorCuadrados((byte)2, (byte)2));
			this.c3.setColorCuadrados(2, 2, this.c3.getColorCuadrados((byte)0, (byte)2));
			this.c3.setColorCuadrados(0, 2, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c3.getColorCuadrados((byte)1, (byte)0);
			this.c3.setColorCuadrados(1, 0, this.c3.getColorCuadrados((byte)2, (byte)1));
			this.c3.setColorCuadrados(2, 1, this.c3.getColorCuadrados((byte)1, (byte)2));
			this.c3.setColorCuadrados(1, 2, this.c3.getColorCuadrados((byte)0, (byte)1));
			this.c3.setColorCuadrados(0, 1, cuadradoExtra);			
			break;

			//		si la cara es verde se ejecuta este codigo
		case 4:
			//			se determina la cara extra
			caraExtra.setAllColors(c0);

			//				movimiento 1
			for(byte c=0; c<3; c++) {	
				this.c0.setColorCuadrados(2, c, this.c3.getColorCuadrados((byte)2, c));
			}

			//				movimiento 2
			for(byte c=0; c<3; c++) {	
				this.c3.setColorCuadrados(2, c, this.c5.getColorCuadrados((byte)2, c));
			}

			//				movimiento 3
			for(byte c=0; c<3; c++) {
				this.c5.setColorCuadrados(2, c, this.c2.getColorCuadrados((byte)2, c));
			}

			//				movimiento 4
			for(byte c=0; c<3; c++) {
				this.c2.setColorCuadrados(2, c, caraExtra.getColorCuadrados((byte)2, c));
			}

			//			movimiento 5 (esquinas)
			cuadradoExtra = c4.getColorCuadrados((byte)0, (byte)0);
			this.c4.setColorCuadrados(0, 0, this.c4.getColorCuadrados((byte)2, (byte)0));
			this.c4.setColorCuadrados(2, 0, this.c4.getColorCuadrados((byte)2, (byte)2));
			this.c4.setColorCuadrados(2, 2, this.c4.getColorCuadrados((byte)0, (byte)2));
			this.c4.setColorCuadrados(0, 2, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c4.getColorCuadrados((byte)1, (byte)0);
			this.c4.setColorCuadrados(1, 0, this.c4.getColorCuadrados((byte)2, (byte)1));
			this.c4.setColorCuadrados(2, 1, this.c4.getColorCuadrados((byte)1, (byte)2));
			this.c4.setColorCuadrados(1, 2, this.c4.getColorCuadrados((byte)0, (byte)1));
			this.c4.setColorCuadrados(0, 1, cuadradoExtra);			
			break;

			//		si la cara es amarilla se ejecuta este codigo
		case 5:
			//			se determina la cara extra
			caraExtra.setAllColors(c3);
			//			movimiento 1
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c3.setColorCuadrados(c, 0, this.c1.getColorCuadrados((byte)0, revez));
				revez--;
			}

			//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados(0, c, this.c2.getColorCuadrados(c, (byte)2));
			}

			//			movimiento 3
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c2.setColorCuadrados(c, 2, this.c4.getColorCuadrados((byte)2, revez));
				revez--;
			}

			//			movimiento 4
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(2, c, caraExtra.getColorCuadrados(c, (byte)0));
			}

			//			movimiento 5 (esquinas)
			cuadradoExtra = c5.getColorCuadrados((byte)0, (byte)0);
			this.c5.setColorCuadrados(0, 0, this.c5.getColorCuadrados((byte)2, (byte)0));
			this.c5.setColorCuadrados(2, 0, this.c5.getColorCuadrados((byte)2, (byte)2));
			this.c5.setColorCuadrados(2, 2, this.c5.getColorCuadrados((byte)0, (byte)2));
			this.c5.setColorCuadrados(0, 2, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c5.getColorCuadrados((byte)1, (byte)0);
			this.c5.setColorCuadrados(1, 0, this.c5.getColorCuadrados((byte)2, (byte)1));
			this.c5.setColorCuadrados(2, 1, this.c5.getColorCuadrados((byte)1, (byte)2));
			this.c5.setColorCuadrados(1, 2, this.c5.getColorCuadrados((byte)0, (byte)1));
			this.c5.setColorCuadrados(0, 1, cuadradoExtra);			
			break;
		}
	}

	
	/**
	* ejecuta un movimiento en sentido horario sobre la cara que se le indique
	 * @param # de cara
	 */
	public void antiHorario(byte orientacion) {
		//		Se crea una cara con la información de la cara del primer movimiento
		Cara caraExtra = new Cara();
		char cuadradoExtra = ' ';
		byte revez;

		switch (orientacion){
		//		si la cara es blanca se ejecuta este codigo
		case 0:
			caraExtra.setAllColors(c4);     //se determina la cara extra
			
			//			movimiento 1
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(0, c, this.c3.getColorCuadrados(c, (byte)2));
			}

//			movimiento 4
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c3.setColorCuadrados(revez, 2, this.c1.getColorCuadrados((byte)2, c));
				revez--;
			}
			
			//			movimiento 3
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados(2, c, this.c2.getColorCuadrados(c, (byte)0));
			}

			//			movimiento 2
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c2.setColorCuadrados(revez, 0, caraExtra.getColorCuadrados((byte)0, c));
				revez--;
			}
			

			//			movimiento 5 (esquinas)
			cuadradoExtra = c0.getColorCuadrados((byte)0, (byte)0);
//			movimiento 1
			this.c0.setColorCuadrados(0, 0, this.c0.getColorCuadrados((byte)0, (byte)2));
//			movimiento 2
			this.c0.setColorCuadrados(0, 2, this.c0.getColorCuadrados((byte)2, (byte)2));
//			movimiento 3
			this.c0.setColorCuadrados(2, 2, this.c0.getColorCuadrados((byte)2, (byte)0));
//			movimiento 4
			this.c0.setColorCuadrados(2, 0, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c0.getColorCuadrados((byte)1, (byte)0);
//			movimiento 1
			this.c0.setColorCuadrados(1, 0, this.c0.getColorCuadrados((byte)0, (byte)1));
//			movimiento 2
			this.c0.setColorCuadrados(0, 1, this.c0.getColorCuadrados((byte)1, (byte)2));
//			movimiento 3
			this.c0.setColorCuadrados(1, 2, this.c0.getColorCuadrados((byte)2, (byte)1));
//			movimiento 4
			this.c0.setColorCuadrados(2, 1, cuadradoExtra);
			break;

			//		si la cara es azul se ejecuta este codigo
		case 1:
			//			se determina la cara extra
			caraExtra.setAllColors(c3);

			//				movimiento 1
			for(byte c=0; c<3; c++) {
				this.c3.setColorCuadrados(0, c, this.c5.getColorCuadrados((byte)0, c));
			}
			//				movimiento 4
			for(byte c=0; c<3; c++) {
				this.c5.setColorCuadrados(0, c, this.c2.getColorCuadrados((byte)0, c));
			}

			//				movimiento 3
			for(byte c=0; c<3; c++) {
				this.c2.setColorCuadrados(0, c, this.c0.getColorCuadrados((byte)0, c));
			}
//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c0.setColorCuadrados(0, c, caraExtra.getColorCuadrados((byte)0, c));
			}
			

//			movimiento 5 (esquinas)
			cuadradoExtra = c1.getColorCuadrados((byte)0, (byte)0);
//			movimiento 1
			this.c1.setColorCuadrados(0, 0, this.c1.getColorCuadrados((byte)0, (byte)2));
//			movimiento 2
			this.c1.setColorCuadrados(0, 2, this.c1.getColorCuadrados((byte)2, (byte)2));
//			movimiento 3
			this.c1.setColorCuadrados(2, 2, this.c1.getColorCuadrados((byte)2, (byte)0));
//			movimiento 4
			this.c1.setColorCuadrados(2, 0, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c1.getColorCuadrados((byte)1, (byte)0);
//			movimiento 1
			this.c1.setColorCuadrados(1, 0, this.c1.getColorCuadrados((byte)0, (byte)1));
//			movimiento 2
			this.c1.setColorCuadrados(0, 1, this.c1.getColorCuadrados((byte)1, (byte)2));
//			movimiento 3
			this.c1.setColorCuadrados(1, 2, this.c1.getColorCuadrados((byte)2, (byte)1));
//			movimiento 4
			this.c1.setColorCuadrados(2, 1, cuadradoExtra);
			break;

			//		si la cara es rojo se ejecuta este codigo
		case 2:
			caraExtra.setAllColors(c0);		//se determina la cara extra
			
			//			movimiento 1
			for(byte c=0; c<3; c++) {
				this.c0.setColorCuadrados(c, 2, this.c1.getColorCuadrados(c, (byte)2));
			}
//			movimiento 4
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados(c, 2, this.c5.getColorCuadrados(revez, (byte)0));
				revez--;
			}

			//			movimiento 3
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c5.setColorCuadrados(c, 0, this.c4.getColorCuadrados(revez, (byte)2));
				revez--;
			}

			//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(c, 2, caraExtra.getColorCuadrados(c, (byte)2));
			}

			

//			movimiento 5 (esquinas)
			cuadradoExtra = c2.getColorCuadrados((byte)0, (byte)0);
//			movimiento 1
			this.c2.setColorCuadrados(0, 0, this.c2.getColorCuadrados((byte)0, (byte)2));
//			movimiento 2
			this.c2.setColorCuadrados(0, 2, this.c2.getColorCuadrados((byte)2, (byte)2));
//			movimiento 3
			this.c2.setColorCuadrados(2, 2, this.c2.getColorCuadrados((byte)2, (byte)0));
//			movimiento 4
			this.c2.setColorCuadrados(2, 0, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c2.getColorCuadrados((byte)1, (byte)0);
//			movimiento 1
			this.c2.setColorCuadrados(1, 0, this.c2.getColorCuadrados((byte)0, (byte)1));
//			movimiento 2
			this.c2.setColorCuadrados(0, 1, this.c2.getColorCuadrados((byte)1, (byte)2));
//			movimiento 3
			this.c2.setColorCuadrados(1, 2, this.c2.getColorCuadrados((byte)2, (byte)1));
//			movimiento 4
			this.c2.setColorCuadrados(2, 1, cuadradoExtra);
			break;

			//		si la cara es naranja se ejecuta este codigo
		case 3:
			//			se determina la cara extra
			caraExtra.setAllColors(c0);

			//			movimiento 1
			for(byte c=0; c<3; c++) {
				this.c0.setColorCuadrados(c, 0, this.c4.getColorCuadrados(c, (byte)0));
			}

			//			movimiento 4
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(c, 0, this.c5.getColorCuadrados(revez, (byte)2));
				revez--;
			}
		
			//			movimiento 3
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c5.setColorCuadrados(c, 2, this.c1.getColorCuadrados(revez, (byte)0));
				revez--;
			}
			
			//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados(c, 0, caraExtra.getColorCuadrados(c, (byte)0));
			}



//			movimiento 5 (esquinas)
			cuadradoExtra = c3.getColorCuadrados((byte)0, (byte)0);
//			movimiento 1
			this.c3.setColorCuadrados(0, 0, this.c3.getColorCuadrados((byte)0, (byte)2));
//			movimiento 2
			this.c3.setColorCuadrados(0, 2, this.c3.getColorCuadrados((byte)2, (byte)2));
//			movimiento 3
			this.c3.setColorCuadrados(2, 2, this.c3.getColorCuadrados((byte)2, (byte)0));
//			movimiento 4
			this.c3.setColorCuadrados(2, 0, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c3.getColorCuadrados((byte)1, (byte)0);
//			movimiento 1
			this.c3.setColorCuadrados(1, 0, this.c3.getColorCuadrados((byte)0, (byte)1));
//			movimiento 2
			this.c3.setColorCuadrados(0, 1, this.c3.getColorCuadrados((byte)1, (byte)2));
//			movimiento 3
			this.c3.setColorCuadrados(1, 2, this.c3.getColorCuadrados((byte)2, (byte)1));
//			movimiento 4
			this.c3.setColorCuadrados(2, 1, cuadradoExtra);
			break;

			//		si la cara es verde se ejecuta este codigo
		case 4:
			//			se determina la cara extra
			caraExtra.setAllColors(c3);

			//				movimiento 1
			for(byte c=0; c<3; c++) {	
				this.c3.setColorCuadrados(2, c, this.c0.getColorCuadrados((byte)2, c));
			}
//			movimiento 4
			for(byte c=0; c<3; c++) {
				this.c0.setColorCuadrados(2, c, this.c2.getColorCuadrados((byte)2, c));
			}
//			movimiento 3
			for(byte c=0; c<3; c++) {
				this.c2.setColorCuadrados(2, c, this.c5.getColorCuadrados((byte)2, c));
			}
			//				movimiento 2
			for(byte c=0; c<3; c++) {	
				this.c5.setColorCuadrados(2, c, caraExtra.getColorCuadrados((byte)2, c));
			}

			
			

//			movimiento 5 (esquinas)
			cuadradoExtra = c4.getColorCuadrados((byte)0, (byte)0);
//			movimiento 1
			this.c4.setColorCuadrados(0, 0, this.c4.getColorCuadrados((byte)0, (byte)2));
//			movimiento 2
			this.c4.setColorCuadrados(0, 2, this.c4.getColorCuadrados((byte)2, (byte)2));
//			movimiento 3
			this.c4.setColorCuadrados(2, 2, this.c4.getColorCuadrados((byte)2, (byte)0));
//			movimiento 4
			this.c4.setColorCuadrados(2, 0, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c4.getColorCuadrados((byte)1, (byte)0);
//			movimiento 1
			this.c4.setColorCuadrados(1, 0, this.c4.getColorCuadrados((byte)0, (byte)1));
//			movimiento 2
			this.c4.setColorCuadrados(0, 1, this.c4.getColorCuadrados((byte)1, (byte)2));
//			movimiento 3
			this.c4.setColorCuadrados(1, 2, this.c4.getColorCuadrados((byte)2, (byte)1));
//			movimiento 4
			this.c4.setColorCuadrados(2, 1, cuadradoExtra);
			break;

			//		si la cara es amarilla se ejecuta este codigo
		case 5:
			//			se determina la cara extra
			caraExtra.setAllColors(c1);
			//			movimiento 1
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c1.setColorCuadrados((byte)0, revez, this.c3.getColorCuadrados(c, (byte)0));
				revez--;
			}
//			movimiento 4
			for(byte c=0; c<3; c++) {
				this.c3.setColorCuadrados(c, (byte)0, this.c4.getColorCuadrados((byte)2, c));
			}

//			movimiento 3
			revez = 2;
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados((byte)2, revez, this.c2.getColorCuadrados(c, (byte)2));
				revez--;
			}
			//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c2.setColorCuadrados(c, (byte)2, caraExtra.getColorCuadrados((byte)0, c));
			}


//			movimiento 5 (esquinas)
			cuadradoExtra = c5.getColorCuadrados((byte)0, (byte)0);
//			movimiento 1
			this.c5.setColorCuadrados(0, 0, this.c5.getColorCuadrados((byte)0, (byte)2));
//			movimiento 2
			this.c5.setColorCuadrados(0, 2, this.c5.getColorCuadrados((byte)2, (byte)2));
//			movimiento 3
			this.c5.setColorCuadrados(2, 2, this.c5.getColorCuadrados((byte)2, (byte)0));
//			movimiento 4
			this.c5.setColorCuadrados(2, 0, cuadradoExtra);

			//			movimiento 6(aristas)
			cuadradoExtra = c5.getColorCuadrados((byte)1, (byte)0);
//			movimiento 1
			this.c5.setColorCuadrados(1, 0, this.c5.getColorCuadrados((byte)0, (byte)1));
//			movimiento 2
			this.c5.setColorCuadrados(0, 1, this.c5.getColorCuadrados((byte)1, (byte)2));
//			movimiento 3
			this.c5.setColorCuadrados(1, 2, this.c5.getColorCuadrados((byte)2, (byte)1));
//			movimiento 4
			this.c5.setColorCuadrados(2, 1, cuadradoExtra);
			break;
		default:
			System.out.println("Error: esta cara no exite, y no se pueden hacer cambios sobre ella");
		}
	}

	
	/**
	 * reestablece todas las caras del cubo
	 */
	public void armar() {
		this.c0.setAllColors('w');
		this.c1.setAllColors('b');
		this.c2.setAllColors('r');
		this.c3.setAllColors('o');
		this.c4.setAllColors('g');
		this.c5.setAllColors('y');
	}
	
	
	/**
	 * establece un algoritmo con un numero n de movimientos y retorna un string
	 *  con el algoritmo para desarmar el cubo y con el algoritmo para resolver el cubo
	 *  el ultimo en formato de texto o en notación
	 * @param numero n de movimientos que va a tener el algoritmo
	 * @param numero 0 para devolver un algoritmo de resolución en notación y
	 * 1 para devolver un algoritmo de resolución en texto
	 * @return
	 */
	public String desarmar(int nMovimientos, byte instrucciones) {
		int [] algoritmo = new int[nMovimientos];
		int [] algoritmoInvertido = new int[nMovimientos];
		Random random = new Random();
		
//		se determinan los movimientos del algoritmo para desarmar aleatoriamente y los
//		movimientos contradictorios y repetidos 3 veces se eliminan
		int movimientoAnterior=1;
		int preMovimientoAnterior = 1;
		for(int i=0; i<nMovimientos; i++) {
			algoritmo[i] = random.nextInt(12);
			while(movimientoAnterior == algoritmo[i]+6 || movimientoAnterior == algoritmo[i]-6){
				algoritmo[i] = random.nextInt(12);
			}
			while(preMovimientoAnterior == movimientoAnterior && movimientoAnterior == algoritmo[i]) {
				algoritmo[i] = random.nextInt(12);
			}
			movimientoAnterior = algoritmo[i];
			if(i>0) preMovimientoAnterior = algoritmo [i-1];
			
		}
		
//		se arma el cubo
		this.armar();
		
//		se ejecuta el argoritmo sobre el cubo armado
		for(byte i=0; i<nMovimientos; i++) {
			switch(algoritmo[i]) {
			case 0:
				this.horario((byte)0);
				break;
				
			case 1:
				this.horario((byte)1);
				break;
				
			case 2:
				this.horario((byte)2);
				break;
				
			case 3:
				this.horario((byte)3);
				break;
				
			case 4:
				this.horario((byte)4);
				break;
				
			case 5:
				this.horario((byte)5);
				break;
				
			case 6:
				this.antiHorario((byte)0);
				break;
				
			case 7:
				this.antiHorario((byte)1);
				break;
				
			case 8:
				this.antiHorario((byte)2);
				break;
				
			case 9:
				this.antiHorario((byte)3);
				break;
				
			case 10:
				this.antiHorario((byte)4);
				break;
				
			case 11:
				this.antiHorario((byte)5);
				break;
			}
		}
		
		
//		se consigue el algoritmo para desarmar (aplicar el algoritmo)
		String instruccionesArmar = "";
		for(int i=0; i<nMovimientos; i++) {
			if(i > 0 && i < nMovimientos) {
				instruccionesArmar += ", ";
			}
			switch(algoritmo[i]) {
			case 0:
				instruccionesArmar += "F";
				break;
				
			case 1:
				instruccionesArmar += "U";
				break;
				
			case 2:
				instruccionesArmar += "R";
				break;
				
			case 3:
				instruccionesArmar += "L";
				break;
				
			case 4:
				instruccionesArmar += "D";
				break;
				
			case 5:
				instruccionesArmar += "B";
				break;
				
			case 6:
				instruccionesArmar += "F'";
				break;
				
			case 7:
				instruccionesArmar += "U'";
				break;
				
			case 8:
				instruccionesArmar += "R'";
				break;
				
			case 9:
				instruccionesArmar += "L'";
				break;
				
			case 10:
				instruccionesArmar += "D'";
				break;
				
			case 11:
				instruccionesArmar += "B'";
				break;
			}
		}
		instruccionesArmar += "\n";		
		
		
//		se creal el algoritmo para resolver el cubo
		int aI = nMovimientos-1;
		for(int a=0; a<nMovimientos; a++) {
			algoritmoInvertido[a] = algoritmo[aI];
			aI--;
		}
		switch(instrucciones) {
		case 1: 
			for(int i=0; i<nMovimientos; i++) {
				switch(algoritmoInvertido[i]) {
				case 0:
					instruccionesArmar += String.format("%2d. Gira la cara blanca en sentido anti-horario\n", i+1);
					break;
					
				case 1:
					instruccionesArmar += String.format("%2d. Gira la cara azul en sentido anti-horario\n", i+1);
					break;
					
				case 2:
					instruccionesArmar += String.format("%2d. Gira la cara roja en sentido anti-horario\n", i+1);
					break;
					
				case 3:
					instruccionesArmar += String.format("%2d. Gira la cara naranja en sentido anti-horario\n", i+1);
					break;
					
				case 4:
					instruccionesArmar += String.format("%2d. Gira la cara verde en sentido anti-horario\n", i+1);
					break;
					
				case 5:
					instruccionesArmar += String.format("%2d. Gira la cara amarilla en sentido anti-horario\n", i+1);
					break;
					
				case 6:
					instruccionesArmar += String.format("%2d. Gira la cara blanca en sentido horario\n", i+1);
					break;
					
				case 7:
					instruccionesArmar += String.format("%2d. Gira la cara azul en sentido horario\n", i+1);
					break;
					
				case 8:
					instruccionesArmar += String.format("%2d. Gira la cara roja en sentido horario\n", i+1);
					break;
					
				case 9:
					instruccionesArmar += String.format("%2d. Gira la cara naranja en sentido horario\n", i+1);
					break;
					
				case 10:
					instruccionesArmar += String.format("%2d. Gira la cara verde en sentido horario\n", i+1);
					break;
					
				case 11:
					instruccionesArmar += String.format("%2d. Gira la cara amarilla en sentido horario\n", i+1);
					break;
				}
			}
			break;
		case 0: 
			for(int i=0; i<nMovimientos; i++) {
				if(i > 0 && i < nMovimientos) {
					instruccionesArmar += ", ";
				}
				switch(algoritmoInvertido[i]) {
				case 6:
					instruccionesArmar += "F";
					break;
					
				case 7:
					instruccionesArmar += "U";
					break;
					
				case 8:
					instruccionesArmar += "R";
					break;
					
				case 9:
					instruccionesArmar += "L";
					break;
					
				case 10:
					instruccionesArmar += "D";
					break;
					
				case 11:
					instruccionesArmar += "B";
					break;
					
				case 0:
					instruccionesArmar += "F'";
					break;
					
				case 1:
					instruccionesArmar += "U'";
					break;
					
				case 2:
					instruccionesArmar += "R'";
					break;
					
				case 3:
					instruccionesArmar += "L'";
					break;
					
				case 4:
					instruccionesArmar += "D'";
					break;
					
				case 5:
					instruccionesArmar += "B'";
					break;
				}
			}
			break;
		}
		
		
		return instruccionesArmar;
	}
	
	
	
	
	
	
	
}