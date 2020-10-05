# PC
实验二

实验内容：

1、基本要求：完成教材p110 第四题关于PC、内存等模拟的程序。
2、附加要求：
   类中定义不少于两个构造方法；
   每个类定义不少于2个属性，且属性的类型应该多样化；
   根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
   尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
3、实验报告提交
   实验报告应该包“实验内容”、“实验方法”或、“实验设计”、“核心方法/伪代码”、“实验结果”、“实验感想”等步骤；
   除了“实验结果”外，其他小节杜绝截屏给出图；
4、本次实验通过github平台提交，包括：
   程序的代码及相关资源文件；
   Readme.md文件写作（即实验报告部分）。
   每名同学通过云班课的作业提交github实验的URL链接。

实验设计：

核心代码：

    private String pinpai;
    private int time;
    PC(String abc, int time){
        this.pinpai = pinpai;
        this.time = time;
    }
    CPU cpu;
    HardDisk hd;
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public void setHardDisk(HardDisk hd) {
        this.hd = hd;
    }
    public void show(){
        System.out.println("CPU speed"+cpu.getSpeed());
        System.out.println("HardDisk amount"+hd.getAmount());
    }
    
实验结果：

   CPU speed2200
   HardDisk amount200
   
实验感想：

   通过本次实验，我初步掌握了JAVA程序的编写步骤，并且掌握了构造方法的书写。
