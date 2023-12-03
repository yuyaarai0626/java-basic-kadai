package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] primeJudge = new boolean[100];
			for(int suuji=0; suuji < primeJudge.length; suuji++) {
				primeJudge[suuji]=true;
			}
			for(int i = 2; i <= 100; i++) {
				for (int r = 2; r < i; r++ ) {
					if( i % r == 0) {
						primeJudge[i - 1] = false;
						break;
					}
				}
			}
			for( int j = 1; j < primeJudge.length;j++) {
				if( primeJudge[j] == true ) {
					System.out.println(j + 1);
				}
			}
	}	
}
