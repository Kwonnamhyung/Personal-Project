package Algorism.Alignment;

public class SelectionSort {

    public static void main(String[] args) {

        int[]numbers = {3,4,2,3,1};
        selectionSort(numbers, numbers.length);
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }

    static void selectionSort(int[] a , int n){

        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int k = i + 1; k < n; k++){
                if(a[k] < a[min]){
                    min = k;
                }
            }
            swap(a,i,min);
        }
    }
    static void swap(int[] numbers , int idx1 , int idx2){
        int a = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = a;
    }
}
