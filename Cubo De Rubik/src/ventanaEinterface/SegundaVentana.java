package ventanaEinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SegundaVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	// esta es la segunda ventana de la aplicación
	// aquí se hace una dvertencia del proyecto
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaVentana frame = new SegundaVentana();
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
	public SegundaVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// se utiliza el string que se solicitó em la primera ventana, y se imprime para personalizar el mensaje de advertencia
		JLabel lblNewLabel = new JLabel("<html>Hola "+DesarrolloDeVentanas.nombreDelUsuario +", esta esa una aplicaci\u00F3n que tiene como objetivo ayudarte a la resolución del cubo rubick, esperamos sea de tu ayuda</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(279, 11, 209, 198);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(SegundaVentana.class.getResource("/Imagenes/WhatsApp Image 2020-11-16 at 9.01.23 PM.jpeg")));
		btnNewButton.setBounds(10, 69, 257, 191);
		contentPane.add(btnNewButton);
		
		//creditos de los creadores
		JLabel lblNewLabel_1 = new JLabel("<html> <p>Cordialmente</p> <p> Juan Manuel Perez </p> <p> Edwin Esteban Hastamoir</p>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(289, 181, 199, 79);
		contentPane.add(lblNewLabel_1);
		
		//esto es lo que le da paso a la siguiente ventana
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TerceraVentana v3 = new TerceraVentana();
				v3.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(299, 277, 173, 47);
		contentPane.add(btnNewButton_1);
	}
}
