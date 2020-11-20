package ventanaEinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TerceraVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//Tercera ventana
	// aquí el usuario puede escoger el modo en el que quier el cubo
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TerceraVentana frame = new TerceraVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TerceraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione el modo que desea: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 414, 51);
		contentPane.add(lblNewLabel);
		
		//Dependiendo del modo que escoja el usuario se le otorgara un valor binaario a la variable global modoDelCubo, para luego hacer la seleccion del mod en el Main del codigo
		
		//opción de cubo armado
		JButton btnNewButton = new JButton("Cubo armado");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//se le otorga el valor de cero a la variable
				 DesarrolloDeVentanas.modoDelCubo = 0;
				 VentanaCubo ventanaCubo = new VentanaCubo();
				 ventanaCubo.setVisible(true);
				 dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(117, 73, 191, 64);
		contentPane.add(btnNewButton);
		//opción del cubo desarmado
		JButton btnNewButton_1 = new JButton("Cubo Desarmado");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//se le otorga el valor de uno a la variable
				DesarrolloDeVentanas.modoDelCubo = 1;
				 VentanaCubo ventanaCubo = new VentanaCubo();
				 ventanaCubo.setVisible(true);
				 dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_1.setBounds(117, 160, 191, 64);
		contentPane.add(btnNewButton_1);
	}
}
