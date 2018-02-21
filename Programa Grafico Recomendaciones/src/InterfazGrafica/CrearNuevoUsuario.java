package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearNuevoUsuario {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldNombreDeUsuario;
	private JTextField textFieldContrasena;

	/**
	 * Launch the application.
	 */
	public static void ScreenNuevoUsuario() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearNuevoUsuario window = new CrearNuevoUsuario();
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
	public CrearNuevoUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = textFieldNombre.getText();
				String apellido = textFieldApellido.getText();
				String nombredeusuario = textFieldNombreDeUsuario.getText();
				String contrasena = textFieldContrasena.getText();
				
				if(nombre.equals("") || apellido.equals("") || nombredeusuario.equals("") || contrasena.equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Debe llenar todos los campos");
				}
			}
		});
		btnCrearUsuario.setBounds(108, 178, 118, 23);
		frame.getContentPane().add(btnCrearUsuario);
		
		JButton btnNewSalir = new JButton("Atr\u00E1s");
		btnNewSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				
			}
		});
		btnNewSalir.setBounds(331, 217, 89, 23);
		frame.getContentPane().add(btnNewSalir);
		
		//Objetos graficos del programa.
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(48, 31, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(198, 31, 46, 14);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setBounds(48, 96, 123, 23);
		frame.getContentPane().add(lblNombreDeUsuario);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setBounds(198, 100, 86, 14);
		frame.getContentPane().add(lblContrasena);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(48, 56, 97, 20);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(198, 56, 97, 20);
		frame.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldNombreDeUsuario = new JTextField();
		textFieldNombreDeUsuario.setBounds(48, 123, 97, 20);
		frame.getContentPane().add(textFieldNombreDeUsuario);
		textFieldNombreDeUsuario.setColumns(10);
		
		textFieldContrasena = new JTextField();
		textFieldContrasena.setBounds(198, 123, 97, 20);
		frame.getContentPane().add(textFieldContrasena);
		textFieldContrasena.setColumns(10);
		
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
