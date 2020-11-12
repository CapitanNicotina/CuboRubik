
public class Cubo {

	private Cara c0;
	private Cara c1;
	private Cara c2;
	private Cara c3;
	private Cara c4;
	private Cara c5;



	public Cubo(Cara c0, Cara c1, Cara c2, Cara c3, Cara c4, Cara c5) {
		super();
		this.c0 = c0;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
	}

	public void horario(byte orientacion) {
//		Se crea una cara con la información de la cara del primer movimiento
		Cara caraExtra = new Cara();
		char cuadradoExtra = ' ';
		byte revez = 2;
		
		switch (orientacion){
//		si la cara es blanca se ejecuta este codigo
		case 0:

			caraExtra.setAllColors(c3);     //se determina la cara extra
			for(byte c=0; c<3; c++) {
//				movimiento 1
				this.c3.setColorCuadrados(c, 2, this.c4.getColorCuadrados((byte)0, c));
			}
			
//			movimiento 2
			for(byte c=0; c<3; c++) {
				this.c4.setColorCuadrados(0, c, this.c2.getColorCuadrados(revez, (byte)0));
			}
			
			for(byte c=0; c<3; c++) {
//				movimiento 3
				this.c2.setColorCuadrados(c, 0, this.c1.getColorCuadrados((byte)2, c));
			}
			
			for(byte c=0; c<3; c++) {
//				movimiento 4
				this.c1.setColorCuadrados(2, c, caraExtra.getColorCuadrados(revez, (byte)2));
				revez-=1;
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
//			se determina la cara extra
			caraExtra.setAllColors(c1);
			for(byte c=0; c<3; c++) {
//				movimiento 1
				this.c1.setColorCuadrados(c, 2, this.c0.getColorCuadrados(c, (byte)2));

//				movimiento 2
				this.c0.setColorCuadrados(c, 2, this.c4.getColorCuadrados(c, (byte)2));

//				movimiento 3
				this.c4.setColorCuadrados(c, 2, this.c5.getColorCuadrados(c, (byte)2));

//				movimiento 4
				this.c5.setColorCuadrados(c, 2,caraExtra.getColorCuadrados(c, (byte)2));
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
			for(byte c=0; c<3; c++) {
//				movimiento 1
				this.c4.setColorCuadrados(c, 0, this.c0.getColorCuadrados(c, (byte)0));

//				movimiento 2
				this.c0.setColorCuadrados(c, 0, this.c1.getColorCuadrados(c, (byte)0));

//				movimiento 3
				this.c1.setColorCuadrados(c, 0, this.c5.getColorCuadrados(c, (byte)0));

//				movimiento 4
				this.c5.setColorCuadrados(c, 0, caraExtra.getColorCuadrados(c, (byte)0));
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
			for(byte c=0; c<3; c++) {
//				movimiento 1
				this.c0.setColorCuadrados(2, c, this.c3.getColorCuadrados((byte)2, c));

//				movimiento 2
				this.c3.setColorCuadrados(2, c, this.c5.getColorCuadrados((byte)2, c));

//				movimiento 3
				this.c5.setColorCuadrados(2, c, this.c2.getColorCuadrados((byte)2, c));

//				movimiento 4
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
			for(byte c=0; c<3; c++) {
//				movimiento 1
				this.c3.setColorCuadrados(c, 0, this.c1.getColorCuadrados((byte)0, c));

//				movimiento 2
				this.c1.setColorCuadrados(0, c, this.c2.getColorCuadrados(c, (byte)2));

//				movimiento 3
				this.c2.setColorCuadrados(c, 2, this.c4.getColorCuadrados((byte)2, c));

//				movimiento 4
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

	
		
		
	
}
