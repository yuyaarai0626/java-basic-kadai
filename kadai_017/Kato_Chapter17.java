package kadai_017;

abstract public class Kato_Chapter17 {
	public String familyName = "加藤"; //姓を表す
	public String givenName = ""; //名を表す
	public String address = "東京都中野区○×"; //住所を表す
	
	public void commonIntroduce() {
		System.out.println(familyName);
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		
	}
}
