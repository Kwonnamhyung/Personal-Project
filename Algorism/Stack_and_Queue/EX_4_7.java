package Algorism.Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_4_7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 10;
        int[] arr = new int[N];
        int count = 0;
        int retry;

        System.out.println("정수를 입력하시오 : ");

        do {
            System.out.printf("%d번째 정수 : " , count + 1);
            arr[count++ % N] = Integer.parseInt(br.readLine());

            System.out.print("계속 할까요 ? (예.1 / 아니요.0) :");
            retry = Integer.parseInt(br.readLine());
        }while (retry == 1);

        int index = count - N;
        if(index < 0){
            index = 0;
        }

        for(int i = index; i < count; i++){
            System.out.printf("%2d번째 정수 = %d\n " , i + 1 , arr[i % N]);
        }
    }
}
