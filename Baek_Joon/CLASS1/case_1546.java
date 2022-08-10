package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Float[] grade = new Float[num];
        float max = -1;
        float average = 0;
        float sum = 0;

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        for(int i = 0; i < grade.length; i++){
            grade[i] = Float.parseFloat(st.nextToken());
        }

        for(int i = 0; i < grade.length; i++){
            if(grade[i] > max){
                max = grade[i];
            }
        }

        for(int i = 0 ; i < grade.length; i++){
            grade[i] = grade[i] / max * 100;
        }

        for(float f : grade){
            sum = sum + f;
        }

        average = sum / num;

        System.out.println(average);
    }
}
