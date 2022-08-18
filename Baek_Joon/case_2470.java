package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class case_2470 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        for(int i = 0; i < num; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        int first = 0;
        int last = numbers.length - 1;
        int min = Integer.MAX_VALUE;
        int result1 = 0;
        int result2 = 0;

        while (first < last){

            int sum = numbers[first] + numbers[last];


            if(Math.abs(sum) < min){
                min = Math.abs(sum);
                result1 = numbers[first];
                result2 = numbers[last];
                if(min == 0){
                    break;
                }
            }

            if(sum < 0){
                first ++;
            } else if (sum > 0) {
                last--;
            }
        }

        System.out.println(result1 + " " + result2);
    }
}
