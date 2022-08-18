package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTest6_3 {

    public static void main(String[] args) {

        String[] ingredients = {"생닭", "인삼", "소주", "대추"};
        String[] items = {"물", "인삼", "커피", "생닭", "소주", "사탕", "생닭", "대추", "쌀"};

        System.out.println(solution(ingredients,items));
    }

    public static int solution(String[] ingredients, String[] items) {

        if(ingredients == null || items == null){
            return 0;
        }



        int first = 0;
        int last = ingredients.length - 1;
        int min = Integer.MAX_VALUE;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(ingredients));

        for(int i = 0; i < items.length; i++){
            if(list.contains(items[i])){
                first = i;
                break;
            }
        }

        while (true) {
            String[] temp = Arrays.copyOfRange(items,first,last + 1);
            ArrayList<String> list_temp = new ArrayList<>(Arrays.asList(temp));

            if(list_temp.containsAll(list) == false){
                last++;
            }else {
                if(min > last - first){
                    min = last - first;
                }
                break;
            }
        }

        return min + 1;

    }

}
