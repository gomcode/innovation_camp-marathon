package marathon;

public class m03 { 	// https://school.programmers.co.kr/learn/courses/30/lessons/12903
	
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s = "qwer";
		   
		   System.out.print(solution (s));
	}
	   
	   public static String solution(String s) {
		   String answer;
		   
		   answer = s.substring( (int) (s.length()-1)/2, (int) (s.length())/2 + 1);

	        return answer;
	   }
}