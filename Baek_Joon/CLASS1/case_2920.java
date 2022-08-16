package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_2920 {

    public static void main(String[] args) throws IOException {
        int[] number = {1,2,3,4,5,6,7,8};
        int[] musicalScales = new int[8];
        boolean isSame = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        StringTokenizer st = new StringTokenizer(string);

        for(int i = 0; i < 8; i++){
            musicalScales[i] = Integer.parseInt(st.nextToken());
        }


        if(musicalScales[0] == 1){
            for(int i = 1 ; i < 8; i++){
                if(musicalScales[i] != number[i]){
                    System.out.println("mixed");
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                System.out.println("ascending");
            }
        }else if(musicalScales[0] == 8){
            for(int i = 7 ; i >= 1; i--){
                if(musicalScales[i] != number[7 - i]){
                    System.out.println("mixed");
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                System.out.println("descending");
            }
        }else {
            System.out.println("mixed");
        }


    }
}
