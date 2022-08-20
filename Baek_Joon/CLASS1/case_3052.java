package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class case_3052 {

    public static final int NUM = 42;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine()) % 42;
        }

        Set<Integer> set = new HashSet<>();

        for(int i : numbers){
            set.add(i);
        }

        System.out.println(set.size());

    }
}
