package college;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Faculty extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty frame = new Faculty();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ResultSet rs=null ;
	   public Connection connection=null;
	   public Statement stmt=null;
	    public String s1,s2;
	    public String s11,s22,s33,s44,s55,s66;
	    public String l1="1",l2="2",l3="3",l4="4",l5="5",l6="6",l7="7";
	/**
	 * Create the frame.
	 */
	public Faculty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterFacultyName = new JLabel("Choose Faculty ");
		lblEnterFacultyName.setBounds(10, 15, 125, 19);
		contentPane.add(lblEnterFacultyName);
		
		JList list = new JList();
		list.setBounds(131, 45, -105, 114);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(24, 182, 111, -132);
		contentPane.add(list_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Er. Chandan", "Er. Pratibha", "Er. Hakam", "Er. Ankush", "Er.Neha"}));
		comboBox.setBounds(20, 45, 163, 20);
		contentPane.add(comboBox);
		
		JLabel lblLectureNo = new JLabel("Lecture no");
		lblLectureNo.setBounds(24, 87, 64, 14);
		contentPane.add(lblLectureNo);
		
		JLabel label = new JLabel("1");
		label.setBounds(24, 132, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(24, 170, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(24, 202, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(24, 242, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBounds(24, 279, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setBounds(24, 318, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setBounds(24, 359, 46, 14);
		contentPane.add(label_6);
		
		JLabel lblRoomNo = new JLabel("room no");
		lblRoomNo.setBounds(137, 87, 80, 14);
		contentPane.add(lblRoomNo);
		
		textField = new JTextField();
		textField.setBounds(131, 129, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 167, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 199, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 230, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(131, 273, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(131, 312, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(131, 356, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(366, 87, 80, 14);
		contentPane.add(lblSubject);
		
		textField_7 = new JTextField();
		textField_7.setBounds(344, 126, 226, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(344, 167, 226, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(344, 199, 226, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(344, 230, 226, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(344, 273, 226, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(344, 312, 226, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(344, 356, 226, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
		comboBox_1.setBounds(270, 45, 111, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblDay = new JLabel("Choose day");
		lblDay.setBounds(272, 15, 100, 14);
		contentPane.add(lblDay);
		
		JButton btnRetrive = new JButton("retrive");
		btnRetrive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					s1=(String) comboBox.getSelectedItem();
			     	s2=(String) comboBox_1.getSelectedItem();
			     	connection = DriverManager.getConnection("jdbc:mysql://localhost/coll","root","root");
			     	stmt= connection.createStatement();
			     	rs=stmt.executeQuery("select * from table11 where faculty='" +s1+"' and day='"+s2+"'");
			     	while(rs.next())
			     	{ s11=rs.getString("course");
	                s22=rs.getString("day");
	                s33=rs.getString("lctrno");
	               s44=rs.getString("faculty");
	               s55=rs.getString("room");
	                s66=rs.getString("subject");
	                if(s44.equals(s1 )&& s22.equals(s2) && s33.equals(l1) ) 
	                {textField.setText(s55);
	                
	                textField_7.setText(s66);
	                }
	                else if(s44.equals(s1 )&& s22.equals(s2) && s33.equals(l2) ) 
	                {textField_1.setText(s55);
	                textField_8.setText(s66);
	                }
	                else if(s44.equals(s1 )&& s22.equals(s2) && s33.equals(l3) ) 
	                {
	                	textField_2.setText(s55);
	                	textField_9.setText(s66);
	                	
	                }
	                else if(s44.equals(s1 )&& s22.equals(s2) && s33.equals(l4) ) 
	                {
	                	textField_3.setText(s55);
	                	textField_10.setText(s66);
	                } 
	                else if(s44.equals(s1 )&& s22.equals(s2) && s33.equals(l5) ) 
	                {
	                	textField_4.setText(s55);
	                	textField_11.setText(s66);
	                }
	                else if(s44.equals(s1 )&& s22.equals(s2) && s33.equals(l6) ) 
	                {
	                	textField_5.setText(s55);
	                	
	                	textField_12.setText(s66);
	                }
	                else if(s44.equals(s1 )&& s22.equals(s2) && s33.equals(l7) ) 
	                {
	                	textField_6.setText(s55);
	                	textField_13.setText(s66);
	                }
			     		
			     	}

				}
				catch(Exception e1)
				{
					 System.out.println(e1);
					
				}
				
			}
		});
		btnRetrive.setBounds(606, 44, 89, 23);
		contentPane.add(btnRetrive);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");
				textField_6.setText(" ");
				textField_7.setText(" ");
				textField_8.setText(" ");
				textField_9.setText(" ");
				textField_10.setText(" ");
				textField_11.setText(" ");
				textField_12.setText(" ");
				textField_13.setText(" ");
				
			}
		});
		btnClear.setBounds(606, 96, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faculty ww=new Faculty();
				dispose();
			}
		});
		btnBack.setBounds(606, 150, 89, 23);
		contentPane.add(btnBack);
	}
}
