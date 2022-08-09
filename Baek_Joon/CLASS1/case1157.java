package Baek_Joon.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class case1157 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<Character,Integer> map = new LinkedHashMap<>();

        str = str.toUpperCase();
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                map.replace(chars[i], map.get(chars[i]) + 1);
            }else {
                map.put(chars[i],1);
            }
        }

        Object[] answer = map.values().toArray();
        Arrays.sort(answer);
        int max = (int) answer[answer.length - 1];
        int count = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            if(entry.getValue() == max){
                count++;
            }
        }

        if(count == 1){
            for(Map.Entry<Character,Integer> entry : map.entrySet()){

                if(entry.getValue() == max){
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }else{
            System.out.println('?');
        }

    }
}
