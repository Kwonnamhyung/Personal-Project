package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i <= number; i++) {
            int sum = 0;
            int num = i;

            while (num != 0) {
                sum = sum + (num % 10) ;
                num = num / 10;
            }

            if( sum + i == number) {
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}
