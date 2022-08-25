package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class case_1181 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
        String[] temp = new String[num];
        int maxLength = Integer.MIN_VALUE;

        for(int i = 0; i < temp.length; i++){
            temp[i] = br.readLine();
        }

        int cnt = 1;

        for(String s : temp){
            if(s.length() > maxLength){
                maxLength = s.length();
            }
        }

        while (cnt <= maxLength ){
            ArrayList<String> list = new ArrayList<>();
            for(String s : temp){
                if(s.length() == cnt && !list.contains(s)) {
                    list.add(s);
                }
            }
            hashMap.put(cnt,list);
            cnt++;
        }

        LinkedList<String> linkedList = new LinkedList<>();

        for(int i = 1; i <= maxLength; i++){
            printList(hashMap.get(i));
        }

    }

    public static void printList(ArrayList<String> list){

        list.sort(Comparator.naturalOrder());

        for(String s : list){
            System.out.println(s);
        }
    }
}
