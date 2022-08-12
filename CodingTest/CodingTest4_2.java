package CodingTest;

import java.util.ArrayList;

public class CodingTest4_2 {

    public static void main(String[] args) {

        String[] words = {"zero", "base", "students", "are", "the", "best"};
        String[] queries = {"z*", "*e", "s*"};
        System.out.println(solution(words,queries));

    }

    public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        int index = 0;
        String queries_tmp = "";
        String words_tmp = "";

        for(int i = 0; i < queries.length; i ++){

            index = queries[i].indexOf('*');

            if(index == 0){
                queries_tmp = queries[i].substring(index + 1);
                for(int k = 0 ; k < words.length; k++){
                    words_tmp = words[k].substring(words[k].length() - queries_tmp.length());
                    if(words_tmp.equals(queries_tmp)){
                        count++;
                    }
                }
            } else {
                queries_tmp = queries[i].substring(0,index);
                for(int k = 0 ; k < words.length; k++){
                    words_tmp = words[k].substring(0,index);
                    if(words_tmp.equals(queries_tmp)){
                        count++;
                    }
                }
            }

            answer[i] = count;
            count = 0;
        }


        return answer;
    }

}
