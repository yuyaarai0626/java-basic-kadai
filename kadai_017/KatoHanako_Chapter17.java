package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17{
	String HanakoIntroduce = "";
	public void setGivenName(String name) {
		givenName = name;
	}
	public void eachIntroduce(){
		HanakoIntroduce = "趣味は読書です";
	}
	public void execIntroduce() {
		System.out.println("名前は"+ familyName + givenName + "です");
		System.out.println("住所は"+ address + "です");
		eachIntroduce();
		System.out.println(HanakoIntroduce);
	}
}
