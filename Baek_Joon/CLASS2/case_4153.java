package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int[] numbers = new int[3];

            for(int i = 0; i < numbers.length; i++ ){
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            if(numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0) {
                break;
            }

            int numA = numbers[0] * numbers[0];
            int numB = numbers[1] * numbers[1];
            int numC = numbers[2] * numbers[2];

            if(numA+numB == numC){
                System.out.println("right");
            }else if(numA + numC == numB){
                System.out.println("right");
            }else if (numB + numC == numA){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}
