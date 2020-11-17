import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaCubo extends JFrame{
	
	

	VentanaCubo(){
		this.setSize(1920, 1080);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("Bugs.png");
		this.setIconImage(icon.getImage());
		this.setTitle("Cubo Rubik del Aleteo");
		this.setVisible(true);
		this.getContentPane().setBackground(Color.GRAY);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
