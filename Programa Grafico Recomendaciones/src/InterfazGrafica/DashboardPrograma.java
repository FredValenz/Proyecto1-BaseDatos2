package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashboardPrograma {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardPrograma window = new DashboardPrograma();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DashboardPrograma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCatalogoDePeliculas = new JButton("Catalogo de peliculas");
		btnCatalogoDePeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCatalogoDePeliculas.setBounds(143, 51, 157, 23);
		frame.getContentPane().add(btnCatalogoDePeliculas);
		
		JButton btnMisPeliculas = new JButton("Mis Peliculas");
		btnMisPeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMisPeliculas.setBounds(143, 85, 157, 23);
		frame.getContentPane().add(btnMisPeliculas);
		
		JButton btnPeliculasRecomendadas = new JButton("Peliculas Recomendadas");
		btnPeliculasRecomendadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPeliculasRecomendadas.setBounds(143, 119, 157, 23);
		frame.getContentPane().add(btnPeliculasRecomendadas);
	}
}
