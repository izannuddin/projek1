package helloWorld1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
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
	public Frame3() {
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
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(22, 38, 174, 37);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(218, 38, 197, 37);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(218, 195, 186, 26);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(36, 195, 156, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        int Num1, Num2, Ans;
				
				try {
					Num1=Integer.parseInt(textFieldNum1.getText());
					Num2=Integer.parseInt(textFieldNum2.getText());
					
					Ans=Num1+Num2;
					textFieldAns.setText(Integer.toString(Ans));
				}catch (Exception e ) {
					JOptionPane.showMessageDialog(null, "please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(22, 102, 174, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
int num1, num2, ans;
				
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch (Exception e1 ) {
					JOptionPane.showMessageDialog(null, "please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(218, 102, 197, 37);
		frame.getContentPane().add(btnNewButton_1);
	}

}
