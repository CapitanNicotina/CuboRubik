import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaCubo	 extends JFrame 	implements ActionListener 	{

	private JButton [] movimientos;
	private PanelCubo panelCentro;
	
	
	
	
	
	VentanaCubo(){
		ImageIcon icon = new ImageIcon(getClass().getResource("Dank.jpg"));
		
//		PANELS
		
		
		
		JPanel panelDerecha = new JPanel();
		panelDerecha.setBounds(1570,0,350,1080);
		panelDerecha.setBackground(Color.red);
		panelDerecha.setLayout(null);
			
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setBounds(0,880,1570,220);
		panelAbajo.setBackground(Color.black);
		
		this.panelCentro = new PanelCubo();
		panelCentro.add(panelDerecha);
		
		
//		BUTTONS                                                                         
		movimientos = new JButton[12];
		for(byte i=0; i<12; i++) {
			movimientos[i] = new JButton("movimiento " + String.valueOf(i+1));
			movimientos[i].setBounds(1280,60+i*10, 100, 50);
			movimientos[i].addActionListener(this);
			movimientos[i].setBorder(BorderFactory.createRaisedSoftBevelBorder());
			movimientos[i].setFocusable(false);
			movimientos[i].setBackground(Color.CYAN);
			movimientos[i].setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 7));
			panelCentro.add(movimientos[i]);
		}
		
		
		JButton prueba = new JButton("imprimir prueba");
		prueba.setBounds(20,50,50,50);
		prueba.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelCentro.repaint();
				
			}
		});
		
//		LABELS
//		JLabel label = new JLabel();
//		label.setIcon(icon);
//		label.setText("esto nada que sirve");
//		label.setBounds(0,40,1000,1000);
//		label.setHorizontalTextPosition(JLabel.LEFT);
//		panelDerecha.add(label);


				
		
//		WINDOW
		this.setSize(1920, 1080);
//		this.setResizable(false);
		this.setTitle("Cubo Rubik del Aleteo");
		this.getContentPane().setBackground(Color.gray);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(icon.getImage());
		this.setLayout(null);
		this.add(panelCentro);
		this.add(panelAbajo);
		this.add(panelDerecha);
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
		

	public void actionPerformed(ActionEvent e) {
		byte movimiento = 0;
		for(byte i=0; i<12; i++) 
			if(e.getSource()==movimientos[i]) 
				movimiento = i;
		
		
		switch(movimiento) {
		case 0:
			System.out.println("move 0");
			this.panelCentro.cubo.horario((byte)0);
			this.panelCentro.cubo.imprimirCubo();
			break;
		case 1:
			System.out.println("move 1");
			break;
		case 2:
			System.out.println("move 2");
			break;
		case 3:
			System.out.println("move 3");
			break;
		case 4:
			System.out.println("move 4");
			break;
		case 5:
			System.out.println("move 5");
			break;
		case 6:
			System.out.println("move 6");
			break;
		case 7:
			System.out.println("move 7");
			break;
		case 8:
			System.out.println("move 8");
			break;
		case 9:
			System.out.println("move 9");
			break;
		case 10:
			System.out.println("move 10");
			break;
		case 11:
			System.out.println("move 11");
			break;
		}
		
					
				
	}
	
	
	
}
