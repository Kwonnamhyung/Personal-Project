package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class case_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String[][] str = new String[num][2];
        for(int i = 0; i < num; i++) {
            String temp = br.readLine();
            StringTokenizer st = new StringTokenizer(temp);

            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }

        Arrays.sort(str,new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i = 0 ; i < num; i++) {
            System.out.println(str[i][0] + " " + str[i][1]);
        }


    }
}
