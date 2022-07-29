package CodingTest;

import java.util.Arrays;

public class CodingTest3_2 {

    public static void main(String[] args) {
        int[] numbers = {1,4,2};
        solution(numbers,12);
    }
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        int count = 0;
        int idx = numbers.length - 1;

        Arrays.sort(numbers);

        while (target != 0){

                if(target >= numbers[idx]){
                    if(target % numbers[idx] == 0){
                        target = target / numbers[idx];
                        count++;
                    }else {
                        target = target - numbers[idx];
                        count++;
                    }
                } else {
                    idx--;
                    continue;
                }


        }
        System.out.println(count);
        return answer;
    }
}

