package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class case_2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 1; i <= num; i++) {
            deque.addLast(i);
        }

        while (deque.size() != 1) {

            deque.pollFirst();

            deque.addLast(deque.pollFirst());
        }

        System.out.println(deque.pollFirst());
    }
}
