package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_10950 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String str = br.readLine();
            StringTokenizer st =  new StringTokenizer(str);
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());

            System.out.println(numA + numB);
        }
    }
}
