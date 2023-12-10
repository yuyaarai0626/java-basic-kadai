package kadai_014;

public class Car_Chapter14 {
	// フィールド
	private int gear = 0;
	private int speed = 0;

	// コントラクタ
	public Car_Chapter14(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	// メソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.speed = this.speed * afterGear;
	}
	public void run() {
		if(this.speed > 50) {
			System.out.println("速度は時速10kmです");
		}
		else if(this.speed <= 50) {
			System.out.println("速度は時速" + this.speed + "kmです");
		}
	
	}	
}