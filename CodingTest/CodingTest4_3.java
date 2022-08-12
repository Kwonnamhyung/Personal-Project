package CodingTest;

import java.util.ArrayList;

public class CodingTest4_3 {

    public static void main(String[] args) {

        String[] words = {"hello", "hear", "hell", "good", "goose", "children", "card", "teachable"};
        String[] queries = {"he??", "g???", "childre?", "goo????", "?"};

        System.out.println(solution(words,queries));

    }

    public static String[][] solution(String[] words, String[] queries) {
        String[][] answer = new String[queries.length][];
        ArrayList list;


        for(int i = 0; i < queries.length; i++){
            int size = queries[i].length();
            list = new ArrayList();

            int index = queries[i].indexOf('?');
            String temp = queries[i].substring(0,index);

            for(int k = 0; k < words.length; k++){
                if(words[k].length() != size){
                    continue;
                }else {
                    String word_temp = words[k].substring(0,temp.length());
                    if(word_temp.equals(temp)){
                        list.add(words[k]);
                    }
                }
            }

            answer[i] = new String[list.size()];

            for(int j = 0; j < list.size(); j++){
                answer[i][j] = String.valueOf(list.get(j));
            }
        }

        return answer;
    }
}
