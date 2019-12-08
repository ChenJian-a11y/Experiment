# 计182 2018310777 李柏灿
## 一、实验目的:
#### 1、分析学生选课系统
#### 2、使用GUI窗体及其组件设计窗体界面
#### 3、完成学生选课过程业务逻辑编程
#### 4、基于文件保存并读取数据
#### 5、处理异常

## 二、实验要求：
### 一、系统角色分析及类设计
#### 例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程， 定义每种角色人员的属性，及其操作方法。
#### 属性示例：	
#### 1、人员（编号、姓名、性别……）
#### 2、教师（编号、姓名、性别、所授课程、……）
#### 3、学生（编号、姓名、性别、所选课程、……）
#### 4、课程（编号、课程名称、上课地点、时间、授课教师、……）
#### 以上属性仅为示例，同学们可以自行扩展。

### 二、要求:
#### 1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
#### 2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
#### 3、针对操作过程中可能会出现的各种异常，做异常处理
#### 4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
#### 5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
## 三、程序框图：
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/18.PNG)
## 四、操作过程：
### （1）运行程序后会出现一个登录界面，然后我们要先注册账号。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/1.PNG)
### （2）注册的时候我们会有密码和确认密码两次输入密码的步骤，来确保注册账号密码的时候没有错误。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/2.PNG)
### （3）注册成功后会弹出注册成功的窗口，会提醒您注册成功。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/3.PNG)
### （4）点击确定后会在册弹出登陆界面，然后输入注册的账号密码和验证码。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/4.PNG)
### （5）点击登陆后会弹出提示框，提示您已经注册成功。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/5.PNG)
### （6）点击确认后会出现一个功能按钮框，可以选择要操作的功能。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/6.PNG)
### （7）如果点击Choosecourse，会弹出选课的界面。我们点击按钮就可以进行选课，选课信息也会显示在选课窗口上供我们参考。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/7.PNG)
### （8）如果选完课程会提示您选课成功。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/8.PNG)
### （9）点击确认后，会把选课信息写入txt文档中保存。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/16.PNG)
### （10）关掉选课界面，我们点击Quitcourse，会弹出退课的界面，从txt文档里面读取选课信息然后显示出来，我们选择要退的课程（按住CTRL键点击要退的课程可一次选择多个课程）。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/9.PNG)
### （11）选择完毕后点击退课按钮，会弹出退课成功的对话框。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/10.PNG)
### （12）退课完的信息同样会写入txt文档。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/15.PNG)
### （13）关掉关掉退课界面，我们点击printcoourse，会弹出打印课程界面，从txt文档里面读取选课信息然后打印显示出来。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/11.PNG)
### （14）关掉打印界面，我们点击AddCourse，会弹出选课的界面，我们可以填写要选课的信息。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/12.PNG)
### （15）点击保存后，选课信息会写入txt文档。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/17.PNG)
### （16）然后关掉添加课程界面，点击printcourse，会弹出打印课程界面，从txt文档里面读取选课信息然后打印显示出来。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/13.PNG)
## 五、核心代码：
### 1、Frame方法设置标题名称Choice Course，JRadioButtonDemo方法创建单选按钮。
```
JFrame frame = new JFrame("Choice Course");//用JFrame方法设置标题名称Choice Course
JRadioButton rb1 = new JRadioButton("JRadioButton 1");//用JRadioButtonDemo方法创建6个单选按钮。
```
### 2、定义空数组，接收选择课程信息
```
Array strarray=new Array();//定义空数组，接收选择课程信息
String[] array0=strarray.getArray();
String[] array1=new String[6];
```
### 3、创建JPanel对象赋值给p1引用。
```
JPanel p1 = new JPanel();//创建JPanel对象赋值给p1引用。
```
### 4、用btn1.addActionListener(new ActionListener(){}）方法来告诉btn1有一个方法可以引用：actionPerformed对象存到了btn1的list集合中，当我按下这个button的时候，他会循环这个list看里面有东西没，有东西的话就拿出来，然后转化成ActionListener 类型的对象.（监听器）
```
ActionListener a1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton rb = (JRadioButton) e.getSource();
				if(rb == rb1) {
					ta.append("\n  1   科目:数学      教室 :教201      时间:9：40   老师:    赵老师      性别: 男     "+rb1.isSelected());
				    array1[0]=array0[0];//把课程信息写入数组
				}
				......
```
### 5、把选课信息写入数组：
```
writeFile(array1);//把选课信息写入数组
```
### 6、选课信息写入txt文件，包含异常处理：
```
public static void writeFile(String[] s) {
        try {
            File writeName = new File("C:\\Users\\李柏灿\\Desktop\\Java\\java实验二\\SJ.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);//异常处理
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
            	for(int i=0;i<s.length;i++) {
            		if(s[i]!=null) {
            		out.write(s[i]); // \r\n即为换行
            	}
                out.flush(); // 把缓存区内容压入文件
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
```
### 7、读取txt文件信息，包含异常处理：
```
public static String readFile() {
			String str="";
	        String pathname = "C:\\Users\\李柏灿\\Desktop\\Java\\java 实验二\\SJ.txt"; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
	        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
	        //不关闭文件会导致资源的泄露，读写文件都同理
	        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
	        try (FileReader reader = new FileReader(pathname);
	             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
	        ) {
	            String line;
	            //网友推荐更加简洁的写法
	            while ((line = br.readLine()) != null) {
	                // 一次读入一行数据
	            	str=str+line;
	            }
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	    }
	}
```
### 8、读取“。”删除数组，并判断是否退课：
```
public void actionPerformed(ActionEvent arg0) {
				String[] str1 = readFile().split("。");//读取“。”
				if(List.isSelectionEmpty()) {//判断是否退课
					JOptionPane.showMessageDialog(null, "您没有退课");
					return;
				}
				for(int i=0;i<str1.length;i++) {//判断字符长度
					if(List.isSelectedIndex(i)) {
						str1[i] = null;
					}
					else {
						str1[i] = str1[i]+"。";
					}
				}
```
### 8、点击按钮能实现窗口的弹出：
```
JRadioButtonDemo a = new JRadioButtonDemo();
a.setVisible(true);
```
### 9、窗口关闭：
```
this.dispose();
```
## 六、实验感想：
    本次实验分析了学生选课系统，使用了GUI窗体及其组件设计窗体界面，完成了学生选课过程业务逻辑编程，学会了基于文件保存并读取数据和处理异常。本次实验的总体难度较大，题目理解起来就比上几次实验难度大很多，写出这次实验查阅了很多书籍上面和网络上面的资料，用了很长时间来调试代码，通过实验让我明白，光有理论是不行的，还要结合实践才能让自己学以致用，能发现很多错误，及时纠正。
