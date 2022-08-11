package marathon;
public class m16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution("Pyy"));

	}

	public static boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
        	String scopy = s.substring(i,i+1);
        	if (scopy.equals("p") || scopy.equals("P")) {
        		pCount ++;
        	} else if (scopy.equals("y") || scopy.equals("Y")) {
        		yCount ++;
        	}
        }
        if (pCount == yCount) {
        	answer = true;
        }

        return answer;
    }
}
