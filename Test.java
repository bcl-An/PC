package test;

public class Test {
    public static void main (String[] args){
        PC pc =new PC("abc",2020);
        CPU cpu = new CPU("abc");
        HardDisk hd = new HardDisk("abc");
        cpu.setSpeed(2200);
        hd.setAmount(200);
        pc.setCpu(cpu);
        pc.setHardDisk(hd);
        pc.show();
    }
}
