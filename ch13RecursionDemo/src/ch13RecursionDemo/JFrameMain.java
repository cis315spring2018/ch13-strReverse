/**
 *   file: JFrameMain.java
 */
package ch13RecursionDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIn1;
	private JTextField textFieldOut1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
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
	public JFrameMain() {
		setTitle("Recursion Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldIn1 = new JTextField();
		textFieldIn1.setText("ReverseMe!");
		textFieldIn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldIn1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIn1.setBounds(12, 24, 211, 40);
		contentPane.add(textFieldIn1);
		textFieldIn1.setColumns(10);
		
		JButton btnNewButton = new JButton("Reverse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sInput = textFieldIn1.getText();
						
				textFieldOut1.setText(Recursion.strReverse(sInput));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(235, 24, 106, 40);
		contentPane.add(btnNewButton);
		
		textFieldOut1 = new JTextField();
		textFieldOut1.setEditable(false);
		textFieldOut1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOut1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldOut1.setBounds(352, 24, 236, 40);
		contentPane.add(textFieldOut1);
		textFieldOut1.setColumns(10);
	}
}
