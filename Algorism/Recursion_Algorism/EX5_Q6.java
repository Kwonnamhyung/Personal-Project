package Algorism.Recursion_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EX5_Q6 {

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수를 입력하시오 : ");

        int num = Integer.parseInt(br.readLine());

        recur3(num);
    }

    public static void recur3(int num){

        Stack<Integer> stack = new Stack<>();
        int number = num;

        while (true) {

            if (num > 0) {
                stack.push(num);
                num = num - 1;
                continue;
            }

            if (num > 0) {
                stack.push(num);
                num = num - 2;
                continue;
            }

            if(!stack.isEmpty()){
                System.out.println(stack.pop());
                continue;
            }

            break;
        }

    }
}
