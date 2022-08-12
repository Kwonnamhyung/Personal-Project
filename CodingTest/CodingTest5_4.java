package CodingTest;

import java.util.Arrays;
import java.util.Collections;

public class CodingTest5_4 {

    public static void main(String[] args) {

        int[] branches = {6,7,10,16,12};
        System.out.println(solution(10,branches));
    }

    public static int solution(int N, int[] branches) {
        int answer = -1;
        int sum = 0;
        int height = 1;

        if(branches == null || branches.length == 0){
            return -1;
        }

        Arrays.sort(branches);

        while (true){
            for(int i = branches.length - 1; i >= 0; i--){
                sum = sum + (branches[i] / height);
                if(sum > N){
                    break;
                }
            }
            if(sum < N){
                if(height == 1){
                    return -1;
                }else {
                    return height - 1;
                }
            }
            sum = 0;
            height++;

        }
    }
}
