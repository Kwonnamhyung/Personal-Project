package Algorism.Alignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수 : ");
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("numbers[" + i + "] : ");
            numbers[i] = Integer.parseInt(br.readLine());
        }

        insertionSort(numbers,num);

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.print("numbers : ");
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] numbers, int num){

        for(int i = 1; i < num; i++){
            int temp = numbers[i];
            int k = i;
            while (k > 0 && numbers[k - 1] > temp){
                numbers[k] = numbers[k - 1];
                k--;
            }
            numbers[k] = temp;
        }
    }
}
