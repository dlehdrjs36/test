import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComponent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

class Tetris {
	private static final int width = 10;
	private static final int height = 20;
	private static final int bVWidth = 6;
	private static final int bVheight = 4;
	
	// 테트리스 게임 화면 생성, 셋팅
	public static JPanel TetrisView() {
		// 테트리스 창 패널.
		JPanel jp = new JPanel();
		JPanel[][] panel = new JPanel[height][width];		
		
		jp.setLayout(new GridLayout(height, width, 0, 0));		
		// 패널위에 패널 장착
		for ( int b = 0; b < height; b++) {
			for ( int i = 0; i < width; i++) { 
				panel[b][i] = new JPanel();
				panel[b][i].setBackground(Color.DARK_GRAY);
				panel[b][i].setBorder(new LineBorder(Color.lightGray));
				jp.add(panel[b][i]);
			}
		}
		// ex) 패널 색칠 
		//panel[1][0].setBackground(Color.red);		
		jp.setBackground(Color.GRAY);
		jp.setBounds(22, 30, 259, 401);
		
		return jp;
	}
	
	// 미리보기 패널 만듬.
	public static JPanel preViewPanel(int i) {	
		JPanel jp = new JPanel();
		
		jp.setBorder(new LineBorder(Color.RED));
		jp.setBackground(Color.BLACK);
		switch(i) {
			case 0 : jp.setBounds(305, 30, 113, 41); break;
			case 1 : jp.setBounds(305, 81, 113, 41); break;
			case 2 : jp.setBounds(305, 132, 113, 41); break;
			case 3 : jp.setBounds(305, 183, 113, 41); break;
			default : System.out.println("블록 미리보기 셋팅중..."); 
		}
		jp.setLayout(new GridLayout(bVheight, bVWidth, 0, 0));	
		return jp;
	}
	//블록 미리보기. 패널 셋팅 메소드. 프리뷰 패널에 패널을 붙임.
	public static void preView(JPanel jp) {
		JPanel[][] panel = new JPanel[bVheight][bVWidth];
		
		for ( int b = 0; b < bVheight; b++ ) {
			for ( int i = 0 ; i < bVWidth ; i++) {
				panel[b][i] = new JPanel();
				panel[b][i].setBackground(Color.GRAY);
				//block.setBorder(new LineBorder(Color.LIGHT_GRAY));
				jp.add(panel[b][i]);
			}
		}
	}
	public static void createBlockView() {

	}
	
}
public class TestWB extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWB frame = new TestWB();
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
	public TestWB() {
		getContentPane().setForeground(Color.MAGENTA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 489);
		getContentPane().setLayout(null);
		
		JPanel jp = Tetris.TetrisView();
		getContentPane().add(jp);
		
		for( int i=0; i< 4; i++) {
			// 블럭 미리보기 화면 생성
			JPanel blockPreview = Tetris.preViewPanel(i);
			// 블럭 미리보기 화면 셋팅
			Tetris.preView(blockPreview);
			// 블럭 미리보기 패널을 메인에 붙임
			getContentPane().add(blockPreview);
		}
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(280, 10, 13, 421);
		getContentPane().add(verticalStrut);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setEnabled(false);
		textPane.setText("     점수");
		textPane.setBounds(325, 234, 74, 21);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setEnabled(false);
		textPane_1.setEditable(false);
		textPane_1.setBounds(305, 265, 112, 21);
		getContentPane().add(textPane_1);
	}
}
