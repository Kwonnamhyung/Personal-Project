package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_2438 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            for(int k = 0 ; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
