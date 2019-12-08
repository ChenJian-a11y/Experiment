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

## 三、操作过程：
### （1）运行程序后会出现一个登录界面，然后我们要先注册账号。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/1.PNG)
### （2）注册的时候我们会有密码和确认密码两次输入密码的步骤，来确保注册账号密码的时候没有错误。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/2.PNG)
### （3）注册成功后会弹出注册成功的窗口，会提醒您注册成功。
![images](https://github.com/COLLIN-BAI/Experiment/blob/master/images/3.PNG)
### （4）点击确认后会在册弹出登陆界面，然后输入注册的账号密码和验证码。
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

## 四、核心代码：
### 1.统计古诗中某个字或词出现的次数方法：
```
//使用String类的contain()方法，判断整串中是否包含子串     srcStr父字符串  findStr子字符串
	public static int count(String srcStr, String findStr) {
		int count = 0;
		int index = 0;
    //indexOf()的用法：返回字符中indexOf（String）中子串String在父串中首次出现的位置，从0开始！没有返回-1
		while ((index = srcStr.indexOf(findStr, index)) != -1) {
			index = index + findStr.length();
      //count数值加1
			count++; // +1   
		}
    //返回值count
		return count;  
	}
```
### 2.给无标点符号的《长恨歌》加标点方法：
```
public static void printsplit(String strsplit) {
	for (int i = 0; i<strsplit.length(); i = i+7) {//判断长度是否大于i
		if( i%2 == 0 ){//如果i除以2的余数不为零，为奇数个字。
			String split = strsplit.substring(i, i+7);//截取字符串从i到i+7。
			System.out.print(split+ "，");			//输出加逗号。
		} 
		if( i%2 == 1 ){//如果i除以2的余数为零，为偶数个字。
			String split = strsplit.substring(i, i+7);//截取字符串从i到i+7
			System.out.print(split+ "。" + "\n");		//输出加句号。	
		} 
	}	
}
```
### 3.异常处理方法：
```
           try {
               System.out.println("输入参数，统计古诗中某个字或词出现的次数：" );
               strs = br.readLine();
           }catch(IOException e){
               e.printStackTrace();
           }
           break;
```
## 五、实验感想：
### 本次实验掌握了字符串String及其方法的使用，掌握了异常处理结构，掌握了Eclipse 运行配置(Run Configuration)里的Argument里面添加到main方法中的添加参数的方法
