package CodingTest;

public class CodingTest6_5 {

    public static void main(String[] args) {

        int[] scores = {5, 2, 5, 3, 4, 1, 6, 5, 2, 5, 2, 3};
        System.out.println(solution(scores));

    }

    public static int[] solution(int[] scores) {
        int[] answer = new int[scores.length];

        if(scores[0] > scores[1]){
            answer[0] = 2;
        }else {
            answer[0] = 1;
        }
        int count = 1;
        int lefrMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        for(int i = 1; i < scores.length - 1; i++){

            if(scores[i - 1] < scores[i]){
                count++;
            }

            if(scores[i] > scores[i + 1]){
                count++;
            }

            answer[i] = count;
            count = 1;
        }

        if(scores[scores.length - 1] > scores[scores.length - 2]){
            answer[scores.length - 1] = 2;
        }else {
            answer[scores.length - 1] = 1;
        }

        for(int i : answer){
            System.out.print( i + " ");
        }
        return answer;
    }
}
