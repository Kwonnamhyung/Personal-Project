package CodingTest;

import java.util.Arrays;

public class CodingTest5_3 {

    public static void main(String[] args) {

        int[] arr = {-3,0,3,4,5,12,15,14,12,11};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = -1;

        answer = searchPeek(arr, 0 , arr.length - 1);

        return answer;
    }

    static int searchPeek(int[] arr , int left , int right){

        if(arr == null || arr.length < 3){
            return -1;
        }

        int mid = (left + right) / 2;

        if(mid == 0 || mid == arr.length - 1){
            return -1;
        }

        if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]){
            return mid;
        }

        if(arr[mid - 1] > arr[mid]){
            return searchPeek(arr,left,mid - 1);
        }

        if(arr[mid + 1] > arr[mid]){
            return searchPeek(arr,mid +1 , right);
        }

        return -1;
    }
}

