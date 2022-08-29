package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class case_1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] number = new int[K];
        long count = 0;

        for(int i = 0; i < K ; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(number);

        long max = number[number.length - 1];
        long min = 1;

        while (max >= min){

            long mid = (max + min) / 2;

            for(int i : number){
                count = count + (i / mid);
            }

            if(count >= N){
                min = mid + 1;
            }else {
                max = mid - 1;
            }

            count = 0;
        }

        System.out.println(max);

    }
}
