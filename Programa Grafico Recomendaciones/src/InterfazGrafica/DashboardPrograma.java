package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

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
		
		JButton btnCatalogoDePeliculas = new JButton("Catálogo de películas");
		btnCatalogoDePeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCatalogoDePeliculas.setBounds(125, 64, 157, 23);
		frame.getContentPane().add(btnCatalogoDePeliculas);
		
		JButton btnMisPeliculas = new JButton("Mis Películas");
		btnMisPeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMisPeliculas.setBounds(125, 116, 157, 23);
		frame.getContentPane().add(btnMisPeliculas);
		
		JButton btnPeliculasRecomendadas = new JButton("Películas Recomendadas");
		btnPeliculasRecomendadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPeliculasRecomendadas.setBounds(125, 166, 157, 23);
		frame.getContentPane().add(btnPeliculasRecomendadas);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInicio.setBounds(183, 13, 56, 16);
		frame.getContentPane().add(lblInicio);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.setBounds(309, 215, 111, 25);
		frame.getContentPane().add(btnCerrarSesion);
	}
}
