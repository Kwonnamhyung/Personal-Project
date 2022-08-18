package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class case_2003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int count = 0;
        int firstPoint = 0;
        int lastPoint = 0;
        int[] numbers = new int[num];
        int sum = 0;

        str = br.readLine();
        st = new StringTokenizer(str);
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        while (true){

            if(lastPoint >= numbers.length){
                break;
            }

            for(int i = firstPoint; i <= lastPoint; i++){
                sum = sum + numbers[i];
            }

            if(sum == target){
                count++;
                firstPoint++;
                sum = 0;
            }else if(sum < target){
                lastPoint++;
                sum = 0;
            }else{
                firstPoint++;
                sum = 0;
            }

        }

        System.out.println(count);

    }
}
