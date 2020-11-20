package ventanaEinterface;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrimeraVentana extends JFrame {

	private JPanel contentPane;
	private JTextField espacioParaNombre;

	/**
	 * Launch the application.
	 */
	// esta es la primera ventana del código
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeraVentana frame = new PrimeraVentana();
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
	public PrimeraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		espacioParaNombre = new JTextField();
		espacioParaNombre.setFont(new Font("Tahoma", Font.PLAIN, 26));
		espacioParaNombre.setBounds(59, 69, 331, 62);
		contentPane.add(espacioParaNombre);
		espacioParaNombre.setColumns(10);
		
		
		
		// aquí recibe el nombre del usuario, es posteriormente enviado a la clase DesarrolloDeVentanas, este string que se recibe su usará varias veces más adelante 
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DesarrolloDeVentanas.nombreDelUsuario = espacioParaNombre.getText();
				SegundaVentana v2 = new SegundaVentana();
				v2.setVisible(true);
				dispose();
			}
		});
		botonAceptar.setBounds(106, 177, 241, 73);
		contentPane.add(botonAceptar);
		
		JLabel lblNewLabel = new JLabel("Hola \u00BFC\u00F3mo te llamas?");
		lblNewLabel.setBounds(20, 11, 382, 47);
		contentPane.add(lblNewLabel);
	}

}
