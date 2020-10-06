# PC

# 计191 陈伟然 2019310172

# 实验二

# 实验内容：

1、基本要求：完成教材p110 第四题关于PC、内存等模拟的程序。<br>
2、附加要求：<br>
   类中定义不少于两个构造方法；<br>
   每个类定义不少于2个属性，且属性的类型应该多样化；<br>
   根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；<br>
   尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。<br>  
3、实验报告提交<br>
   实验报告应该包“实验内容”、“实验方法”或、“实验设计”、“核心方法/伪代码”、“实验结果”、“实验感想”等步骤；<br>
   除了“实验结果”外，其他小节杜绝截屏给出图；<br>
4、本次实验通过github平台提交，包括：<br>
   程序的代码及相关资源文件；<br>
   Readme.md文件写作（即实验报告部分）。<br>
   每名同学通过云班课的作业提交github实验的URL链接。<br>

# 实验设计：

## CPU类<br>
>要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed; HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount; PC类要求setCPU(CPU c)将参数c的值赋值给cpu,要求setHardDisk (HardDisk h)方法将参数h的值赋值给hd,要求show()方法能显示cpu的速度和硬盘的容量。<br>
## 主类Test<br>
>(1) main方法中创建一个CPU对象cpu,cpu将自己的speed设置为2200.<br>
>(2) main 方法中创建一个HardDisk对象hd, hd 将自己的amount设置为200.<br>
>(3) main方法中创建一个PC对象pc。<br>
>(4) pc调用setCPU(CPU c)方法，调用时实参是cpu.<br>
>(5) pc调用setHardDisk(HardDisk h)方法，调用时实参是hd.<br>
>(6) pc调用show()方法。<br>
## 其它<br>
>>添加部分属性，并进行合理`逻辑判断`，同时体验改变`修饰符`体验其作用。

# 核心代码：<br>
    定义两属性，并初始化，过程中应用逻辑判断。<br>
    ```JAVA
    private String pinpai;
    private int time;
    PC(String pinpai, int time){
        this.pinpai = pinpai;
        if (time>2020){
            this.time=2020;
        }else {
            this.time = time;
        }
    }
    ```
    ```JAVA
   CPU cpu;
    HardDisk hd;
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public void setHardDisk(HardDisk hd) {
        this.hd = hd;
    }
    public void show(){
        System.out.println("brand:"+pinpai+" time:"+time);
        System.out.println("CPU speed:"+cpu.getSpeed());
        System.out.println("HardDisk amount:"+hd.getAmount());
    }
    ```
# 实验结果：

![](http://www.baidu.com/img/bdlogo.gif"运行结果") 

brand:abc time:2020

CPU speed:2200

HardDisk amount:200
   
# 实验感想：

   通过本次实验，我初步掌握了JAVA程序的编写步骤，并且掌握了构造方法的书写，同时学会运用合理的逻辑判断。     通过扩展，我初步了解了修饰符的运用，并将其应用到了程序中。
