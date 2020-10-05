package test;

public class PC {
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
}
