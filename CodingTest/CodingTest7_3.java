package CodingTest;

import java.util.ArrayList;

public class CodingTest7_3 {

    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {


        String s = "16819501";

        System.out.println(solution(s));
    }

    public static String[] solution(String s) {
        String[] answer = {};

        char[] cArrays = s.toCharArray();
        return answer;
    }

    public static void recursive(char[] cArrays){

        int count = 0;
        for(char c : cArrays){

            if(c == '.'){
                count++;
            }
        }

        if(count == 3){
            list.add(String.valueOf(cArrays));
            return;
        }





    }
}
