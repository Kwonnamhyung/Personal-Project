package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < total_num; i++){
            String temp =  br.readLine();
            StringTokenizer st = new StringTokenizer(temp);
            String answer = "";
            int num = Integer.parseInt(st.nextToken());
            String string = st.nextToken();
            char[] chars = string.toCharArray();

            for(char c : chars){
                for(int k = 0; k < num; k++){
                    answer = answer + c;
                }
            }

            System.out.println(answer);
        }


    }
}
