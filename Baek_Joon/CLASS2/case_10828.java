package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class case_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < num; i++) {
            String temp = br.readLine();
            if(temp.contains("push")) {
                StringTokenizer st = new StringTokenizer(temp);
                String temp1 = st.nextToken();
                int number = Integer.parseInt(st.nextToken());
                stack.push(number);
            }else {
                switch (temp) {
                    case "pop" :
                        if(stack.isEmpty()) {
                            System.out.println(-1);
                        }else {
                            System.out.println(stack.pop());
                        }
                        break;
                    case "size" :
                        System.out.println(stack.size());
                        break;
                    case "empty" :
                        if(stack.isEmpty()) {
                            System.out.println(1);
                        }else {
                            System.out.println(0);
                        }
                        break;
                    case "top" :
                        if(stack.isEmpty()){
                            System.out.println(-1);
                        }else{
                            System.out.println(stack.peek());
                        }
                        break;
                }
            }
        }
    }
}
