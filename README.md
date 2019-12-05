# 计182 2018310777 李柏灿
## 一、实验目的:
  ### 掌握字符串String及其方法的使用
  ### 掌握异常处理结构

## 二、实验要求：
### 内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
### (1).每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
### (2).允许提供输入参数，统计古诗中某个字或词出现的次数
### (3).考虑操作中可能出现的异常，在程序中设计异常处理程序
### 输入：
#### 汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>
### 输出：
#### 汉皇重色思倾国，御宇多年求不得。
#### 杨家有女初长成，养在深闺人未识。
#### 天生丽质难自弃，一朝选在君王侧。
#### 回眸一笑百媚生，六宫粉黛无颜色。
#### 春寒赐浴华清池，温泉水滑洗凝脂。
#### 侍儿扶起娇无力，始是新承恩泽时。
#### 云鬓花颜金步摇，芙蓉帐暖度春宵。
#### 春宵苦短日高起，从此君王不早朝。
#### …………
#### 注意： 输入的内容，利用main方法中的args数组传递

## 三、操作过程：
### （1）首先在Eclipse 运行配置(Run Configuration)里的Argument里面添加main方法中的参数，我们实验要求是添加《长恨歌》不加标符号，添加截图如图。
![images](https://github.com/COLLIN-BAI/poem/blob/master/images/4.PNG)
### （2）运行程序后会先显示出加完标点符号的《长恨歌》（每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”），运行截图如图所示。
![images](https://github.com/COLLIN-BAI/poem/blob/master/images/1.PNG)
### （3）显示出加标点符号的《长恨歌》后，会显示”输入参数，统计古诗中某个字或词出现的次数：”，运行截图如图所示。
![images](https://github.com/COLLIN-BAI/poem/blob/master/images/2.PNG)
### （4）输入参数，会统计古诗中某个字或词出现的次数，操作演示如图所示。
![images](https://github.com/COLLIN-BAI/poem/blob/master/images/3.PNG)

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
