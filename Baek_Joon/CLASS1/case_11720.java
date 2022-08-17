package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];
        char[] cArrays = br.readLine().toCharArray();
        int sum = 0;

        for(int i = 0; i < cArrays.length; i++){
            numbers[i] = Integer.parseInt(String.valueOf(cArrays[i]));
        }

        for(int i : numbers){
            sum += i;
        }

        System.out.println(sum);
    }
}
