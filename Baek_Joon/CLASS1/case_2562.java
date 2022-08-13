package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx + 1);
    }
}
