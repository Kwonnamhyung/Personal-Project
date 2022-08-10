package Algorism.Alignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수 : ");
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("numbers[" + i + "]");
            numbers[i] = Integer.parseInt(br.readLine());
        }

        bubbleSort(numbers,num);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

    }

    static void bubbleSort(int[] numbers , int num) {
        int k = 0;
        while (k < num - 1){
            int last = num - 1;
            for(int i = num - 1; i > k; i--){
                if(numbers[i - 1] > numbers[i]){
                    swap(numbers,i-1,i);
                    last = i;
                }
            }
            k = last;
        }
    }
    
    static void bubbleSort2(int[] numbers , int num){

        for(int i = num - 1 ; i > 0 ; i--){
            int exchg = 0;
            for(int k = 0 ; k < i ; k++){
                if(numbers[k] > numbers[k + 1]){
                    swap(numbers,k,k+1);
                    exchg++;
                }
            }
            if(exchg == 0){
                break;
            }
        }
    }

    static void swap(int[] numbers , int idx1 , int idx2){
        int a = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = a;
    }
}
