package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rate extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldRate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rate frame = new Rate();
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
	public Rate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rate");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(151, 36, 65, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rating de Peliculas (1 - 5)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(93, 76, 203, 27);
		contentPane.add(lblNewLabel_1);
		
		textFieldRate = new JTextField();
		textFieldRate.setBounds(120, 136, 116, 22);
		contentPane.add(textFieldRate);
		textFieldRate.setColumns(10);
		
		JButton btnAte = new JButton("Rate");
		btnAte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rateValue = textFieldRate.getText();
				
				if(rateValue.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Debe llenar el campo solicitado");
				}
				
				int rate= Integer.parseInt(rateValue);
				
				if(rate>5 || rate<1)
				{
					JOptionPane.showMessageDialog(null, "Los valores deben de ser entre 1 y 5");
				}
				
				
				else
				{
					JOptionPane.showMessageDialog(null, "La pelicula ha sido calificada");
				}
			}
		});
		btnAte.setBounds(12, 187, 97, 25);
		contentPane.add(btnAte);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(243, 187, 97, 25);
		contentPane.add(btnBack);
	}
}
