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
		
		JButton btnCatalogoDePeliculas = new JButton("Catalogo de peliculas");
		btnCatalogoDePeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCatalogoDePeliculas.setBounds(156, 48, 162, 23);
		contentPane.add(btnCatalogoDePeliculas);
		
		JButton btnMisPeliculas = new JButton("Mis peliculas");
		btnMisPeliculas.setBounds(156, 82, 162, 23);
		contentPane.add(btnMisPeliculas);
		
		JButton btnPeliculasRecomendadas = new JButton("Peliculas recomendadas");
		btnPeliculasRecomendadas.setBounds(156, 116, 162, 23);
		contentPane.add(btnPeliculasRecomendadas);
		
		JButton btnNewButton_3 = new JButton("Sign out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				//Para mostrar pantalla del login.
				
				Login window = new Login();
				window.framelogin.setVisible(true);
				
				new Login();
			}
		});
		btnNewButton_3.setBounds(156, 200, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
