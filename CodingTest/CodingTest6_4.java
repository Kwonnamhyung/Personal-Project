package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTest6_4 {

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 4, 2, 3};
        int k = 3;
        System.out.println(solution(arr,k));
    }

    public static int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        int first = 0;
        int last = first + k - 1;

        while (last < arr.length){

            int[] temp = Arrays.copyOfRange(arr,first,last + 1);
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < temp.length; i++){
                if(max < temp[i]){
                    max = temp[i];
                }
            }

            list.add(max);
            first++;
            last++;
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
