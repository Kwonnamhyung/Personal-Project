package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_2884 {

    public static int TIME = 45;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());


        if(min - TIME < 0){
            min = 60 - Math.abs(min - TIME);

            if(hour == 0){
                hour = 23;
            }else {
                hour = hour - 1;
            }
        } else {
            min = min - TIME;
        }

        System.out.printf( "%d %d" , hour, min);

    }
}
