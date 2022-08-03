package Algorism.Recursion_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_5_4 {

    private static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());
        count = 0;

        recur(num);
        System.out.println("호출된 횟수 : " + count);
    }

    public static void recur(int num){

        count++;

        if(num > 0){
            recur(num - 1);
            System.out.println(num);
            recur(num - 2);
        }
    }
}
