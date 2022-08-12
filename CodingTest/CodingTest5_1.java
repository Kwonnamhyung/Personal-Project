package CodingTest;

import java.util.Arrays;

public class CodingTest5_1 {

    public static void main(String[] args) {
        System.out.println(solution("imfinethankyou","atfhinemnoyuki"));
    }

    public static boolean solution(String s, String t) {
        boolean answer = true;

        if(s.length() != t.length()){
            return false;
        }
        char[] charArray = s.toCharArray();
        quickSort(charArray,0, charArray.length - 1);

        s = String.valueOf(charArray);

        char[] charArray2 = t.toCharArray();
        quickSort(charArray2,0, charArray2.length - 1);

        t = String.valueOf(charArray2);

        if(s.equals(t)){
            answer = true;
        }else {
            answer = false;
        }

        return answer;
    }

    public static void quickSort(char[] arr, int left, int right) {
        if(left >= right){
            return;
        }

        int pivot = partition(arr,left,right);

        quickSort(arr,left,pivot - 1);
        quickSort(arr,pivot + 1,right);

    }

    public static int partition(char[] arr, int left, int right) {
        int pivot = arr[left];
        int left_cur = left;
        int right_cur = right;

        while (left_cur < right_cur){
            while (arr[right_cur] > pivot && left_cur < right_cur){
                right_cur--;
            }

            while (arr[left_cur] <= pivot && left_cur < right_cur){
                left_cur++;
            }

            swap(arr,left_cur,right_cur);
        }

        swap(arr,left,left_cur);

        return left_cur;
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
