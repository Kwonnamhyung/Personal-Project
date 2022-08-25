package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class case_1259 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String temp =br.readLine();
            char[] cArrays = temp.toCharArray();

            if(Integer.parseInt(temp) == 0){
                break;
            }

            Queue<Character> queue = new LinkedList<>();

            for(int i = cArrays.length - 1; i >= 0; i--){
                queue.offer(cArrays[i]);
            }

            String temp2 = "";

            while (!queue.isEmpty()){
                temp2 = temp2 + queue.poll();
            }

            if(temp.equals(temp2)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
    }
}
