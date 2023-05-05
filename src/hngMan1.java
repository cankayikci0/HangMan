import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class hngMan1 extends JFrame {
	
	private static int level = 0;
	StringBuffer theWord = new StringBuffer("ANKARA");
	private String imagesPath = "images/";
	private StringBuffer guess = new StringBuffer("######");
	private ArrayList<Integer> occur = new ArrayList();
	
	
	private JPanel contentPane;
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
	private JLabel congrats;

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
	
	public ArrayList<Integer> findOccurances(String character) {
		ArrayList<Integer> list = new ArrayList();
		int index = theWord.indexOf(character);
		while(index >= 0) {
			list.add(index);
			index = theWord.indexOf(character, index + 1);
		}
		return list;
	}
	public void replaceString(ArrayList<Integer> list, char c) {
		for(int index : list) {
			guess.setCharAt(index, c);
		}
		
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
		lblArea.setBackground(SystemColor.menu);
		lblArea.setForeground(Color.WHITE);
		lblArea.setBounds(98, 67, 336, 207);
		contentPane.add(lblArea);
		textArea = new JTextArea();
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		textArea.setBounds(446, 261, 210, 45);
		contentPane.add(textArea);
		
		
		textArea.setText(guess.toString());
			
		aBtn = new JButton("A");
		
		aBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Btn(aBtn);
				occur.clear();
				occur = findOccurances(aBtn.getText());
				replaceString(occur, 'A');
				textArea.setText(guess.toString());
				level += theWord.indexOf(aBtn.getText()) == -1 ? 1 : 0;
				aBtn.setEnabled(false);
			}
		});
		
		aBtn.setBounds(446, 123, 47, 29);
		contentPane.add(aBtn);
		
		bBtn = new JButton("B");
		bBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Btn(aBtn);
				occur.clear();
				occur = findOccurances(bBtn.getText());
				replaceString(occur, 'B');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				bBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		bBtn.setBounds(502, 123, 47, 29);
		contentPane.add(bBtn);
		
		cBtn = new JButton("C");
		cBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Btn(aBtn);
				occur.clear();
				occur = findOccurances(cBtn.getText());
				replaceString(occur, 'C');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				cBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
				
			}
		});
		cBtn.setBounds(550, 123, 47, 29);
		contentPane.add(cBtn);
		
		dBtn = new JButton("D");
		dBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Btn(dBtn);
				occur.clear();
				occur = findOccurances(dBtn.getText());
				replaceString(occur, 'D');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				dBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		dBtn.setBounds(609, 123, 47, 29);
		contentPane.add(dBtn);
		
		eBtn = new JButton("E");
		eBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Btn(eBtn);
				occur.clear();
				occur = findOccurances(eBtn.getText());
				replaceString(occur, 'E');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				eBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		eBtn.setBounds(657, 123, 47, 29);
		contentPane.add(eBtn);
		
		fBtn = new JButton("F");
		fBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Btn(fBtn);
				occur.clear();
				occur = findOccurances(fBtn.getText());
				replaceString(occur, 'F');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				fBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		fBtn.setBounds(716, 123, 47, 29);
		contentPane.add(fBtn);
		
		gBtn = new JButton("G");
		gBtn.setBounds(768, 123, 47, 29);
		contentPane.add(gBtn);
		
		gBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				occur.clear();
				occur = findOccurances(gBtn.getText());
				replaceString(occur, 'G');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				gBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		hBtn = new JButton("H");
		hBtn.setBounds(446, 164, 47, 29);
		contentPane.add(hBtn);
		
		hBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				occur.clear();
				occur = findOccurances(hBtn.getText());
				replaceString(occur, 'H');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				hBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		iBtn = new JButton("I");
		iBtn.setBounds(502, 164, 47, 29);
		contentPane.add(iBtn);
		
		iBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				occur.clear();
				occur = findOccurances(iBtn.getText());
				replaceString(occur, 'I');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				iBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		jBtn = new JButton("J");
		jBtn.setBounds(550, 164, 47, 29);
		contentPane.add(jBtn);
		
		jBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				occur.clear();
				occur = findOccurances(jBtn.getText());
				replaceString(occur, 'J');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				jBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		kBtn = new JButton("K");
		kBtn.setBounds(609, 164, 47, 29);
		contentPane.add(kBtn);
		
		JButton nBtn = new JButton("N");
		nBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				occur.clear();
				occur = findOccurances(nBtn.getText());
				replaceString(occur, 'N');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				nBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		nBtn.setBounds(667, 164, 47, 29);
		contentPane.add(nBtn);
		
		JButton rBtn = new JButton("R");
		rBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				occur.clear();
				occur = findOccurances(rBtn.getText());
				replaceString(occur, 'R');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				rBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		rBtn.setBounds(726, 164, 47, 29);
		contentPane.add(rBtn);
		
		JLabel lblNewLabel = new JLabel("CAPITAL?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(449, 30, 234, 22);
		contentPane.add(lblNewLabel);
		
		congrats = new JLabel("New label");
		congrats.setBounds(64, 332, 61, 16);
		contentPane.add(congrats);
		kBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Btn(kBtn);
				occur.clear();
				occur = findOccurances(kBtn.getText());
				replaceString(occur, 'K');
				textArea.setText(guess.toString());
				level += occur.isEmpty() ? 1 : 0;
				kBtn.setEnabled(false);
				ImageIcon a1 = new ImageIcon(imagesPath + level + ".png");
				lblArea.setIcon(a1);
			}
		});
		
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				congrats.setText(textArea.getText().equals(theWord.toString()) ? "Congrats" : "Try Again");
			}
		});
		submitBtn.setBounds(64, 286, 117, 29);
		contentPane.add(submitBtn);
		
		
	}
}
