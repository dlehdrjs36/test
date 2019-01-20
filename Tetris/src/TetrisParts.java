import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.Random;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class TetrisParts extends JFrame {

	private JPanel contentPane;
	public static JPanel[][][] Block() {
		Random ran = new Random(7);
		
		
		
		return null;
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TetrisParts frame = new TetrisParts();
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
	public TetrisParts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// panel_4 : 아이미노
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(26, 28, 68, 19);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 255, 255));
		panel.setName("아이미노");
		panel_4.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 255, 255));
		panel_4.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(0, 255, 255));
		panel_4.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setName("아이미노4");
		panel_4.add(panel_3);
		
		// panel_7 : L 미노
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(106, 28, 34, 57);
		contentPane.add(panel_7);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(0, 0, 17, 19);
		panel_5.setName("엘미노");
		panel_5.setBackground(new Color(255, 140, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_6.setBounds(0, 38, 17, 19);
		panel_6.setName("엘미노2");
		panel_6.setBackground(new Color(255, 140, 0));
		
		panel_7.setLayout(null);
		panel_7.add(panel_5);
		panel_7.add(panel_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setName("엘미노3");
		panel_8.setBackground(new Color(255, 140, 0));
		panel_8.setBounds(17, 38, 17, 19);
		panel_7.add(panel_8);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_10.setName("엘미노4");
		panel_10.setBackground(new Color(255, 140, 0));
		panel_10.setBounds(0, 19, 17, 19);
		panel_7.add(panel_10);
		
		// panel_9 : J 미노
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(166, 28, 34, 57);
		contentPane.add(panel_9);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setName("제이미노");
		panel_11.setBackground(new Color(0, 0, 255));
		panel_11.setBounds(17, 0, 17, 19);
		panel_9.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_12.setName("제이미노4");
		panel_12.setBackground(new Color(0, 0, 255));
		panel_12.setBounds(0, 38, 17, 19);
		panel_9.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_13.setName("제이미노3");
		panel_13.setBackground(new Color(0, 0, 255));
		panel_13.setBounds(17, 38, 17, 19);
		panel_9.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_14.setName("제이미노2");
		panel_14.setBackground(new Color(0, 0, 255));
		panel_14.setBounds(17, 19, 17, 19);
		panel_9.add(panel_14);
		
		//panel_15 : O 미노
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(222, 28, 34, 38);
		contentPane.add(panel_15);
		
		JPanel panel_17 = new JPanel();
		panel_17.setName("O미노1");
		panel_17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_17.setBackground(new Color(255, 255, 0));
		panel_17.setBounds(0, 0, 17, 19);
		panel_15.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setName("O미노2");
		panel_18.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_18.setBackground(new Color(255, 255, 0));
		panel_18.setBounds(17, 0, 17, 19);
		panel_15.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setName("O미노3");
		panel_19.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_19.setBackground(new Color(255, 255, 0));
		panel_19.setBounds(0, 19, 17, 19);
		panel_15.add(panel_19);
		
		JPanel panel_16 = new JPanel();
		panel_16.setName("O미노4");
		panel_16.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_16.setBackground(new Color(255, 255, 0));
		panel_16.setBounds(17, 19, 17, 19);
		panel_15.add(panel_16);
		
		// panel_20 : S미노
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBounds(49, 103, 51, 38);
		contentPane.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setName("S미노");
		panel_21.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_21.setBackground(new Color(0, 255, 0));
		panel_21.setBounds(34, 0, 17, 19);
		panel_20.add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setName("S미노2");
		panel_22.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_22.setBackground(new Color(0, 255, 0));
		panel_22.setBounds(17, 0, 17, 19);
		panel_20.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setName("S미노3");
		panel_23.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_23.setBackground(new Color(0, 255, 0));
		panel_23.setBounds(17, 19, 17, 19);
		panel_20.add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setName("S미노4");
		panel_24.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_24.setBackground(new Color(0, 255, 0));
		panel_24.setBounds(0, 19, 17, 19);
		panel_20.add(panel_24);
		
		// panel_25 : Z미노
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBounds(222, 103, 51, 38);
		contentPane.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setName("Z미노");
		panel_26.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_26.setBackground(new Color(255, 0, 0));
		panel_26.setBounds(0, 0, 17, 19);
		panel_25.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setName("Z미노2");
		panel_27.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_27.setBackground(new Color(255, 0, 0));
		panel_27.setBounds(17, 0, 17, 19);
		panel_25.add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setName("Z미노3");
		panel_28.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_28.setBackground(new Color(255, 0, 0));
		panel_28.setBounds(17, 19, 17, 19);
		panel_25.add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setName("Z미노4");
		panel_29.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_29.setBackground(new Color(255, 0, 0));
		panel_29.setBounds(34, 19, 17, 19);
		panel_25.add(panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBounds(135, 103, 51, 38);
		contentPane.add(panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setName("S미노");
		panel_31.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_31.setBackground(new Color(148, 0, 211));
		panel_31.setBounds(17, 0, 17, 19);
		panel_30.add(panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setName("S미노2");
		panel_32.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_32.setBackground(new Color(148, 0, 211));
		panel_32.setBounds(0, 19, 17, 19);
		panel_30.add(panel_32);
		
		JPanel panel_33 = new JPanel();
		panel_33.setName("S미노3");
		panel_33.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_33.setBackground(new Color(148, 0, 211));
		panel_33.setBounds(17, 19, 17, 19);
		panel_30.add(panel_33);
		
		JPanel panel_34 = new JPanel();
		panel_34.setName("S미노4");
		panel_34.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_34.setBackground(new Color(148, 0, 211));
		panel_34.setBounds(34, 19, 17, 19);
		panel_30.add(panel_34);
		
		System.out.println(panel_4.getComponent(3).getName());
		System.out.println(panel_7.getComponent(3).getName());
	}

}
