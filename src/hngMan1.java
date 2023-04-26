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
	
	private static int level = 0;
	StringBuffer theWord = new StringBuffer("ANKARA");
	private String imagesPath = "images/";
	
	
	private JPanel contentPane;
	
	private JTextField guessField;
	private JButton aBtn;
	private JButton bBtn;
	private JButton cBtn;
	private JButton dBtn;
	private JButton eBtn;
	private JButton fBtn;
	private JButton gBtn;
	private JButton hBtn;
	private JButton iBtn;
	private JButton jBtn;
	private JButton kBtn;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public void Btn(JButton a) {
		boolean flag = theWord.indexOf(a.getText()) == -1 ? false : true;
		if(flag) {
			textArea.append(a.getText());
		}
		level +=  !flag ? 1 : 0;
		a.setEnabled(false);
	}
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
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		btnNewButton.setBounds(198, 359, 117, 29);
		contentPane.add(btnNewButton);
		
		guessField = new JTextField();
		guessField.setBounds(510, 55, 240, 29);
		contentPane.add(guessField);
		guessField.setColumns(10);
		textArea = new JTextArea();
		textArea.setBounds(414, 214, 97, 45);
		contentPane.add(textArea);
		
		
			
		aBtn = new JButton("A");
		
		aBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.append(aBtn.getText());
				level += theWord.indexOf(aBtn.getText()) == -1 ? 1 : 0;
				aBtn.setEnabled(false);
			}
		});
		
		aBtn.setBounds(446, 123, 47, 29);
		contentPane.add(aBtn);
		
		bBtn = new JButton("B");
		bBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Btn(bBtn);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		bBtn.setBounds(502, 123, 47, 29);
		contentPane.add(bBtn);
		
		cBtn = new JButton("C");
		cBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Btn(cBtn);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
				
			}
		});
		cBtn.setBounds(550, 123, 47, 29);
		contentPane.add(cBtn);
		
		dBtn = new JButton("D");
		dBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Btn(dBtn);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		dBtn.setBounds(609, 123, 47, 29);
		contentPane.add(dBtn);
		
		eBtn = new JButton("E");
		eBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Btn(eBtn);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		eBtn.setBounds(657, 123, 47, 29);
		contentPane.add(eBtn);
		
		fBtn = new JButton("F");
		fBtn.setBounds(716, 123, 47, 29);
		contentPane.add(fBtn);
		
		gBtn = new JButton("G");
		gBtn.setBounds(768, 123, 47, 29);
		contentPane.add(gBtn);
		
		hBtn = new JButton("H");
		hBtn.setBounds(446, 164, 47, 29);
		contentPane.add(hBtn);
		
		iBtn = new JButton("I");
		iBtn.setBounds(502, 164, 47, 29);
		contentPane.add(iBtn);
		
		jBtn = new JButton("J");
		jBtn.setBounds(550, 164, 47, 29);
		contentPane.add(jBtn);
		
		kBtn = new JButton("K");
		kBtn.setBounds(609, 164, 47, 29);
		contentPane.add(kBtn);
		
		
		
		
	}
}
