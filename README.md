# Java-PC机模拟程序

## 阅读程序

## 实验目的
1.掌握类的设计。  
2.写出程序并初步学会调试。  
3.利用github平台写报告总计。
## 实验过程
创建四个类：CPU、HardDisk、PC、Test
CPU类getSpeed()返回speed的值，setSpeed(int m)方法将参数m的值赋给speed；  
CPU类getAvailability()返回availability的值，setAvailability(float n)方法将参数n的值赋给availability；  
HardDisk类则是getAmount()返回amount的值，setAmount(int m)方法将参数m的值赋给amount；  
另外在HardDisk中利用if与else对硬盘的种类进行了判断，以判断获取的硬盘种类是否为固态硬盘（SSD）或机械硬盘（HDD）  
PC类中定义方法，接收CPU和HardDisk的参数，并且调用set方法对cpu和harddisk赋值；  
PC类中用show的方法打印cpu与harddisk的信息；  
用main方法创建CPU、HardDisk和PC对象，并这是值；  
pc调用setCPU(CPU c)方法，调用时实参是cpu；pc调用setHardDisk(HardDisk h)方法，调用时实参是hd；pc调用show()方法

## 核心方法
1.CPU类的构造方法
public class CPU {  
           int speed;  
           int getSpeed(){  
                     return speed;}  
           public void setSpeed(int speed){  
            this.speed = speed;}  
 }  
 2.  HardDisk类的if else 判断  
 String setType(String b){  
 this.type = b;  
 String SSD = new String("SSD");  
 String HDD = new String("HDD");  
 if (type.equals(SSD))  
 {return type;}  
 else if(type.equals(HDD))  
 {return type;}  
 else{  
 type = "这不是一个正确的硬盘种类！";  
 return type;}
 }  
 3.PC类中this关键词的应用  
 CPU cpu;  
 HardDisk HD;  
 void setCPU(CPU cpu){  
 this.cpu = cpu;  
 }  
 void setHardDisk(HardDisk HD){  
 this.HD = HD;  
 }

## 实验结果
![image](https://github.com/zhangxinyu2019310185/Java-/blob/main/EXP1.png)

## 实验感想
通过此次java实验让我对java的学习有了初步的认识，虽然有着C语言和Python两种语言，但是还是明显感觉到了java与这两种语言的不同之处，需要有针对性的认真学习，另外通过此次实验，我发现我对代码的理解敏感度大大下降，足以说明编程语言是一门需要持续和坚持的学科，希望通过本学期的java学习，我能获得的不仅仅是新的知识，同时能养成时常练习代码的习惯。
