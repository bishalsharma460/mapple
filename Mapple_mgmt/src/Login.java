import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tf_id;
	private JPasswordField tf_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Mapple Restaurant Management System ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.ITALIC, 28));
		label.setBorder(new LineBorder(Color.RED, 11, true));
		label.setBackground(Color.RED);
		
		JLabel label_1 = new JLabel("Id");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		tf_id = new JTextField();
		tf_id.setColumns(10);
		
		JLabel label_3 = new JLabel("Password");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		tf_pass = new JPasswordField();
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				Connection conn = null;
				PreparedStatement pst = null;
				//public void actionPerformed(ActionEvent e) {
					
					//String	e_id11 = tf_e_id.getText();
					
					
					try{
						Class.forName("com.mysql.jdbc.Driver");
					String sql =" select * from employee_details where e_id = ? and password=?"; 
					conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mapple","root","");
					pst = (PreparedStatement) conn.prepareStatement(sql);
					pst.setString(1, tf_id.getText());
					pst.setString(2, tf_pass.getText());	
					
					ResultSet rs = pst.executeQuery();
					
					
					if(rs.next()) {
						
						Home1 hm1 = new Home1();
						hm1.setVisible(true);
						setVisible(false);
					
					//JOptionPane.showMessageDialog(null,"You have Remove successfully");
					}
					else {
						
						JOptionPane.showMessageDialog(null,"Incorrect input !!! ");
						tf_id.setText("");
						 tf_pass.setText("");
					}
					}
					
					//con.close();
					catch(Exception ex){
					JOptionPane.showMessageDialog(null,ex);
					}
					
				}
				
				
			
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_4 = new JLabel("Login Here ");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(163, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addGap(53))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
									.addGap(18)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tf_pass, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
									.addComponent(tf_id, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(184, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE)
							.addGap(135))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tf_id, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tf_pass, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(188, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
