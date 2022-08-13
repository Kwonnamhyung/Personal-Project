package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int i : num){
            sum = sum + (i * i);
        }

        System.out.println(sum % 10);


    }
}
