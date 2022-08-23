package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_1085 {

    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        findIndexWidth(x,0);
        findIndexWidth(x,width);

        findIndexHeight(y,0);
        findIndexHeight(y,height);

        System.out.println(min);
    }

    public static void findIndexWidth(int x , int width){
        int count = 0;

        if(width == 0){
            while (x != 0){
                x--;
                count++;
            }
        }else {
            while (x != width){
                x++;
                count++;
            }
        }

        if(min > count){
            min = count;
        }
    }

    public static void findIndexHeight(int y , int height){
        int count = 0;

        if(height == 0){
            while (y != 0){
                y--;
                count++;
            }
        }else {
            while (y != height){
                y++;
                count++;
            }
        }

        if(min > count){
            min = count;
        }
    }
}
