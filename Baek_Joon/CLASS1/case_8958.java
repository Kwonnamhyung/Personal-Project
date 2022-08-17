package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i  = 0; i < num; i++){
            char[] cArrays = br.readLine().toCharArray();
            int count = 0;
            int sum = 0;
            for(char c : cArrays){
                if(c == 'O'){
                    count += 1;
                    sum += count;
                } else if (c == 'X') {
                    count = 0;
                    sum += count;
                }
            }
            System.out.println(sum);
        }
    }
}
