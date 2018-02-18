package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;


public class Login  {

	private JFrame frame;
	private JTextField textFieldCorreoElectronico;
	private JLabel lblNombredeUsuario;
	private JTextField textFieldContrasena;
	private JLabel lblContrasena;
	private JButton btnCrearNuevoUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ButtonDeInicio = new JButton("Inicio de sesion");
		ButtonDeInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textFieldCorreoElectronico.getText();
				String contrasena = textFieldContrasena.getText();
				
				if(username.equals("pablo") && contrasena.equals("1234"))
				{
					JOptionPane.showMessageDialog(frame, "Has entrado!!");
					
					//Para dejar de mostrar la pantalla del login.
					frame.setVisible(false);
	
					//Para hacer visible la pantalla del programa.
					
					Programa prog= new Programa();
					prog.setVisible(true);
					
					//DashboardPrograma dash= new DashboardPrograma();
					//dash.setVisible(true);
				}
				
				else
				{
					JOptionPane.showMessageDialog(frame, "Nombre de usuario o contrasena incorrecta");
				}
				
			}
		});
		
		//Elementos graficos del programa
		
		ButtonDeInicio.setBounds(64, 227, 118, 36);
		frame.getContentPane().add(ButtonDeInicio);
		
		textFieldCorreoElectronico = new JTextField();
		textFieldCorreoElectronico.setBounds(68, 85, 247, 20);
		frame.getContentPane().add(textFieldCorreoElectronico);
		textFieldCorreoElectronico.setColumns(10);
		
		lblNombredeUsuario = new JLabel("NombredeUsuario");
		lblNombredeUsuario.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNombredeUsuario.setBounds(68, 39, 145, 25);
		frame.getContentPane().add(lblNombredeUsuario);
		
		textFieldContrasena = new JTextField();
		textFieldContrasena.setBounds(68, 176, 247, 20);
		frame.getContentPane().add(textFieldContrasena);
		textFieldContrasena.setColumns(10);
		
		lblContrasena = new JLabel("Contrasena");
		lblContrasena.setFont(new Font("Verdana", Font.BOLD, 12));
		lblContrasena.setBounds(68, 138, 145, 25);
		frame.getContentPane().add(lblContrasena);
		
		btnCrearNuevoUsuario = new JButton("Crear nuevo usuario");
		btnCrearNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Comando para mostrar pantalla para mostrar pantalla de crear nuevo usuario.
				CrearNuevoUsuario nu = new CrearNuevoUsuario();
				nu.ScreenNuevoUsuario();
			}
		});
		btnCrearNuevoUsuario.setBounds(204, 227, 157, 36);
		frame.getContentPane().add(btnCrearNuevoUsuario);
	}
}
