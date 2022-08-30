package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_1929 {

    public static boolean isPrime[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        isPrime = new boolean[last + 1];
        get_prime();

        for(int i = first; i <= last; i++){

            if(!isPrime[i]){
                System.out.println(i);
            }
        }


    }

    private static void get_prime() {

        isPrime[0] = isPrime[1] = true;

        for(int i = 2 ; i <= Math.sqrt(isPrime.length); i++){

            if(isPrime[i]){
                continue;
            }

            for(int k = i * i ; k < isPrime.length; k = k + i){
                isPrime[k] = true;
            }
        }
    }
}
