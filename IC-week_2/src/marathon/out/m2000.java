package marathon;

public class m20 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i = 0; i<participant.length; i++) {
            for(int j = 0; i<completion.length; j++) {
                if(participant[i].equals(completion[j])) {
                    participant[i] = "";
                    completion[i] = "";
                    break;
                }
                if(!participant[i].equals("")) {
                    answer = partipant[i];
                }
            }
        }



        return answer;
    }

}