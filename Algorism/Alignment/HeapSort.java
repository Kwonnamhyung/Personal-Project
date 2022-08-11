package Algorism.Alignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapSort {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("HeapSort");
        System.out.print("요솟수 : ");
        int num = Integer.parseInt(br.readLine());
        int[] numbers= new int[num];

        for(int i = 0 ; i < num; i++){
            System.out.print("numbers[" + i + "]");
            numbers[i] = Integer.parseInt(br.readLine());
        }

        heapSort(numbers,num);

        System.out.println("오름차순으로 정렬");
        for(int i = 0; i < num; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    static void heapSort(int[] numbers,int num){

        for(int i = (num - 1) / 2; i >=0; i--){
            downHeap(numbers,i,num - 1);
        }

        for(int i = num - 1; i > 0; i--){
            swap(numbers,0,i);
            downHeap(numbers,0,i-1);
        }
    }

    static void downHeap(int[] numbers , int left , int right){
        int temp = numbers[left]; //root
        int child;
        int parent;

        for(parent = left; parent < (right + 1) /2 ; parent = child){
            int left_child = parent * 2 + 1;
            int right_child = parent * 2 + 2;

            if(right_child <= right && numbers[right_child] > numbers[left_child]){
                child = right_child;
            }else {
                child = left_child;
            }
            if(temp >= numbers[child]){
                break;
            }
            numbers[parent] = numbers[child];
        }
        numbers[parent] = temp;
    }

    static void swap(int[] numbers, int idx1,int idx2){
        int temp = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = temp;
    }
}
