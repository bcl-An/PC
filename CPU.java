package test;

public class CPU {
    private String pinpai;
    public int speed;
    CPU(String pinpai){
        this.pinpai = pinpai;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
