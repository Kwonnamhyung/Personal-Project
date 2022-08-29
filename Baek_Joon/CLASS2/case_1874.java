package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class case_1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] Arrays =  new int[num];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> str_list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        boolean result = true;

        for(int i = 0; i < Arrays.length; i++){
            Arrays[i] = Integer.parseInt(br.readLine());
        }

        for(int i : Arrays){
            if(i > max) {
                max = i;
            }
        }

        int count = 1;
        int point = 0;

        while (list.size() != max){

            if(count > max){
                list.add(stack.pop());
                str_list.add("-");
            }else {

                if(!stack.isEmpty()){
                    if(stack.peek() == Arrays[point]){
                        list.add(stack.pop());
                        str_list.add("-");
                        point++;
                        continue;
                    }
                }

                stack.push(count);
                str_list.add("+");

                if(stack.peek() == Arrays[point]){
                    list.add(stack.pop());
                    str_list.add("-");
                    point++;
                }

                count++;
            }

        }

        for(int i = 0 ; i < max; i++){

            if(list.get(i) != Arrays[i]){
                System.out.println("NO");
                result = false;
                break;
            }

        }

        if(result){
            for(String s : str_list){
                System.out.println(s);
            }
        }

    }
}
