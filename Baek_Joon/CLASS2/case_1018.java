package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_1018 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int vertical = Integer.parseInt(st.nextToken());
        int horizontal = Integer.parseInt(st.nextToken());

        arr = new boolean[vertical][horizontal];

        for (int i = 0; i < vertical; i++) {
            str = br.readLine();

            for (int k = 0; k < horizontal; k++) {
                if (str.charAt(k) == 'W') {
                    arr[i][k] = true;
                } else {
                    arr[i][k] = false;
                }
            }
        }


        int vertical_row = vertical - 7;
        int horizontal_col = horizontal - 7;

        for (int i = 0; i < vertical_row; i++) {
            for (int k = 0; k < horizontal_col; k++) {
                find(i, k);
            }
        }

        System.out.println(min);


    }

    public static void find(int vertical , int horizontal){
        int vertical_end = vertical + 8;
        int horizontal_end = horizontal + 8;
        int count = 0;

        boolean firstColor = arr[vertical][horizontal];

        for(int i = vertical ; i < vertical_end; i++){
            for(int k = horizontal; k < horizontal_end; k++){

                if(arr[i][k] != firstColor){
                    count++;
                }

                firstColor = !firstColor;
            }
            firstColor = !firstColor;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(count,min);
    }
}