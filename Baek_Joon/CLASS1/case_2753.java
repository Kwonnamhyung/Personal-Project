package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_2753 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if((num % 4 == 0 && num % 100 != 0) || num % 400 == 0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
