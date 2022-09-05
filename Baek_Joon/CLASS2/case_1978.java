package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : numbers){

            if(i > max) {
                max = i;
            }

            if(i < min) {
                min = i;
            }
        }

        boolean[] isPrime = new boolean[max + 1];
        get_prime(isPrime);
        int count = 0;

        for( int i : numbers) {

            if(!isPrime[i]){
                count++;
            }
        }

        System.out.println(count);
    }

    private static void get_prime(boolean[] isPrime) {

        isPrime[0] = isPrime[1] = true;

        for(int i = 2; i < Math.sqrt(isPrime.length) ; i ++){

            if(isPrime[i]){
                continue;
            }

            for(int k = i * i ; k < isPrime.length; k = k + i){
                isPrime[k] = true;
            }
        }

    }
}
