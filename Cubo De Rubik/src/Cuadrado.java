import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cuadrado {
	Color color;
	int[] x;
	int[] y;
	
	
	public Cuadrado(int[] x, int[] y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public Cuadrado() {
		this.x = new int[4];
		this.y = new int[4];
	}

	

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(this.color);
		g2.fillPolygon(this.x, this.y,4);
		
	}

	
	
	
	
	public Color getColor() {
		return color;
	}


	public int getX(byte posicion) {
		return this.x[posicion];
	}

	public void setX(int vX, byte posicion) {
		this.x[posicion] = vX;
	}

	public int getY(byte posicion) {
		return this.y[posicion];
	}

	public void setY(int vY, byte posicion) {
		this.y[posicion] = vY;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}


	
}
