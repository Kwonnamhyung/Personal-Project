package CodingTest;

import java.util.Stack;

public class CodingTest2_2 {

    public static void main(String[] args) {

        int[] a = {5,2,1,4,6};
        int[] b = {6,1,0,4,4};

        int[] c = (solution(a,b));

        for(int i : c){
            System.out.println(i);
        }
    }

    public static int[] solution(int[] a , int[] b){

        Stack<Integer> stack = new Stack<>();

        int maxlen = a.length > b.length ? a.length : b.length;
        int offsetA = maxlen - a.length;
        int offsetB = maxlen - b.length;
        int digit = 0;


        if(a.length == 0){
            return b;
        }

        if(b.length == 0){
            return a;
        }

        for(int i = maxlen - 1; i >= 0; i--){
            int aval = (i - offsetA >= 0) ? a[i - offsetA] : 0;
            int bval = (i - offsetB >= 0) ? b[i - offsetB] : 0;
            int sum = aval + bval + digit;

            if(sum >= 10){
                digit = 1;
                stack.push(sum - 10);
            }else {
                digit = 0;
                stack.push(sum);
            }
        }

        if(digit == 1){
            maxlen++;
            stack.push(1);
        }

        int[] result = new int[maxlen];

        for(int i = 0; i < maxlen; i++){
            result[i] = stack.pop();
        }


        return  result;
    }

}
