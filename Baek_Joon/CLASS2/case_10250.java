package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_10250 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int high = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int x = 1;
            int y= 1;
            int count = 1;
            while (count != N) {

                count++;
                x++;
                if(x > high) {
                    x = 1;
                    y++;
                }

            }

            int result = x * 100 + y * 1;
            System.out.println(result);

        }
    }
}
