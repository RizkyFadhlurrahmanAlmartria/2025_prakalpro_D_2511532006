package pekan8_2511532006;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511532006 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAngka1;
	private JTextField txtAngka2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Error", JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532006 frame = new OperatorAritmatikaGUI_2511532006();
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
	public OperatorAritmatikaGUI_2511532006() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Angka 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(23, 56, 47, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNew = new JLabel("OPERATOR ARITMATIKA");
		lblNew.setBounds(65, 20, 200, 20);
		lblNew.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNew);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(23, 86, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operator");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(23, 114, 61, 12);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hasil");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(23, 150, 44, 12);
		contentPane.add(lblNewLabel_3);
		
		txtAngka1 = new JTextField();
		txtAngka1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka1.setBounds(75, 58, 61, 18);
		contentPane.add(txtAngka1);
		txtAngka1.setColumns(10);
		
		txtAngka2 = new JTextField();
		txtAngka2.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka2.setBounds(75, 84, 61, 18);
		contentPane.add(txtAngka2);
		txtAngka2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setBounds(75, 148, 61, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox CBOperator = new JComboBox();
		CBOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		CBOperator.setEditable(true);
		CBOperator.setBounds(75, 111, 44, 20);
		contentPane.add(CBOperator);
		
		JButton btn = new JButton("Hitung");
		btn.addActionListener(new ActionListener() {
			int hasil = 0;
			public void actionPerformed(ActionEvent e) {
				if(txtAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan Angka 1");
				}else if(txtAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan Angka 2");
				}else {
					try {
						int a = Integer.valueOf(txtAngka1.getText());
						int b = Integer.valueOf(txtAngka2.getText());
						int c = CBOperator.getSelectedIndex();
						
						if (c == 0) hasil = a+b;
						if (c == 1) hasil = a-b;
						if (c == 2) hasil = a*b;
						if (c == 3) hasil = a/b;
						if (c == 4) hasil = a%b;
						txtHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanError("Angka 1 dan Angka 2 tidal valid ");
					}
				}
			}
		});
		btn.setBounds(133, 111, 84, 20);
		contentPane.add(btn);

	}
}
