package marathon;
import java.util.Scanner;

class m02 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12937

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(solution(num));
		
    }

	public static String solution(int num) {
        String answer;
        
        if (num%2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
	}
}
