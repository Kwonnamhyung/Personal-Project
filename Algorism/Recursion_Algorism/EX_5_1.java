package Algorism.Recursion_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_5_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수를 입력하세요 : ");
        int number = Integer.parseInt(br.readLine());

        System.out.println(number + "의 팩토리얼은 " + factorial(number) +"입니다");
    }

    static int factorial(int number){

        if(number > 0){
            return number * factorial(number - 1);
        }else {
            return 1;
        }
    }


}
