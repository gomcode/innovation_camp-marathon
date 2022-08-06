package marathon;

public class m04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(solution(3, 5));
		
	}

	public static long solution(int a, int b) {

	    long answer = 0;
	    long n = 0;
	    
	    n = a-b+1;
	    if (a < b) {
	        n = b-a+1;
	    }
	    
	    answer = (a+b)/2*n;
	    return answer;
	
	}
}
