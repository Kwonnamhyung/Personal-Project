package CodingTest;

import java.util.*;


public class CodingTest5_2 {

    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        System.out.println(solution(numbers));

    }
    public static String solution(int[] numbers) {
        String answer = "";
        String strNumber[] = new String[numbers.length];

        for(int i=0; i<strNumber.length;i++){
            strNumber[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumber, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });

        for(String tmp:strNumber){
            answer+=tmp;
        }

        return answer;

    }
}
