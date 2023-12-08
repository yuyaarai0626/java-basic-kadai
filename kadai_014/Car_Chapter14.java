package kadai_014;

public class Car_Chapter14 {
    
    private int cargear = 1;    // ギア数(1-5速)
    private int carspeed = 10; // ギアチェンジ後の速度
    private int previousGear;
    
    public Car_Chapter14(int gear, int speed) {
        this.cargear = gear;
        this.carspeed = carspeed;
    }
    
    public int getGear() {
        return this.cargear;
    }

    public int getcarspeed() {
        return this.carspeed;
    }
    
    public void gearChange(int afterGear) {
        System.out.println("ギア" + this.cargear + "から" + afterGear + "に切り替えました");

        if (afterGear == 2) {
            this.carspeed = 20;
        } else if (afterGear == 3) {
            this.carspeed = 30;
        } else if (afterGear == 4) {
            this.carspeed = 40;
        } else if (afterGear == 5) {
            this.carspeed = 50;
        } else {
            this.carspeed = 10;
        }
    }
    
    public void run() {
        System.out.println("速度は時速" + this.carspeed + "kmです");
    }
}
