import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JPanel;

public class PanelCubo extends JPanel {
	
	private Cuadrado[] cuadrados;
	
	private Cara wFace = new Cara((byte)0);
	private Cara bFace = new Cara((byte)0);
	private Cara rFace = new Cara((byte)0);
	private Cara gFace = new Cara((byte)0);
	private Cara oFace = new Cara((byte)0);
	private Cara yFace = new Cara((byte)0);
	public Cubo cubo = new Cubo(wFace, bFace, rFace, oFace, gFace, yFace);
	
	
	
	PanelCubo(){
		
		this.setLayout(null);
		this.setBackground(Color.blue);
		this.setBounds(0,0,1920,1800);
	
		int[] x = new int[4];
		int[] y = new int[4];
		this.cuadrados = new Cuadrado[54];
		Color[]colorCuadrados = new Color[54];
		
		byte contador = 0;
		for(byte c = 0; c<6; c++) {
			for(byte f=0; f<3; f++) {
				for(byte col=0; col<3; col++) {
					switch(this.cubo.caras[c].getColorCuadrados(f, col)) {
					case 'w':
						colorCuadrados[contador] = Color.white;
						break;
						
					case 'b':
						colorCuadrados[contador] = Color.white;
						break;
						
					case 'r':
						colorCuadrados[contador] = Color.white;
						break;
						
					case 'o':
						colorCuadrados[contador] = Color.white;
						break;
						
					case 'g':
						colorCuadrados[contador] = Color.white;
						break;
						
					case 'y':
						colorCuadrados[contador] = Color.white;
						break;
					}
					contador ++;
				}
			}
		}
		
		
		for(byte i=0; i<54; i++) {
			this.cuadrados[i] = new Cuadrado();
		}
		
		int ordenadaX=0;
		int ordenadaY=0;
		for(byte i=0; i<9; i++) {
			if(i==0) {
				cuadrados[i].setX(400, (byte)0);
				cuadrados[i].setY(800, (byte)0);
			}else {
				cuadrados[i].setX(ordenadaX, (byte)0);
				cuadrados[i].setY(ordenadaY, (byte)0);
			}

			cuadrados[i].setX(cuadrados[i].getX((byte)0), (byte)1);
			cuadrados[i].setY(cuadrados[i].getY((byte)0)-100, (byte)1);

			cuadrados[i].setX(cuadrados[i].getX((byte)1)-87, (byte)2);
			cuadrados[i].setY(cuadrados[i].getY((byte)1)-50, (byte)2);

			cuadrados[i].setX(cuadrados[i].getX((byte)2), (byte)3);
			cuadrados[i].setY(cuadrados[i].getY((byte)2)+100, (byte)3);
			
			cuadrados[i].setColor(colorCuadrados[i]);

			ordenadaX = cuadrados[i].getX((byte)3);
			ordenadaY = cuadrados[i].getY((byte)3);

			if(i==2 || i==5 || i==8) {
				ordenadaX += 261; ordenadaY += 50;
			}
		}

		ordenadaX = 1270;
		ordenadaY = 650; 
		for(byte i=27; i<36; i++) {
			x[0] = ordenadaX;
			y[0] = ordenadaY;
			ordenadaY -= 100;
			x[1] = ordenadaX;
			y[1] = ordenadaY;
			ordenadaX -= 86;
			ordenadaY -= 50;
			x[2] = ordenadaX;
			y[2] = ordenadaY;
			ordenadaY += 100;
			x[3] = ordenadaX;
			y[3] = ordenadaY;


			if(i==2 || i==5 || i==8) {
				ordenadaX += 260; ordenadaY += 50;
			}
		}		
		
//		GRUPO DE CARAS 2
//		GRUPO DE CARAS 3
		
	}
	 
	
	public void paint(Graphics c) {
		Graphics2D c2 = (Graphics2D) c;
		
		for(byte i=0; i<54; i++) {
			if(cuadrados[i] != null)
				cuadrados[i].paint(c2);
		}
		
		c2.setStroke(new BasicStroke(5));
		c2.setColor(Color.black);
		
		
		
		for(byte i=0; i<2; i++){
			int x1 = 400;
			int y1 = 800;
			int x2 = 140;
			int y2 = 650;
			if(i==1) {
				x1 = 400+610;
				x2 = 140+610;
			}
			
			c2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
			y2 -= 300;
			c2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
			x2 += 260;
			y2 -= 150;
			c2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
			x2 += 260;
			y2 += 150;
			c2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
			y2 += 300;c2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
			x2 -= 260;
			y2 += 150;
			c2.drawLine(x1, y1, x2, y2);
		}
		
		c2.drawLine(400, 800, 400, 500);
		c2.drawLine(400, 500, 140, 350);
		c2.drawLine(400, 500, 660, 350);
		
		c2.drawLine(750, 650, 1010, 500);
		c2.drawLine(1010, 500, 1010, 200);
		c2.drawLine(1270, 650, 1010, 500);		
	}
}
