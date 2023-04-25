import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class hngMan1 extends JFrame {
	
	private static int level = 1;
	
	private JPanel contentPane;
	
	private JTextField guessField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hngMan1 frame = new hngMan1();
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
	public hngMan1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(179, 178, 157));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblArea = new JLabel("");
		lblArea.setBounds(98, 66, 336, 207);
		contentPane.add(lblArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level++;
				String imagesPath = "images/";
				String img = "h" + level;
				ImageIcon a1 = new ImageIcon(imagesPath + img + ".png");
				lblArea.setIcon(a1);
			}
		});
		btnNewButton.setBounds(512, 126, 117, 29);
		contentPane.add(btnNewButton);
		
		guessField = new JTextField();
		guessField.setBounds(134, 358, 240, 29);
		contentPane.add(guessField);
		guessField.setColumns(10);
		
		
	}
}
