package marathon;

public class m12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.print(solution(3, 20, 4));
	}

	public static long solution(int price, int money, int count) {
        long answer;
        int n = count;
        int a1 = price, d = price;
        int an = a1 + (n-1)*d;
        
        
        long sum = ((long) (a1 + an) *n ) / 2; // 총 사용금액 sum은 첫 항 a1과 공차 d가 price이고, 항이 count개인 등차수열의 합
        answer = -(money - sum); // '모자라는 돈'은 양수
        
        if ( answer < 0) { //
        	answer = 0;
        }
        return answer;
	}
}