package GUI;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.*;

public class JRadioButtonDemo{
	JFrame frame = new JFrame("Choice Course");
	JRadioButton rb1 = new JRadioButton("JRadioButton 1");
	JRadioButton rb2 = new JRadioButton("JRadioButton 2");
	JRadioButton rb3 = new JRadioButton("JRadioButton 3");
	JRadioButton rb4 = new JRadioButton("JRadioButton 4");
	JRadioButton rb5 = new JRadioButton("JRadioButton 5");
	JRadioButton rb6 = new JRadioButton("JRadioButton 6");
	JTextArea ta = new JTextArea();
	public static void main(String args[]) {
		JRadioButtonDemo ts = new JRadioButtonDemo();
		ts.go();
	}
	public void go() {
		Array strarray=new Array();
		String[] array0=strarray.getArray();
		String[] array1=new String[6];
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JButton btn1=new JButton("ȷ��");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String[] array=new String[6];
			if(rb1.isSelected()){
					array[0]=array0[0];
					JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
			}
			if(rb2.isSelected()){
					array[0]=array0[0];
					JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
			}
			if(rb3.isSelected()){
					array[0]=array0[0];
					JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
			}
			if(rb4.isSelected()){
					array[0]=array0[0];
					JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
			}
			if(rb5.isSelected()){
					array[0]=array0[0];
					JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
			}
			if(rb6.isSelected()){
					array[0]=array0[0];
					JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
			}
			
	}
		});
		p1.add(rb1);
		p1.add(rb2);
		p1.add(rb3);
		p1.add(rb4);
		p1.add(rb5);
		p1.add(rb6);
		p1.add(btn1);
//		ButtonGroup group2 = new ButtonGroup();
//		group2.add(rb4);
//		group2.add(rb5);
 //    	group2.add(rb6);
		JScrollPane jp = new JScrollPane(ta);
		p3.setLayout(new BorderLayout());
		p3.add(jp);
		ta.getText();
		ActionListener a1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton rb = (JRadioButton) e.getSource();
				if(rb == rb1) {
					ta.append("\n  1   ��Ŀ:��ѧ      ���� :��201      ʱ��:9��40   ��ʦ:    ����ʦ      �Ա�: ��     "+rb1.isSelected());
				    array1[0]=array0[0];
				}
				else if(rb == rb2) {
					ta.append("\n 2   ��Ŀ:����      ���� :��202     ʱ��:10��10      ��ʦ: ����ʦ      �Ա�: Ů     "+rb2.isSelected());
					array1[1]=array0[1];
				}
				else if(rb == rb3) {
					ta.append("\n3   ��Ŀ:Ӣ��      ���� :��203      ʱ��:12��30     �� ʦ: ����ʦ      �Ա�: ��     "+rb3.isSelected());
					array1[2]=array0[2];
				}
				else if(rb == rb4) {
					ta.append("\n4   ��Ŀ:java   ���� :��204     ʱ��:14��30     �� ʦ: ����ʦ      �Ա�: ��     "+rb4.isSelected());
					array1[3]=array0[3];
				}
				else if(rb == rb5) {
					ta.append("\n5   ��Ŀ:python   ���� :��205      ʱ��:16��30     �� ʦ: ����ʦ      �Ա�: ��     "+rb5.isSelected());
					array1[4]=array0[4];
				}
				else if(rb == rb6) {
					ta.append("\n6   ��Ŀ:C����     ���� :��206      ʱ��:18��30     �� ʦ: ����ʦ      �Ա�: Ů     "+rb6.isSelected());
					array1[5]=array0[5];
				}
			writeFile(array1);
			}
		};
		rb1.addActionListener(a1);
		rb2.addActionListener(a1);
		rb3.addActionListener(a1);
		rb4.addActionListener(a1);
		rb5.addActionListener(a1);
		rb6.addActionListener(a1);
		p4.setLayout(new GridLayout(0,1));
	    p4.add(p1);
	    p4.add(p2);
	    Container cp = frame.getContentPane();
	    cp.setLayout(new GridLayout(0,1));
	    cp.add(p3);
	    cp.add(p4);
	    cp.add(p5);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);
	}
	public static void writeFile(String[] s) {
        try {
            File writeName = new File("C:\\Users\\��ز�\\Desktop\\Java\\java ʵ���\\SJ.txt"); // ���·�������û����Ҫ����һ���µ�output.txt�ļ�
            writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
            	for(int i=0;i<s.length;i++) {
            		if(s[i]!=null) {
            		out.write(s[i]); // \r\n��Ϊ����
            	}
                out.flush(); // �ѻ���������ѹ���ļ�
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}























	

