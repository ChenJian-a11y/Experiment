package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//��¼������
public class Login extends JFrame implements ActionListener, Runnable {
private static final long serialVersionUID = 1L;
private String base = "abcdefghijklmnopqrstuvwxyz";
private StringBuffer sb;
protected JLabel lblPersonal, lblUserName, lblPassword,str;
protected JTextField txtUserName;
protected JPasswordField txtPassword;
protected JTextField txtPersonal;
protected JButton btnLogin, btnRegister;
protected static Thread thread = null;

public static void main(String[] args) {
Data.init();
Login frmLogin = new Login();
thread = new Thread(frmLogin);
thread.start();
}

public Login() {
super("ѧ��ѡ��ϵͳ");

initComponent();
}

//��ʼ���ؼ�
public void initComponent()
{
lblUserName = new JLabel("�û�����");
lblPassword = new JLabel("�� �룺");
// lblPersonal = new JLabel("��֤�룺");

txtUserName = new JTextField(10);
txtPassword = new JPasswordField(10);
txtPersonal = new JPasswordField(10);
txtPersonal.setBounds(209, 400, 200, 400);
btnLogin = new JButton("��¼");
btnRegister = new JButton("ע��");
txtPersonal.setText("");


btnLogin.addActionListener(this);
btnRegister.addActionListener(this);
txtPersonal.addActionListener(this);

this.setLayout(new GridLayout(4, 3));

this.add(lblUserName);
this.add(txtUserName);
this.add(lblPassword);
this.add(txtPassword);
// this.add(lblPersonal);
Random random = new Random();
sb = new StringBuffer();
for (int i = 0; i < 6; i++)
{
int number = random.nextInt(base.length());
sb.append(base.charAt(number));
}
str=new JLabel("��֤�룺"+sb.toString());
str.setSize(10,45);
add(str);
this.add(txtPersonal);
this.add(btnLogin);
this.add(btnRegister);

txtUserName.setFocusable(true);
setBounds(400,300,400,200);
this.setVisible(true);
}


@Override
public void actionPerformed(ActionEvent e) {
JButton btn = (JButton) e.getSource();

if(btn == btnLogin) {
if(txtUserName.getText().equals("") || txtUserName.getText().trim().equals("")) {
JOptionPane.showMessageDialog(this, "�û�������Ϊ�գ�", "��¼ʧ��", JOptionPane.ERROR_MESSAGE);
return;
}
if(txtPassword.getText().equals("")) {
JOptionPane.showMessageDialog(this, "��¼���벻��Ϊ�գ�", "��¼ʧ��", JOptionPane.ERROR_MESSAGE);
return;
}
String userName = null;
String password = null;

userName = txtUserName.getText().trim();
password = txtPassword.getText();
int i;

for(i=0; i < Data.customers.size(); i++) {
if(Data.customers.get(i).getUserName().equals(userName) && Data.customers.get(i).getPassword().equals(password)) {
break;
}
}

if(i < Data.customers.size()) {
JOptionPane.showMessageDialog(this, "��ӭ����" + userName, "��¼�ɹ�", JOptionPane.INFORMATION_MESSAGE);
this.dispose();
new JRadioButtonDemo();
button x = new button();
x.setVisible(true);
}
else {
JOptionPane.showMessageDialog(this, "��¼ʧ�ܣ������û����������Ƿ���ȷ......", "��¼ʧ��", JOptionPane.ERROR_MESSAGE);
}
}
else if(btn == btnRegister) {
this.dispose();
new Register();
}
}

@Override
public void run() {
// TODO Auto-generated method stub

}
}


//�û�ע�ᴰ����
class Register extends JFrame implements ActionListener {
private static final long serialVersionUID = 1L;
protected JLabel lblUserName, lblPassword, lblConfirmedPassword;
protected JTextField txtUserName;
protected JPasswordField txtPassword, txtConfirmedPassword;
protected JButton btnRegister, btnReset;

public Register() {
super("�û�ע��");

initComponent();
}

//��ʼ���ؼ�
public void initComponent() {
lblUserName = new JLabel("�� �� ����");
lblPassword = new JLabel("�� �룺");
lblConfirmedPassword = new JLabel("ȷ�����룺");

txtUserName = new JTextField(10);
txtPassword = new JPasswordField(10);
txtConfirmedPassword = new JPasswordField(10);

btnReset = new JButton("����");
btnRegister = new JButton("ע��");

btnReset.addActionListener(this);
btnRegister.addActionListener(this);

this.setLayout(new GridLayout(4, 2));
this.add(lblUserName);
this.add(txtUserName);
this.add(lblPassword);
this.add(txtPassword);
this.add(lblConfirmedPassword);
this.add(txtConfirmedPassword);
this.add(btnRegister);
this.add(btnReset);

txtUserName.setFocusable(true);

setBounds(500,400,700,500);
JFrame jFrame = new JFrame("��½����");
jFrame.setLocationRelativeTo(null);
this.setVisible(true);
this.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
JButton btn = (JButton) e.getSource();

if(btn == btnRegister) {
if(txtUserName.getText().equals("") || txtUserName.getText().trim().equals("")) {
JOptionPane.showMessageDialog(this, "�û�������Ϊ�գ�", "ע��ʧ��", JOptionPane.ERROR_MESSAGE);
return;
}
if(txtPassword.getText().equals("")) {
JOptionPane.showMessageDialog(this, "��¼���벻��Ϊ�գ�", "ע��ʧ��", JOptionPane.ERROR_MESSAGE);
return;
}
if(txtConfirmedPassword.getText().equals("")) {
JOptionPane.showMessageDialog(this, "ȷ֤���벻��Ϊ�գ�", "ע��ʧ��", JOptionPane.ERROR_MESSAGE);
return;
}
if(! txtConfirmedPassword.getText().equals(txtPassword.getText())) {
JOptionPane.showMessageDialog(this, "�����������һ�£�", "ע��ʧ��", JOptionPane.ERROR_MESSAGE);
return;
}

String userName = null;
String password = null;
int i;

userName = txtUserName.getText().trim();
password = txtPassword.getText();

for(i=0; i < Data.customers.size(); i++) {
if(Data.customers.get(i).getUserName().equals(userName)) {
break;
}
}

if(i < Data.customers.size()) {
JOptionPane.showMessageDialog(this, "���û����Ѿ���ע�ᣬ��ѡ�������û�����", "ע��ʧ��", JOptionPane.ERROR_MESSAGE);
}
else {
Data.customers.add(new Customer(userName, password));
JOptionPane.showMessageDialog(this, "��ϲ " + userName + " ע��ɹ������μ������û��������롣\n����\"ȷ��\"��ť��ʼ��¼", "ע��ɹ�", JOptionPane.INFORMATION_MESSAGE);

this.dispose();
new Login();
}
}
else if(btn == btnReset) {
txtUserName.setText("");
txtPassword.setText("");
txtConfirmedPassword.setText("");
txtUserName.setFocusable(true);
}
}
}

//�û���Ϣ��
class Customer {
protected String userName = null;
protected String password = null;

public Customer() {
}

public Customer(String userName, String password) {
this.userName = userName;
this.password = password;
}

public String getUserName() {
return this.userName;
}

public void setUserName(String userName) {
this.userName = userName;
}

public String getPassword() {
return this.password;
}

public void setPassword(String password) {
this.password = password;
}
}

//�����û���Ϣ�ļ�����
class Data {
public static List<Customer> customers = new ArrayList<Customer>();

public static void init() {
customers.add(new Customer("fxk", "123456"));
}
}