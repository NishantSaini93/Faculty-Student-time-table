package college;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Datab extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datab frame = new Datab();
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
	public Datab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacultyName = new JLabel("faculty name");
		lblFacultyName.setBounds(10, 11, 156, 14);
		contentPane.add(lblFacultyName);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLectureName = new JLabel("lecture number");
		lblLectureName.setBounds(10, 94, 112, 14);
		contentPane.add(lblLectureName);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setBounds(124, 94, 18, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setBounds(367, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3");
		lblNewLabel_2.setBounds(596, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4");
		lblNewLabel_3.setBounds(80, 284, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5");
		lblNewLabel_4.setBounds(235, 284, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("6");
		lblNewLabel_5.setBounds(385, 284, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel label = new JLabel("");
		label.setBounds(120, 176, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_6 = new JLabel("7");
		lblNewLabel_6.setBounds(596, 284, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(75, 129, -38, 20);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(80, 133, 158, 100);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(294, 129, 175, 104);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(525, 129, 195, 104);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(20, 309, 122, 117);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(182, 309, 119, 117);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(347, 309, 122, 117);
		contentPane.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(525, 309, 184, 117);
		contentPane.add(textArea_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"b.tech(1st year)", "b.tech(2nd year)", "b.tech(3rd year)", "b.tech(4th year)", "m.tech(1st year)", "m.tech(2nd year)"}));
		comboBox.setBounds(323, 21, 90, 20);
		contentPane.add(comboBox);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSave.setBounds(577, 20, 89, 23);
		contentPane.add(btnSave);
	}
}
