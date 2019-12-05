package GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuitCourse extends JFrame{
	public static void main(String args[]) {
		QuitCourse demo = new QuitCourse();
    }
	 public QuitCourse() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ");
			this.setBounds(400,150,1200,300);;
			this.setVisible(true);
	    }
	public void init() {
		String[] str = new String[6];
		JFrame frame = new JFrame();
		frame.setTitle("QuiteCourse");
		JPanel panel2 = new JPanel();
		str = readFile().split("��");
		JList List = new JList(str);
		JButton btn1 = new JButton("�˿�");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String[] str1 = readFile().split("��");
				if(List.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "��û���˿�");
					return;
				}
				for(int i=0;i<str1.length;i++) {
					if(List.isSelectedIndex(i)) {
						str1[i] = null;
					}
					else {
						str1[i] = str1[i]+"��";
					}
				}
				writeFile(str1);
				JOptionPane.showMessageDialog(null, "�˿γɹ�");
				frame.setVisible(false);
			}
		});
		JButton btn2 = new JButton("�˳�");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(List);
		this.add(panel2);
	}	
		
		private static String readFile() {
			String str = "";
			String pathname = "C:\\Users\\��ز�\\Desktop\\Java\\java ʵ���\\SJ.txt";
			try(FileReader reader = new FileReader(pathname);
					BufferedReader br = new BufferedReader(reader))
			{
					String line;
					while((line = br.readLine())!=null) {
					str=str+line;
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
					return str;
					
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
}
