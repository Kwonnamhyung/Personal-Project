package Algorism.Alignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class partition2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("배열을 나눕니다.");
        System.out.println("요솟수 : ");

        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("numbers [ " + i + " ]");
            numbers[i] = Integer.parseInt(br.readLine());
        }

        partition(numbers,0,num -1);

        System.out.println("오름차순으로 정렬하였습니다.");
        for(int i =0; i < num; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    static void partition(int[] numbers , int left , int right){
        IntStack lStack = new IntStack(right - left + 1);
        IntStack rStack = new IntStack(right - left + 1);

        lStack.push(left);
        rStack.push(right);

        while (!lStack.isEmpty()){

            int pl = left = lStack.pop();
            int pr = right = rStack.pop();
            int pivot = numbers[(pl + pr) / 2];

            while (numbers[pl] < pivot){
                pl++;
            }
            while (numbers[pr] > pivot){
                pr--;
            }

            if(pr >= pl){
                swap(numbers,pl,pr);
                pr--;
                pl++;
            }

            if(left < pr){
                lStack.push(left);
                rStack.push(pr);
            }

            if(right > pl){
                lStack.push(pl);
                rStack.push(right);
            }
        }


    }

    static void swap(int[] numbers, int idx1 , int idx2){
        int temp = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = temp;
    }
}
