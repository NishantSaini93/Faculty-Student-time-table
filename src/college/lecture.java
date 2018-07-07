package college;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class lecture {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	/**
	 * @wbp.nonvisual location=111,-31
	 */
	private final JTextField textField_25 = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lecture window = new lecture();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 public void clock()
 {Thread clock=new Thread(){
 public void run()
 {try
 {
	 for(;;){
	 Calendar cal=new GregorianCalendar();
	 int second=cal.get(Calendar.SECOND);
	 int min=cal.get(Calendar.MINUTE);
	 int hou=cal.get(Calendar.HOUR);
	 textField.setText(hou+":"+min+":"+second);
	 
	 sleep(1000);
	 
 }
 }
 catch(InterruptedException e)
 {
	 e.printStackTrace();
 }
 
 }
 };
 clock.start();
 
	 
 }
	/**
	 * Create the application.
	 */
	public lecture() {
		initialize();
		clock();
	}
	public ResultSet rs=null ;
	   public Connection connection=null;
	   public Statement stmt=null;
	    public String s1,s2;
	    public String s11,s22,s33,s44,s55,s66;
	    public String l1="1",l2="2",l3="3",l4="4",l5="5",l6="6",l7="7";
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField_25.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 1020, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClock = new JLabel("Clock");
		lblClock.setBounds(375, 11, 46, 14);
		frame.getContentPane().add(lblClock);
		
		textField = new JTextField();
		textField.setBounds(352, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFacultyName = new JLabel("Faculty name");
		lblFacultyName.setBounds(10, 111, 76, 14);
		frame.getContentPane().add(lblFacultyName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"m.tech(1st year)", "m.tech(2nd year)", "b.tech(1st year)", "b.tech(2nd year)", "b.tech(3rd year)", "b.tech(4th year)"}));
		comboBox.setBounds(22, 36, 109, 20);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 151, 162, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 198, 162, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 229, 162, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 260, 162, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 301, 162, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 342, 162, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 382, 162, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
		comboBox_1.setBounds(190, 36, 91, 20);
		frame.getContentPane().add(comboBox_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(212, 151, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(212, 198, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(212, 229, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(212, 260, 86, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(212, 301, 86, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(212, 342, 86, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(212, 382, 86, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(395, 151, 313, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(395, 198, 313, 20);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(395, 229, 313, 20);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(395, 260, 310, 20);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(395, 301, 313, 20);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(395, 342, 313, 20);
		frame.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(395, 382, 313, 20);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblRoomNumber = new JLabel("room number");
		lblRoomNumber.setBounds(227, 111, 71, 14);
		frame.getContentPane().add(lblRoomNumber);
		
		JLabel lblSubject = new JLabel("subject");
		lblSubject.setBounds(447, 111, 46, 14);
		frame.getContentPane().add(lblSubject);
		
		JLabel label = new JLabel("1");
		label.setBounds(320, 154, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("2");
		lblNewLabel.setBounds(320, 201, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("3");
		label_1.setBounds(320, 232, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("4");
		label_2.setBounds(320, 263, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("5");
		label_3.setBounds(320, 304, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("6");
		label_4.setBounds(320, 345, 46, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("7");
		label_5.setBounds(320, 385, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel lblLectureNo = new JLabel("lecture no");
		lblLectureNo.setBounds(308, 111, 71, 14);
		frame.getContentPane().add(lblLectureNo);
		
		JButton btnNewButton = new JButton("faculty help");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			
				Faculty fa=new Faculty();
				fa.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(454, 35, 123, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCheck = new JButton("check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{ 
					Class.forName("com.mysql.jdbc.Driver");
				s1=(String) comboBox.getSelectedItem();
				
				s2=(String) comboBox_1.getSelectedItem();
				connection = DriverManager.getConnection("jdbc:mysql://localhost/coll","root","root");
				
				stmt= connection.createStatement();
				
				
				
				rs=stmt.executeQuery("select * from table11 where course='" +s1+"' and day='"+s2+"'");
					
					while(rs.next())
			           {
			                s11=rs.getString("course");
			                s22=rs.getString("day");
			                s33=rs.getString("lctrno");
			               s44=rs.getString("faculty");
			               s55=rs.getString("room");
			             s66=rs.getString("subject");
			             if(s11.equals(s1 )&& s22.equals(s2) && s33.equals(l1) )  
			             {
			            	 	
			            	 textField_1.setText(s44);
			            	 textField_9.setText(s55);
			            	 textField_17.setText(s66);
			             }
			             
			             else  if(s11.equals(s1 )&& s22.equals(s2) && s33.equals(l2) )
			                 {
			            	 textField_2.setText(s44); 
			            	 textField_10.setText(s55);
			            	 textField_18.setText(s66);
			                 }
			             else  if(s11.equals(s1 )&& s22.equals(s2) && s33.equals(l3) )
		                 {
		            	 textField_3.setText(s44); 
		            	 textField_11.setText(s55);
		            	 textField_19.setText(s66);
		                 }
			             else  if(s11.equals(s1 )&& s22.equals(s2) && s33.equals(l4) )
		                 {
		            	 textField_4.setText(s44); 
		            	 textField_12.setText(s55);
		            	 textField_20.setText(s66);
		                 }
			             else  if(s11.equals(s1 )&& s22.equals(s2) && s33.equals(l5) )
		                 {
		            	 textField_5.setText(s44);  
		            	 textField_13.setText(s55);
		            	 textField_21.setText(s66);
		                 }
			             else  if(s11.equals(s1 )&& s22.equals(s2) && s33.equals(l6) )
		                 {
		            	 textField_6.setText(s44);
		            	 textField_14.setText(s55);
		            	 textField_22.setText(s66);
		                 }
			             else  if(s11.equals(s1 )&& s22.equals(s2) && s33.equals(l7) )
		                 {
		            	 textField_7.setText(s44); 
		            	 textField_15.setText(s55);
		            	 textField_23.setText(s66);
		                 }
			           }
			            stmt.close();
				
				}
				catch(Exception e)
				{
					 System.out.println(e);
					
				}
			}
		});
		btnCheck.setBounds(624, 35, 89, 23);
		frame.getContentPane().add(btnCheck);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");
				textField_6.setText(" ");
				textField_7.setText(" ");
				textField_9.setText(" ");
				textField_10.setText(" ");
				textField_11.setText(" ");
				textField_12.setText(" ");
				textField_13.setText(" ");
				textField_14.setText(" ");
				textField_15.setText(" ");
				textField_17.setText(" ");
				textField_18.setText(" ");
				textField_19.setText(" ");
				textField_20.setText(" ");
				textField_21.setText(" ");
				textField_22.setText(" ");
				textField_23.setText(" ");
				
				
			}
		});
		btnClear.setBounds(624, 96, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
