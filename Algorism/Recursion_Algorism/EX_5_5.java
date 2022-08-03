package Algorism.Recursion_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EX_5_5 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());

        recur(num);
    }

    public static void recur(int num){

        Stack<Integer> stack = new Stack();

        while (true){

            if(num > 0){
                stack.push(num);
                num = num - 1;
                continue;
            }
            if(!stack.isEmpty()){
                num = stack.pop();
                System.out.println(num);
                num = num - 2;
                continue;
            }

            break;
        }
    }
}
