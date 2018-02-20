package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Catalogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Login login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catalogo frame = new Catalogo();
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
	public Catalogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(162, 178, 89, 23);
		contentPane.add(btnComprar);
		
		JLabel lblCatalogodePeliculas = new JLabel("Cat\u00E1logo de Pel\u00EDculas");
		lblCatalogodePeliculas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCatalogodePeliculas.setBounds(120, 13, 179, 24);
		contentPane.add(lblCatalogodePeliculas);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//setVisible(false);
				dispose();
				
				
				//Comando para mostrar pantalla de log in
				//Login LogIn= new Login();
				//login = new Login();
				//login.setVisible(true);
				
			}
		});
		btnAtras.setBounds(331, 217, 89, 23);
		contentPane.add(btnAtras);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(36, 50, 351, 105);
		contentPane.add(comboBox);
	}
}
