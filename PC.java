package test;

public class PC {
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
}
