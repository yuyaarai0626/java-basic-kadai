package kadai_014;

public class Car_Chapter14 {
    
    private int gear;    // ギア数(1-5速)
    private int speed; // ギアチェンジ後の速度
    
    public Car_Chapter14(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    
    public void gearChange(int afterGear) {
        System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

        if (afterGear == 2) {
            this.speed = 20;
        } else if (afterGear == 3) {
            this.speed = 30;
        } else if (afterGear == 4) {
            this.speed = 40;
        } else if (afterGear == 5) {
            this.speed = 50;
        } else {
            this.speed = 10;
        }
    }
    
    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}
