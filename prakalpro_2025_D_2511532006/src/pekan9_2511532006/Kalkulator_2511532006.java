package pekan9_2511532006;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Kalkulator_2511532006 {

	private JFrame frame;
	private JTextField textField;
	private JButton btnClear;
	private JButton btn00;
	private JButton btnPlus;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMinus;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDiv;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMul;
	private JButton btn0;
	private JButton btnPoint;
	private JButton btnEqual;
	private JButton btnMod;
	
	double first;
	double second;
	double result;
	String Operation;
	String Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511532006 window = new Kalkulator_2511532006();
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
	public Kalkulator_2511532006() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 358, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setEditable(false);
		textField.setBounds(10, 21, 323, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 14));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(9, 105, 75, 63);
		frame.getContentPane().add(btnBackspace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(90, 105, 75, 63);
		frame.getContentPane().add(btnClear);
		
		btn00 = new JButton("00");
		btn00.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn00.getText();
				textField.setText(Number);
			}
		});
		btn00.setBounds(173, 105, 75, 63);
		frame.getContentPane().add(btn00);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "+";
				 
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBounds(258, 105, 75, 63);
		frame.getContentPane().add(btnPlus);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn7.getText();
				textField.setText(Number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.setBounds(10, 173, 75, 63);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn8.getText();
				textField.setText(Number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.setBounds(91, 173, 75, 63);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn9.getText();
				textField.setText(Number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.setBounds(174, 173, 75, 63);
		frame.getContentPane().add(btn9);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnMinus.setBounds(259, 173, 75, 63);
		frame.getContentPane().add(btnMinus);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn1.getText();
				textField.setText(Number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.setBounds(11, 308, 75, 63);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn2.getText();
				textField.setText(Number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.setBounds(92, 308, 75, 63);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn3.getText();
				textField.setText(Number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.setBounds(175, 308, 75, 63);
		frame.getContentPane().add(btn3);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDiv.setBounds(260, 308, 75, 63);
		frame.getContentPane().add(btnDiv);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn4.getText();
				textField.setText(Number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.setBounds(10, 240, 75, 63);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn5.getText();
				textField.setText(Number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.setBounds(91, 240, 75, 63);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn6.getText();
				textField.setText(Number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.setBounds(174, 240, 75, 63);
		frame.getContentPane().add(btn6);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMul.setBounds(259, 240, 75, 63);
		frame.getContentPane().add(btnMul);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btn0.getText();
				textField.setText(Number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.setBounds(10, 378, 75, 63);
		frame.getContentPane().add(btn0);
		
		btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnPoint.getText();
				textField.setText(Number);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPoint.setBounds(91, 378, 75, 63);
		frame.getContentPane().add(btnPoint);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (Operation=="+") {
					result=first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (Operation=="-") {
					result=first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}  else if (Operation=="/") {
					result=first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}  else if (Operation=="*") {
					result=first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}  else if (Operation=="%") {
					result=first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEqual.setBounds(174, 378, 75, 63);
		frame.getContentPane().add(btnEqual);
		
		btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMod.setBounds(259, 378, 75, 63);
		frame.getContentPane().add(btnMod);
	}
}
