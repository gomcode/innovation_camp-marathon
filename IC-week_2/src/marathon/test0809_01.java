package marathon;

public class test0809_01 {

        public static int solution(int[] arr1, int[] arr2) {
            int answer = 0;

            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] >= 29) {
                    answer += 21-arr1[i];
                } else {
                    answer += arr2[i]-arr1[i];
                }
            }

            return answer;
        }

        public static void main(String[] args) {
//            int[] arr1 = {9, 9, 8, 8, 7, 8, 9};
//            int[] arr2 = {21, 25, 30, 29, 22, 23, 30};
            int[] arr1 = {9, 7, 8, 9, 7, 9, 8};
            int[] arr2 = {23, 22, 26, 26, 29, 27, 22};
            System.out.println(solution(arr1, arr2));
        }
    }
