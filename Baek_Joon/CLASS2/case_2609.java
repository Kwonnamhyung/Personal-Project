package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());


        System.out.println(getGCM(num1,num2));
        System.out.println(getLCM(num1,num2,getGCM(num1,num2)));

    }

    public static int getGCM(int num1,int num2){

        int result = -1;

        if(num1 > num2) {

            for(int i = num2; i >= 1; i--) {

                if(num1 % i == 0 && (num2 % i) == 0) {
                    result = i;
                    break;
                }
            }
        } else {

            for(int i = num1; i >= 1; i--) {

                if(num1 % i ==0 && num2 % i ==0) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }

    public static int getLCM(int num1,int num2,int gcm) {

        int result = gcm;
        while (true) {

            if(result % num1 == 0 && (result % num2) == 0) {
                break;
            }

            result = result + gcm;
        }

        return result;

    }

}
