package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import conexionBD.BaseDatos;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Catalogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Login login;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		BaseDatos DB = new BaseDatos();
		
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
				
				DashboardPrograma programa = new DashboardPrograma();
				programa.setVisible(true);
				
			}
		});
		btnAtras.setBounds(296, 217, 89, 23);
		contentPane.add(btnAtras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 67, 324, 137);
		contentPane.add(scrollPane);
		
		table = new JTable();
		DefaultTableModel modeloT = new DefaultTableModel();
		String [] columnas = {"movie_id", "title", "score"};
		modeloT.setColumnIdentifiers(columnas);
		table.setModel(modeloT);
		
		try {
			  Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/recomendaciondb?useSSL=false", "root", "ja");
            Statement myStmt = myConn.createStatement();
            ResultSet rs = myStmt.executeQuery("select * from movie");
            String movie_id,title,score;
            while(rs.next())
            {
   
          	  movie_id=rs.getString("movie_id");
          	  title=rs.getString("title");
          	  score=rs.getString("score");
              modeloT.addRow(new Object[]{movie_id,title,score});  
            }
           
            
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scrollPane.setColumnHeaderView(table);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				table.getSelectedRow();
				
			
				
			}
		});	
	
		btnComprar.setBounds(60, 217, 89, 23);
		contentPane.add(btnComprar);
		
	}
}
