package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class case_10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < num; i++) {
            String temp = br.readLine();
            if(temp.contains("push")) {
                StringTokenizer st = new StringTokenizer(temp);
                String temp1 = st.nextToken();
                int number = Integer.parseInt(st.nextToken());
                deque.add(number);
            }else {
                switch (temp) {
                    case "pop" :
                        if(deque.isEmpty()) {
                            System.out.println(-1);
                        }else {
                            System.out.println(deque.poll());
                        }
                        break;
                    case "size" :
                        System.out.println(deque.size());
                        break;
                    case "empty" :
                        if(deque.isEmpty()) {
                            System.out.println(1);
                        }else {
                            System.out.println(0);
                        }
                        break;
                    case "front" :
                        if(deque.isEmpty()){
                            System.out.println(-1);
                        }else{
                            System.out.println(deque.peekFirst());
                        }
                        break;
                    case "back" :
                        if(deque.isEmpty()){
                            System.out.println(-1);
                        }else{
                            System.out.println(deque.peekLast());
                        }
                }
            }
        }
    }
}
