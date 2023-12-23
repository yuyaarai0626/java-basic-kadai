package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void seachWord(String[] words) {
		HashMap<String,String> fluitsDic = new HashMap<>();
	
		fluitsDic.put("apple","りんご");
		fluitsDic.put("peach","桃");
		fluitsDic.put("banana","バナナ");
		fluitsDic.put("lemon","レモン");
		fluitsDic.put("pear","梨");
		fluitsDic.put("kiwi","キウィ");
		fluitsDic.put("strawberry","いちご");
		fluitsDic.put("grape","ぶどう");
		fluitsDic.put("muscat","マスカット");
		fluitsDic.put("cherry","さくらんぼ");
		
		for(int i=0; i < words.length;i++) {
			if(fluitsDic.containsKey(words[i])) {
				System.out.println(words[i] + "の意味は" + fluitsDic.get(words[i]));
			}
			else{
				System.out.println(words[i] + "は辞書に存在しません");
			}
		}
	}
}
