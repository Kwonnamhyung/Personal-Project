package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArrays = br.readLine().toCharArray();
        int index = 0;

        for(char i = (char)'a'; i <= (char)'z'; i++){
            for(int k = 0 ; k < cArrays.length; k++){
                if(i == cArrays[k]){
                    index = k;
                    break;
                }else {
                    index = -1;
                }
            }
            System.out.print(index + " ");
        }
    }
}
