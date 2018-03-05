package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class mis_peliculas extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mis_peliculas frame = new mis_peliculas();
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
	public mis_peliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMisPeliculas = new JLabel("Mis Películas");
		lblMisPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMisPeliculas.setBounds(160, 13, 124, 25);
		contentPane.add(lblMisPeliculas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 51, 346, 153);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JButton btnRate = new JButton("Rate");
		btnRate.setBounds(62, 217, 97, 25);
		contentPane.add(btnRate);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//setVisible(false);
				dispose();
				
				
				//Comando para mostrar pantalla de log in
				//Login LogIn= new Login();
				//login = new Login();
				//login.setVisible(true);
				
				DashboardPrograma programa = new DashboardPrograma();
				programa.setVisible(true);
				
			}
		});
		btnAtras.setBounds(301, 217, 97, 25);
		contentPane.add(btnAtras);
	}
}