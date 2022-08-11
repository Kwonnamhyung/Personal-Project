package Algorism.Alignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {

    static int[] buff;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("병합 정렬");
        System.out.println("요솟수 : ");
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("numbers[" + i +"] : ");
            numbers[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(numbers,num);

        System.out.println("오름차순으로 정렬");
        for(int i : numbers){
            System.out.print( i + " ");
        }

    }

    static void mergeSort(int[] numbers, int num){
        buff = new int[num];

        _mergeSort(numbers,0,num - 1);

        buff = null;
    }

    static void _mergeSort(int[] numbers , int left , int right){
        if(left < right){
            int numbers_pointer;
            int center = (left + right) / 2;
            int buff_pointer = 0;
            int new_buff_pointer = 0;
            int new_numbers_pointer = left;

            _mergeSort(numbers,left,center);
            _mergeSort(numbers,center + 1 , right);

            for(numbers_pointer = left; numbers_pointer <= center; numbers_pointer++){
                buff[buff_pointer] = numbers[numbers_pointer];
                buff_pointer++;
            }

            while (numbers_pointer <= right && new_buff_pointer < buff_pointer){

                if(buff[new_buff_pointer] <= numbers[numbers_pointer]){
                    numbers[new_numbers_pointer] = buff[new_buff_pointer];
                    new_numbers_pointer++;
                    new_buff_pointer++;
                } else if(buff[new_buff_pointer] > numbers[numbers_pointer]){
                    numbers[new_numbers_pointer] = numbers[numbers_pointer];
                    new_numbers_pointer++;
                    numbers_pointer++;
                }
            }

            while (new_buff_pointer < buff_pointer){
                numbers[new_numbers_pointer] = buff[new_buff_pointer];
                new_numbers_pointer++;
                new_buff_pointer++;
            }
        }
    }
}
