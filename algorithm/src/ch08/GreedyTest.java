package ch08;

// 여러 종류의 동전으로 가격 지불하는 문제
public class GreedyTest {

	public static void main(String[] args) {

		int[] coins = {500, 100, 50, 10};   // 
		int price = 8370;
		int count;
		
		for (int i = 0; i< coins.length; i++) {
			count = 0;
			count += price / coins[i];
			price = price % coins[i]; 
			
			System.out.println( coins[i] + "짜리 동전 " + count + "개가 필요합니다.");
		}
		
	}

}
