package CodingTest;

import java.util.Arrays;
import java.util.HashMap;

public class CodingTest6_2 {

    public static void main(String[] args) {

        int[] amout = {7, 10, 4, 5};
        int[] value = {5, 4, 3, 1};
        int[] stomach = {4, 6, 2, 8};
        System.out.println(solution(amout,value,stomach));
    }

    public static int solution(int[] amount, int[] value, int[] stomach) {
        int answer = 0;
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        int sum = 0;
        int maxCount = 0;

        for(int i : stomach){
            sum += i;
        }

        for(int i = 0; i < value.length; i++){
            if(value[i] > maxValue){
                maxValue = value[i];
                maxIndex = i;
            }
        }

        maxCount = (amount[maxIndex] / stomach.length) * stomach.length;
        answer += maxValue * maxCount;
        sum = sum - maxCount;

        for(int i = 0; i < amount.length; i++){
            int count = 0;
            if(i == maxIndex){
                continue;
            }
            for(int k = 1; k <= amount[i]; k++){
                count++;
                if(count == sum){
                    break;
                }
            }


        }





        return answer;
    }
}
