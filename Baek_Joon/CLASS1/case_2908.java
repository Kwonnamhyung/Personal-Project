package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class case_2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        String numA = st.nextToken();
        String numB = st.nextToken();


        Stack<Character> stack = new Stack<>();

        char[] cArrays = numA.toCharArray();

        for(char c : cArrays){
            stack.push(c);
        }

        numA = "";

        while (!stack.isEmpty()){
            numA = numA + stack.pop();
        }

        char[] cArrays2 = numB.toCharArray();

        for(char c :cArrays2){
            stack.push(c);
        }

        numB = "";

        while (!stack.isEmpty()){
            numB = numB + stack.pop();
        }


        if(Integer.parseInt(numA) > Integer.parseInt(numB)){
            System.out.println(numA);
        }else {
            System.out.println(numB);
        }
    }
}
