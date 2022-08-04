package Algorism.Recursion_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_5_7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("하노이의 탑");
        System.out.print("원판의 갯수 : ");
        int num = Integer.parseInt(br.readLine());

        move(num,1,3);
    }

    public static void move(int num , int first, int last){

        if(num > 1){
            move(num - 1,first, 6 - first - last);
        }

        System.out.printf("원반 [%d] 을 %d 번째 기둥에서 %d번째 기둥으로 옮겼습니다.\n",num,first,last);

        if(num > 1){
            move(num - 1,6 - first - last , last);
        }
    }
}
