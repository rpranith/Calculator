import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class a1Swing {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					a1Swing window = new a1Swing();
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
	public a1Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(41, 40, 223, 65);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(285, 40, 251, 65);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, answer;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					answer = num1 + num2;
					textField.setText(Integer.toString(answer));
					
				} catch(Exception a) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
				}
			}
		);
		btnAdd.setBounds(41, 159, 223, 65);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, answer;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					answer = num1 - num2;
					textField.setText(Integer.toString(answer));
					
				} catch(Exception a) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
				}
		});
		btnSubtract.setBounds(305, 159, 223, 65);
		frame.getContentPane().add(btnSubtract);
		
		textField = new JTextField();
		textField.setBounds(193, 258, 215, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTheAnswerIs = new JLabel("The Answer is:");
		lblTheAnswerIs.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTheAnswerIs.setBounds(40, 259, 136, 47);
		frame.getContentPane().add(lblTheAnswerIs);
	}
}
