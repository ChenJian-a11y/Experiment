package GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class Demo extends JFrame {

	public static void main(String args[]) throws Exception{
	JFrame f = new JFrame("�γ���ӳ���");
	f.setBounds(500, 100, 500, 500);//���ô���Ĵ�С
	f.setResizable(false);//���ô��岻���Ա��Ŵ������С
	Container c = f.getContentPane();
	c.setBackground(Color.PINK);//���ô��屳����ɫΪ��ɫ
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô������ر�ʱֹͣ����
	JButton b1 = new JButton("����");//���ð�ť
	JLabel l1 = new JLabel("�γ�����:"); //���ñ�ǩ
	JLabel l2 = new JLabel("�ον�ʦ:");//���ñ�ǩ
	JLabel l3 = new JLabel("�Ͽεص�");//���ñ�ǩ
	JLabel l4 = new JLabel("�Ͽ�ʱ��");//���ñ�ǩ
	JLabel l5 = new JLabel("��ʦ�Ա�");//���ñ�ǩ
	
	JComboBox<String> jb1 =new JComboBox<>();//���������б�
	JComboBox<String> jb2 =new JComboBox<>();//���������б�
	jb1.addItem("Jack");jb1.addItem("Collin");jb1.addItem("Boye");jb1.addItem("Aaron");jb1.addItem("Abbott");//�������б���������
	jb2.addItem("��201");jb2.addItem("��202");jb2.addItem("��203");jb2.addItem("��204");//�������б���������
	JTextField t3 = new JTextField(10);//�����ı���ĳ���
	JTextField t4 = new JTextField(10);//�����ı���ĳ���
	JTextField t5 = new JTextField(10);//�����ı���ĳ���
	f.setLayout(null);//���þ��Բ���
	JButton b2 =new JButton("����");
	b2.setBounds(180, 420, 150, 30);
	JTextField t2 =new JTextField(20);
	l1.setBounds(20, 00, 90,90);l1.setFont(new Font("����",Font.BOLD,15));//����ÿ������ľ���λ�ã����壬��С����ϸ���
	l2.setBounds(20, 50, 90,90);l2.setFont(new Font("����",Font.BOLD,15));
	l3.setBounds(20, 100, 90,90);l3.setFont(new Font("����",Font.BOLD,15));
	l4.setBounds(20, 150, 90,90);l4.setFont(new Font("����",Font.BOLD,15));
	l5.setBounds(20, 200, 90,90);l5.setFont(new Font("����",Font.BOLD,15));
	jb1.setBounds(100, 80, 150,30);jb1.setFont(new Font("����",Font.PLAIN,20));
	jb2.setBounds(100, 130,150,30);jb2.setFont(new Font("����",Font.BOLD,20));
	t3.setBounds(100, 30, 150,30);t3.setFont(new Font("����",Font.BOLD,20));
	t4.setBounds(100, 180, 150,30);t4.setFont(new Font("����",Font.BOLD,20));
	t5.setBounds(100, 230, 150,30);t5.setFont(new Font("����",Font.BOLD,20));
	b1.setBounds(180, 380, 150,30);b1.setFont(new Font("����",Font.BOLD,20));

	
	c.add(b1);c.add(l1);c.add(l2);c.add(l3);c.add(l4);c.add(l5);c.add(jb1);c.add(jb2);c.add(t3);c.add(t4);c.add(t5);//������
	f.setVisible(true);//���ô���ɼ�
	
	b1.setBackground(Color.WHITE);//���ð�ť�ı�����ɫ
	c.add(b2);b2.setBackground(Color.WHITE);b2.setFont(new Font("����",Font.BOLD,20));
	b1.addActionListener(new ActionListener() {//��ӵ����ťʱ�Ķ�������
	public void actionPerformed(ActionEvent e) {
		String str="��Ŀ��"+t3.getText()+"  ���ң�"+jb2.getSelectedItem()+"  �Ͽ�ʱ�䣺"+t4.getText()+"  �ڿν�ʦ��"+jb1.getSelectedItem()+"  ��ʦ�Ա�"+t5.getText()+"��";    

	writeFile(str);
	}
	});
	b2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	t3.setText("");
	t2.setText("");

}
});
}



	public static void writeFile(String s) {
        try {
            File writeName = new File("C:\\Users\\��ز�\\Desktop\\Java\\java ʵ���\\SJ.txt"); // ���·�������û����Ҫ����һ���µ�output.txt�ļ�
            writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {

            		out.write(s); // \r\n��Ϊ����

                out.flush(); // �ѻ���������ѹ���ļ�
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
