package kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		KatoTaro_Chapter17 Taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 Hanako = new KatoHanako_Chapter17();
		
		Taro.setGivenName("太郎");
		Taro.execIntroduce();
		System.out.println("");

		Ichiro.setGivenName("一郎");
		Ichiro.execIntroduce();
		System.out.println("");
		
		Hanako.setGivenName("花子");
		Hanako.execIntroduce();
		System.out.println("");
	}
}
