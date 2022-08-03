package Algorism.Recursion_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_5_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두 정수를 입력하세요 : ");

        System.out.println("첫번째 정수를 입력하시오 : ");
        int x = Integer.parseInt(br.readLine());

        System.out.println("두번째 정수를 입력하시오 : ");
        int y = Integer.parseInt(br.readLine());

        System.out.println("두 수의 최대 공약수는 " + gcd(x,y) + "입니다.");
    }

    public static int gcd(int x , int y){

        if( y == 0){
            return x;
        } else{
            return gcd(y, x % y);
        }
    }
}
