package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Error_rate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error_rate frame = new Error_rate();
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
	public Error_rate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblError = new JLabel("Error!");
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblError.setBounds(168, 69, 89, 27);
		contentPane.add(lblError);
		
		JLabel lblRatingDebeDe = new JLabel("Rating debe de ser un número entre 1 y 5.");
		lblRatingDebeDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRatingDebeDe.setBounds(49, 109, 353, 54);
		contentPane.add(lblRatingDebeDe);
	}

}
