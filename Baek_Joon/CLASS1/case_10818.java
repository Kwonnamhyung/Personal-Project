package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_10818 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for(int number : numbers){
            if(min > number){
                min = number;
            }

            if(max < number){
                max = number;
            }
        }

        System.out.printf("%d %d",min,max);
    }
}
