package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        int[] answer = new int[10];
        int sum = 1;

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for(int i : numbers){
            sum = sum * i;
        }

        char[] chars = String.valueOf(sum).toCharArray();

        for(int i = 0; i < chars.length; i++){

            switch (chars[i]) {
                case '0' :
                    answer[0] += 1;
                    break;
                case '1' :
                    answer[1] += 1;
                    break;
                case '2' :
                    answer[2] += 1;
                    break;
                case '3' :
                    answer[3] += 1;
                    break;
                case '4' :
                    answer[4] += 1;
                    break;
                case '5' :
                    answer[5] += 1;
                    break;
                case '6' :
                    answer[6] += 1;
                    break;
                case '7' :
                    answer[7] += 1;
                    break;
                case '8' :
                    answer[8] += 1;
                    break;
                case '9' :
                    answer[9] += 1;
                    break;
            }


        }
        for(int i : answer){
            System.out.println(i);
        }
    }
}
