package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_11050 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        System.out.println(factorial(N)/(factorial(N-K) * factorial(K)));
    }

    public static int factorial(int N) {

        int result = 1;
        for(int i = N; i>= 1; i--) {
            result = result * i;
        }

        return result;
    }
}
