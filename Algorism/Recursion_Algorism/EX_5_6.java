package Algorism.Recursion_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_5_6 {

    private static String[] memo;
    private static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수를 입력하시오 : ");
        int num = Integer.parseInt(br.readLine());

        memo = new String[num + 2];
        count = 0;
        recur(num);
        System.out.println("호출된 횟수 : " + count);

    }

    private static void recur(int num) {

        count ++;

        if(memo[num + 1] != null ){
            System.out.println(memo[num + 1]);
        } else {

            if(num > 0){
                recur(num - 1);
                System.out.println(num);
                recur(num - 2);
                memo[num + 1] = memo[num] + num + "\n" + memo[num - 1];
            }else{
                memo[num + 1] = "";
            }
        }
    }
}
