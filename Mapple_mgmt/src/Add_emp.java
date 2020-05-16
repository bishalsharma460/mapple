import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class Add_emp extends JFrame {
	private JTextField tf_name;
	private JTextField tf_as;
	private JTextField tf_pass;
	private JTextField tf_con;
	private JTextField tf_addr;
	private JTextField tf_email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_emp frame = new Add_emp();
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
	public Add_emp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		
		JLabel label = new JLabel("Add employee here ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		tf_name = new JTextField();
		tf_name.setColumns(10);
		
		JLabel label_2 = new JLabel("AS");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		tf_as = new JTextField();
		tf_as.setColumns(10);
		
		JLabel label_3 = new JLabel("Password");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel label_4 = new JLabel("Contact");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel label_5 = new JLabel("Address");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel label_6 = new JLabel("Email");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		tf_pass = new JTextField();
		tf_pass.setColumns(10);
		
		tf_con = new JTextField();
		tf_con.setColumns(10);
		
		tf_addr = new JTextField();
		tf_addr.setColumns(10);
		
		tf_email = new JTextField();
		tf_email.setColumns(10);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Employee emppp = new Employee();
				emppp.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton button_1 = new JButton("Add Employee");
		button_1.addActionListener(new ActionListener() {
			Connection conn = null;
			PreparedStatement pst = null;
			public void actionPerformed(ActionEvent e) {
				
				String	name = tf_name.getText();
				String as = tf_as.getText();
				String pass = tf_pass.getText();
				String con = tf_con.getText();
				String addr = tf_addr.getText();
				String email = tf_email.getText();
				
				try{
				String sql ="INSERT INTO employee_details(e_name,as1,password,contact,address,email) VALUES (?,?,?,?,?,?)";
				conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mapple","root","");
				pst = (PreparedStatement) conn.prepareStatement(sql);
				pst.setString(1,name);
				pst.setString(2,as);
				pst.setString(3,pass);
				pst.setString(4,con);
				pst.setString(5,addr);
				pst.setString(6,email);
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"You have Add successfully");
				}
				catch(Exception ex){
				JOptionPane.showMessageDialog(null,ex);
				}
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(261)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(35)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(tf_email, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
										.addComponent(tf_addr, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
										.addComponent(tf_con, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
										.addComponent(tf_pass, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
										.addComponent(tf_as, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
										.addComponent(tf_name, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(117)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(298, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_name, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_as, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_pass, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_con, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_addr, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_email, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}

}
