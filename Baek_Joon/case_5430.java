package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class case_5430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque();
        ArrayList<Integer> list = new ArrayList<>();

        int size = Integer.parseInt(br.readLine());

        outer:
        for(int i = 0; i < size; i++) {

            deque.clear();
            String function = br.readLine();
            String[] functionArrays = function.split("");

            int num = Integer.parseInt(br.readLine());

            String arrangement = br.readLine();

            char[] strings = arrangement.toCharArray();

            for (int k = 0; k < strings.length; k++) {
                if (Character.isDigit(strings[k])) {
                    deque.addLast(Integer.parseInt(String.valueOf(strings[k])));
                }
            }

            for(int j = 0; j < functionArrays.length; j++){
                if(functionArrays[j].equals("R")){

                    for(int m = 0; m < num ; m++){
                         list.add((int)deque.pollLast());
                    }
                    for(int m = 0; m < num ; m++) {
                        deque.addLast(list.get(m));
                    }
                }else if(functionArrays[j].equals("D")){
                    if(deque.isEmpty()){
                        System.out.println("error");
                        continue outer;
                    }else{
                        deque.pollFirst();
                    }
                }
            }

            System.out.println(deque);
        }


    }
}
