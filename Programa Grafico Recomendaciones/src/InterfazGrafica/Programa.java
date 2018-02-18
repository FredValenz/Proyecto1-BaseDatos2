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

public class Programa extends JFrame {

	private JPanel contentPane;
	private JTable tablePeliculas;
	private Login login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa frame = new Programa();
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
	public Programa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(53, 192, 89, 23);
		contentPane.add(btnComprar);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPeliculas.setBounds(30, 11, 102, 24);
		contentPane.add(lblPeliculas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 67, 276, 114);
		contentPane.add(scrollPane);
		
		tablePeliculas = new JTable();
		scrollPane.setColumnHeaderView(tablePeliculas);
		
		JButton btnSignOut = new JButton("Sign out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//setVisible(false);
				dispose();
				
				
				//Comando para mostrar pantalla de log in
				//Login LogIn= new Login();
				//login = new Login();
				//login.setVisible(true);
				
			}
		});
		btnSignOut.setBounds(181, 192, 89, 23);
		contentPane.add(btnSignOut);
	}
}
