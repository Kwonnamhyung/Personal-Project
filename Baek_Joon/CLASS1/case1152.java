package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;


        String[] answer = str.split(" ");

        for(int i = 0; i < answer.length; i++){
            if(answer[i].equals("")){
                continue;
            }
            count++;
        }

        System.out.println(count);
    }
}
