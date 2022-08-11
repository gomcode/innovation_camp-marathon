package marathon;

public class m08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1, 2, 3, 4};
		System.out.print(solution(arr));
	}

	public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
        	sum += arr[i];
        }
        answer = (double) sum/arr.length;
        return answer;
    }
}
