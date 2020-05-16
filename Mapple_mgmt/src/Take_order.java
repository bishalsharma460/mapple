import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.PreparedStatement;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Take_order extends JFrame {

	private JPanel contentPane;
	private JTextField tf_pi_ch;
	private JTextField tf_pi_fch;
	private JTextField tf_pi_keemch;
	private JTextField tf_pi_maxch;
	private JTextField tf_ro_veg;
	private JTextField tf_ro_paneer;
	private JTextField tf_ro_egg;
	private JTextField tf_ro_chi;
	private JTextField tf_bur_vlite;
	private JTextField tf_bur_vmapple;
	private JTextField tf_bur_chese;
	private JTextField tf_bur_spaneer;
	private JTextField tf_bur_egg;
	private JTextField tf_bur_chicklite;
	private JTextField tf_bur_spclchick;
	private JTextField tf_bur_tandoorichick;
	private JTextField tf_coke;
	private JTextField tf_sprite;
	private JTextField tf_mango;
	private JTextField tf_totalbill;
	
	int pizza_chicken = 350;
	int pizza_feast = 350;
	int pizza_keema = 300;
	int pizza_mexican = 310;
	int roll_veg = 140;
	int roll_paneer = 140;
	int roll_egg = 130;
	int roll_chicken = 179;

	int burger_veglite = 79;
	int burger_vegmapple = 79;
	int burger_vegcheese = 99;
	int burger_vegspicypaneer = 129;

	int burger_egg = 99;
	int burger_chickenlite = 99;
	int burger_special_chicken = 159;
	int burger_chicken_tandoori = 169;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Take_order frame = new Take_order();
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
	public Take_order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.PINK);
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 11, true));
		
		JLabel label = new JLabel("Mapple Restaurant Management System ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.ITALIC, 28));
		label.setBorder(new LineBorder(new Color(192, 192, 192), 11, true));
		label.setBackground(Color.BLACK);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1.setBackground(SystemColor.controlHighlight);
		
		JLabel label_1 = new JLabel("Pizza");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_1.setBounds(54, 35, 64, 25);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Burger");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_2.setBounds(477, 35, 89, 25);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Refreshment");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_3.setBounds(29, 231, 137, 25);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Roll");
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_4.setBounds(271, 35, 64, 25);
		panel_1.add(label_4);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.GRAY);
		separator.setBounds(207, 35, 19, 204);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(Color.GRAY);
		separator_1.setBounds(382, 25, 19, 377);
		panel_1.add(separator_1);
		
		JLabel label_5 = new JLabel("Chicken ");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBounds(26, 70, 55, 30);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Feast Chicken");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_6.setBounds(29, 110, 90, 13);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Keema Chicken");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(29, 133, 107, 13);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Maxican Chicken");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBounds(25, 162, 116, 13);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Veg ");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_9.setBounds(226, 64, 55, 25);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Paneer");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(226, 94, 55, 25);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("Egg");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds(226, 127, 55, 25);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Chicken");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_12.setBounds(226, 162, 55, 25);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel(" Veg Lite");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_13.setBounds(390, 70, 73, 30);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("veg mapple ");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_14.setBounds(391, 111, 107, 25);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Chesese");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_15.setBounds(391, 150, 107, 25);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Spicy Paneer");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_16.setBounds(391, 185, 107, 25);
		panel_1.add(label_16);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.GRAY);
		separator_2.setBounds(207, 220, 433, 13);
		panel_1.add(separator_2);
		
		JLabel label_17 = new JLabel("Egg Burger");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_17.setBounds(390, 231, 73, 30);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Chicken Lite");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_18.setBounds(390, 271, 96, 30);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("Special Chicken");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_19.setBounds(390, 306, 108, 30);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("Chicken Tandoori Burger");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_20.setBounds(390, 342, 162, 30);
		panel_1.add(label_20);
		
		tf_pi_ch = new JTextField();
		tf_pi_ch.setText("0");
		tf_pi_ch.setColumns(10);
		tf_pi_ch.setBounds(133, 77, 64, 19);
		panel_1.add(tf_pi_ch);
		
		tf_pi_fch = new JTextField();
		tf_pi_fch.setText("0");
		tf_pi_fch.setColumns(10);
		tf_pi_fch.setBounds(133, 108, 64, 19);
		panel_1.add(tf_pi_fch);
		
		tf_pi_keemch = new JTextField();
		tf_pi_keemch.setText("0");
		tf_pi_keemch.setColumns(10);
		tf_pi_keemch.setBounds(135, 131, 63, 19);
		panel_1.add(tf_pi_keemch);
		
		tf_pi_maxch = new JTextField();
		tf_pi_maxch.setText("0");
		tf_pi_maxch.setColumns(10);
		tf_pi_maxch.setBounds(134, 160, 63, 19);
		panel_1.add(tf_pi_maxch);
		
		tf_ro_veg = new JTextField();
		tf_ro_veg.setText("0");
		tf_ro_veg.setColumns(10);
		tf_ro_veg.setBounds(291, 70, 64, 19);
		panel_1.add(tf_ro_veg);
		
		tf_ro_paneer = new JTextField();
		tf_ro_paneer.setText("0");
		tf_ro_paneer.setColumns(10);
		tf_ro_paneer.setBounds(291, 98, 64, 19);
		panel_1.add(tf_ro_paneer);
		
		tf_ro_egg = new JTextField();
		tf_ro_egg.setText("0");
		tf_ro_egg.setColumns(10);
		tf_ro_egg.setBounds(291, 131, 64, 19);
		panel_1.add(tf_ro_egg);
		
		tf_ro_chi = new JTextField();
		tf_ro_chi.setText("0");
		tf_ro_chi.setColumns(10);
		tf_ro_chi.setBounds(291, 160, 64, 19);
		panel_1.add(tf_ro_chi);
		
		tf_bur_vlite = new JTextField();
		tf_bur_vlite.setText("0");
		tf_bur_vlite.setColumns(10);
		tf_bur_vlite.setBounds(487, 68, 64, 19);
		panel_1.add(tf_bur_vlite);
		
		tf_bur_vmapple = new JTextField();
		tf_bur_vmapple.setText("0");
		tf_bur_vmapple.setColumns(10);
		tf_bur_vmapple.setBounds(487, 108, 64, 19);
		panel_1.add(tf_bur_vmapple);
		
		tf_bur_chese = new JTextField();
		tf_bur_chese.setText("0");
		tf_bur_chese.setColumns(10);
		tf_bur_chese.setBounds(488, 150, 64, 25);
		panel_1.add(tf_bur_chese);
		
		tf_bur_spaneer = new JTextField();
		tf_bur_spaneer.setText("0");
		tf_bur_spaneer.setColumns(10);
		tf_bur_spaneer.setBounds(488, 185, 64, 25);
		panel_1.add(tf_bur_spaneer);
		
		tf_bur_egg = new JTextField();
		tf_bur_egg.setText("0");
		tf_bur_egg.setColumns(10);
		tf_bur_egg.setBounds(487, 231, 64, 25);
		panel_1.add(tf_bur_egg);
		
		tf_bur_chicklite = new JTextField();
		tf_bur_chicklite.setText("0");
		tf_bur_chicklite.setColumns(10);
		tf_bur_chicklite.setBounds(488, 271, 64, 25);
		panel_1.add(tf_bur_chicklite);
		
		tf_bur_spclchick = new JTextField();
		tf_bur_spclchick.setText("0");
		tf_bur_spclchick.setColumns(10);
		tf_bur_spclchick.setBounds(502, 310, 64, 25);
		panel_1.add(tf_bur_spclchick);
		
		tf_bur_tandoorichick = new JTextField();
		tf_bur_tandoorichick.setText("0");
		tf_bur_tandoorichick.setColumns(10);
		tf_bur_tandoorichick.setBounds(555, 349, 64, 25);
		panel_1.add(tf_bur_tandoorichick);
		
		JLabel label_21 = new JLabel("Coke");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_21.setBounds(29, 281, 55, 30);
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("Sprite");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_22.setBounds(29, 316, 55, 30);
		panel_1.add(label_22);
		
		JLabel label_23 = new JLabel("Mango Shake");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_23.setBounds(26, 352, 110, 30);
		panel_1.add(label_23);
		
		tf_coke = new JTextField();
		tf_coke.setText("0");
		tf_coke.setColumns(10);
		tf_coke.setBounds(133, 278, 64, 25);
		panel_1.add(tf_coke);
		
		tf_sprite = new JTextField();
		tf_sprite.setText("0");
		tf_sprite.setColumns(10);
		tf_sprite.setBounds(133, 313, 64, 25);
		panel_1.add(tf_sprite);
		
		tf_mango = new JTextField();
		tf_mango.setText("0");
		tf_mango.setColumns(10);
		tf_mango.setBounds(133, 349, 64, 25);
		panel_1.add(tf_mango);
		
		JButton button = new JButton("Total ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int v_pi_ch = Integer.parseInt(tf_pi_ch.getText())* pizza_chicken;
					int v_pi_fch = Integer.parseInt(tf_pi_fch.getText())* pizza_feast;  
					int v_pi_keemch = Integer.parseInt(tf_pi_keemch.getText()) * pizza_keema;
					int v_pi_maxch = Integer.parseInt(tf_pi_maxch.getText())* pizza_mexican;
					int v_ro_veg = Integer.parseInt(tf_ro_veg.getText()) * roll_veg;
					int v_ro_paneer = Integer.parseInt(tf_ro_paneer.getText())* roll_paneer;
					int v_ro_egg = Integer.parseInt(tf_ro_egg.getText())* roll_egg;
					int v_ro_chi = Integer.parseInt(tf_ro_chi.getText())* roll_chicken;
					int v_bur_vlite = Integer.parseInt(tf_bur_vlite.getText()) * burger_veglite;
					int v_bur_vmapple = Integer.parseInt(tf_bur_vmapple.getText())* burger_vegmapple ;
					int v_bur_chese = Integer.parseInt(tf_bur_chese.getText()) * burger_vegcheese;
					int v_bur_spaneer = Integer.parseInt(tf_bur_spaneer.getText()) * burger_vegspicypaneer;
					int v_bur_egg = Integer.parseInt(tf_bur_egg.getText()) * burger_egg;
					int v_bur_chicklite = Integer.parseInt(tf_bur_chicklite.getText())* burger_chickenlite;
					int v_bur_spclchick = Integer.parseInt(tf_bur_spclchick.getText()) *  burger_special_chicken;
					int v_bur_tandoorichick = Integer.parseInt(tf_bur_tandoorichick.getText()) * burger_chicken_tandoori;
					int v_coke = Integer.parseInt(tf_coke.getText()) *20;
					int v_sprite = Integer.parseInt(tf_sprite.getText())* 20;
					int v_mango = Integer.parseInt(tf_mango.getText()) *20;
					
					int t1,t2,t3,t4,total;
					t1= v_pi_ch + v_pi_fch + v_pi_keemch + v_pi_maxch;
					t2 = v_ro_veg + v_ro_egg +v_ro_paneer +v_ro_chi;
					t3 =v_bur_vlite + v_bur_vmapple + v_bur_chese + v_bur_spaneer + v_bur_egg +v_bur_chicklite + v_bur_spclchick +v_bur_tandoorichick;
					t4 = v_coke + v_sprite+v_mango;
					total = t1+t2+t3+t4;
					String ttotal = Integer.toString(total);
					tf_totalbill.setText(ttotal);
					
				
				}
					catch (NumberFormatException x) {
					System.out.println("Error : "+ x.getMessage());
					}
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button_1 = new JButton("Clear");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf_pi_ch.setText("0");
				 tf_pi_fch.setText("0");
					tf_pi_keemch.setText("0");
					 tf_pi_maxch.setText("0");
					 tf_ro_veg.setText("0");
					 tf_ro_paneer.setText("0");
					 tf_ro_egg.setText("0");
					tf_ro_chi.setText("0");
					 tf_bur_vlite.setText("0");
					tf_bur_vmapple.setText("0");
					tf_bur_chese.setText("0");
					tf_bur_spaneer.setText("0");
					tf_bur_egg.setText("0");
					tf_bur_chicklite.setText("0");
					tf_bur_spclchick.setText("0");
					 tf_bur_tandoorichick.setText("0");
					 tf_coke.setText("0");
					tf_sprite.setText("0");
					tf_mango.setText("0");
					tf_totalbill.setText("");
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button_2 = new JButton("Confirm");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int v_pi_ch = Integer.parseInt(tf_pi_ch.getText());
				int v_pi_fch = Integer.parseInt(tf_pi_fch.getText());  
				int v_pi_keemch = Integer.parseInt(tf_pi_keemch.getText()) ;
				int v_pi_maxch = Integer.parseInt(tf_pi_maxch.getText());
				int v_ro_veg = Integer.parseInt(tf_ro_veg.getText()) ;
				int v_ro_paneer = Integer.parseInt(tf_ro_paneer.getText());
				int v_ro_egg = Integer.parseInt(tf_ro_egg.getText());
				int v_ro_chi = Integer.parseInt(tf_ro_chi.getText());
				int v_bur_vlite = Integer.parseInt(tf_bur_vlite.getText()) ;
				int v_bur_vmapple = Integer.parseInt(tf_bur_vmapple.getText()) ;
				int v_bur_chese = Integer.parseInt(tf_bur_chese.getText()) ;
				int v_bur_spaneer = Integer.parseInt(tf_bur_spaneer.getText()) ;
				int v_bur_egg = Integer.parseInt(tf_bur_egg.getText()) ;
				int v_bur_chicklite = Integer.parseInt(tf_bur_chicklite.getText());
				int v_bur_spclchick = Integer.parseInt(tf_bur_spclchick.getText()) ;
				int v_bur_tandoorichick = Integer.parseInt(tf_bur_tandoorichick.getText()) ;
			//	int v_coke = Integer.parseInt(tf_coke.getText());
				//int v_sprite = Integer.parseInt(tf_sprite.getText());
				//int v_mango = Integer.parseInt(tf_mango.getText()) ;
				int v_totalbill = Integer.parseInt(tf_totalbill.getText()) ;
				
				
				
				
				
				
				Connection conn = null;
				PreparedStatement pst = null;
				try{
				String sql ="INSERT INTO order_all(pizza_chicken,pizza_feast,pizza_keema,pizza_maxican,roll_veg,roll_paneer,roll_egg,roll_chicken,burger_veglite,burger_vegmapple,burger_vegcheese,burger_vegspicypaneer,burger_egg,burger_chickenlite,burger_special_chicken,burger_chicken_tandoori,total_amount)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mapple","root","");
				pst = (PreparedStatement) conn.prepareStatement(sql);
				pst.setInt(1,v_pi_ch);
				pst.setInt(2,v_pi_fch);
				pst.setInt(3,v_pi_keemch);
				pst.setInt(4,v_pi_maxch);
				pst.setInt(5,v_ro_veg);
				pst.setInt(6,v_ro_paneer);
				pst.setInt(7,v_ro_egg);
				pst.setInt(8,v_ro_chi);
				pst.setInt(9,v_bur_vlite);
				pst.setInt(10,v_bur_vmapple);
				pst.setInt(11,v_bur_chese);
				
				pst.setInt(12,v_bur_spaneer);
				pst.setInt(13,v_bur_egg);
				pst.setInt(14,v_bur_chicklite);
				pst.setInt(15,v_bur_spclchick);
				pst.setInt(16,v_bur_tandoorichick);
				pst.setInt(17,v_totalbill);
				//pst.setString(1,tf_pi_ch.getText());
				/*
				 * 
			
				
				tf_bur_chese.setText("0");
				tf_bur_spaneer.setText("0");
				tf_bur_egg.setText("0");
				tf_bur_chicklite.setText("0");
				tf_bur_spclchick.setText("0");
				 tf_bur_tandoorichick.setText("0");
				 tf_coke.setText("0");
				tf_sprite.setText("0");
				tf_mango.setText("0");
				tf_totalbill.setText("");
				 */
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"You have taken order successfully");
				}
				catch(Exception e1){
				JOptionPane.showMessageDialog(null,e1);
				}
			
				
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		tf_totalbill = new JTextField();
		tf_totalbill.setColumns(10);
		
		JLabel label_24 = new JLabel("Total");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton button_3 = new JButton("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order_mgmt omg = new order_mgmt();
				omg.setVisible(true);
				setVisible(false);
			}
		});
		button_3.setForeground(Color.BLUE);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_3.setBackground(Color.DARK_GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(118)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(47)
									.addComponent(tf_totalbill, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(64)
									.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(91)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(63)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(tf_totalbill, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(112, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
