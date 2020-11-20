package ventanaEinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaCubo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	//En esta venta el usuario podrá ver el cubo, dependiendo del modo que hubieso escogido en la ventana anterior
	// esta es uan ventana fija
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCubo frame = new VentanaCubo();
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
	public VentanaCubo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setBounds(324, 227, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel textoCuboArmado = new JLabel("Cubo armado");
		textoCuboArmado.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textoCuboArmado.setBounds(87, 107, 248, 85);
		contentPane.add(textoCuboArmado);
		
		JLabel textoCuboDesarmado = new JLabel("Cubo Desarmado");
		textoCuboDesarmado.setFont(new Font("Tahoma", Font.PLAIN, 48));
		textoCuboDesarmado.setBounds(39, 32, 364, 131);
		contentPane.add(textoCuboDesarmado);
	}
}
