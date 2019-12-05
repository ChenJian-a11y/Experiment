package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class button extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					button frame = new button();
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
	public button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Button button = new Button("Choosecourse");
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButtonDemo a = new JRadioButtonDemo();
			    a.setVisible(true);
			}
		});
		
	
		
		Button button_1 = new Button("printcourse");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printcourse b = new printcourse();
			    b.setVisible(true);
			}
		});
		contentPane.add(button_1, BorderLayout.WEST);
		
		Button button_2 = new Button("QuitCourse");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuitCourse c = new QuitCourse();
			    
				
			}
		});
		contentPane.add(button_2, BorderLayout.EAST);
		
		Button button_3 = new Button("AddCourse");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Demo d = new Demo();
			    d.setVisible(true);
			}
		});
		contentPane.add(button_3, BorderLayout.SOUTH);
	}

}
