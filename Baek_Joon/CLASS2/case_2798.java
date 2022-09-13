package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class case_2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        ArrayList<Integer> list = new ArrayList<>();

        int num = Integer.parseInt(st.nextToken());
        int pointNUm = Integer.parseInt(st.nextToken());
        int[] numbers = new int[num];

        str = br.readLine();
        st = new StringTokenizer(str);
        for(int i = 0; i < num; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            int firstTemp = numbers[i];

            for(int k = i + 1; k < numbers.length; k++) {
                int secondTemp = numbers[k];

                for(int j = k + 1; j < numbers.length; j++) {
                    int thirdTemp = numbers[j];

                    sum += firstTemp + secondTemp + thirdTemp;

                    list.add(sum);

                    sum = 0;
                }
            }
        }

        for(int i : list) {

            if(i <= pointNUm) {
                if(i > max) {
                    max = i;
                }
            }
        }

        System.out.println(max);


    }
}
