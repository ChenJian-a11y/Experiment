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
	JFrame f = new JFrame("课程添加程序");
	f.setBounds(500, 100, 500, 500);//设置窗体的大小
	f.setResizable(false);//设置窗体不可以被放大或者缩小
	Container c = f.getContentPane();
	c.setBackground(Color.PINK);//设置窗体背景颜色为白色
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体点击关闭时停止运行
	JButton b1 = new JButton("保存");//设置按钮
	JLabel l1 = new JLabel("课程名称:"); //设置标签
	JLabel l2 = new JLabel("任课教师:");//设置标签
	JLabel l3 = new JLabel("上课地点");//设置标签
	JLabel l4 = new JLabel("上课时间");//设置标签
	JLabel l5 = new JLabel("老师性别：");//设置标签
	
	JComboBox<String> jb1 =new JComboBox<>();//设置下拉列表
	JComboBox<String> jb2 =new JComboBox<>();//设置下拉列表
	jb1.addItem("Jack");jb1.addItem("Collin");jb1.addItem("Boye");jb1.addItem("Aaron");jb1.addItem("Abbott");//向下拉列表中添加组件
	jb2.addItem("教201");jb2.addItem("教202");jb2.addItem("教203");jb2.addItem("教204");//向下拉列表中添加组件
	JTextField t3 = new JTextField(10);//设置文本域的长度
	JTextField t4 = new JTextField(10);//设置文本域的长度
	JTextField t5 = new JTextField(10);//设置文本域的长度
	f.setLayout(null);//设置绝对布局
	JButton b2 =new JButton("重置");
	b2.setBounds(180, 420, 150, 30);
	JTextField t2 =new JTextField(20);
	l1.setBounds(20, 00, 90,90);l1.setFont(new Font("楷体",Font.BOLD,15));//设置每个零件的具体位置，字体，大小，粗细情况
	l2.setBounds(20, 50, 90,90);l2.setFont(new Font("楷体",Font.BOLD,15));
	l3.setBounds(20, 100, 90,90);l3.setFont(new Font("楷体",Font.BOLD,15));
	l4.setBounds(20, 150, 90,90);l4.setFont(new Font("楷体",Font.BOLD,15));
	l5.setBounds(20, 200, 90,90);l5.setFont(new Font("楷体",Font.BOLD,15));
	jb1.setBounds(100, 80, 150,30);jb1.setFont(new Font("楷体",Font.PLAIN,20));
	jb2.setBounds(100, 130,150,30);jb2.setFont(new Font("楷体",Font.BOLD,20));
	t3.setBounds(100, 30, 150,30);t3.setFont(new Font("楷体",Font.BOLD,20));
	t4.setBounds(100, 180, 150,30);t4.setFont(new Font("楷体",Font.BOLD,20));
	t5.setBounds(100, 230, 150,30);t5.setFont(new Font("楷体",Font.BOLD,20));
	b1.setBounds(180, 380, 150,30);b1.setFont(new Font("楷体",Font.BOLD,20));

	
	c.add(b1);c.add(l1);c.add(l2);c.add(l3);c.add(l4);c.add(l5);c.add(jb1);c.add(jb2);c.add(t3);c.add(t4);c.add(t5);//添加组件
	f.setVisible(true);//设置窗体可见
	
	b1.setBackground(Color.WHITE);//设置按钮的背景颜色
	c.add(b2);b2.setBackground(Color.WHITE);b2.setFont(new Font("楷体",Font.BOLD,20));
	b1.addActionListener(new ActionListener() {//添加点击按钮时的动作监听
	public void actionPerformed(ActionEvent e) {
		String str="科目："+t3.getText()+"  教室："+jb2.getSelectedItem()+"  上课时间："+t4.getText()+"  授课教师："+jb1.getSelectedItem()+"  老师性别："+t5.getText()+"。";    

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
            File writeName = new File("C:\\Users\\李柏灿\\Desktop\\Java\\java 实验二\\SJ.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {

            		out.write(s); // \r\n即为换行

                out.flush(); // 把缓存区内容压入文件
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
