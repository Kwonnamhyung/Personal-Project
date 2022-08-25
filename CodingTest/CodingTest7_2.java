package CodingTest;

import java.util.Arrays;

public class CodingTest7_2 {

    public static void main(String[] args) {
        int[] votes = {1, 4, 2, 2, 2, 3, 2, 2, 1};
        System.out.println(solution(votes));

    }

    public static int solution(int[] votes) {

        if (votes.length <= 2) {
            return votes[0];
        }
        int answer = 0;

        float average = votes.length / 2;
        int count = 0;

        for (int i = 0; i < votes.length; i++) {

            int temp = votes[i];
            for (int k = 0; k < votes.length; k++) {

                if (temp == votes[k]) {
                    count++;
                }
            }

            if (count > average) {
                return temp;
            } else {
                count = 0;
            }
        }
        return -1;
    }


}
