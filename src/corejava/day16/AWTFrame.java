package corejava.day16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class AWTFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2712504531889696088L;
	JButton panicButton, okButton;
    JLabel statusLabel;
	Container contentPane;

	public AWTFrame(String aTitle) {
		contentPane = getContentPane();
		setTitle(aTitle);
		contentPane.setLayout(new BorderLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		panicButton = new JButton("cancel");
		buttonPanel.add(panicButton);
		okButton = new JButton("ok");
		buttonPanel.add(okButton);
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		statusLabel = new JLabel("Ready?");
		contentPane.add(statusLabel, BorderLayout.SOUTH);
		setSize(200, 100);
		setVisible(true);
		
		class MyActionListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		}
		
		class MyMouseListenner implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				System.out.println(btn.getText()+"-----mouseClicked");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				System.out.println(btn.getText()+"-----mousePressed");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				System.out.println(btn.getText()+"-----mouseReleased");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				System.out.println(btn.getText()+"-----mouseEntered");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				System.out.println(btn.getText()+"-----mouseExited");
			}
			
		};
		
		panicButton.addMouseListener(new MyMouseListenner());
		
		okButton.addMouseListener(new MyMouseListenner());
		
//		panicButton.addActionListener(new MyActionListener());
//		
//		okButton.addActionListener(new MyActionListener());
		
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println(e.getNewState()+"---打开窗口");
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("---最小化窗口");
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("---显示窗口");
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("---失去焦点");
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("---关闭窗口中");
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("---关闭完窗口");				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("---获得焦点");
			}
		});
	}

	public static void main(String args[]) {
		new AWTFrame("AWT Example");
	}
}
