package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class case_1021 {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> deque = new LinkedList<>();

        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] str = s.split(" ");

        int size = Integer.parseInt(str[0]);
        int num = Integer.parseInt(str[1]);

        for(int i = 1; i <= size; i++){
            deque.addLast(i);
        }

        s = br.readLine();
        str = s.split(" ");
        int[] index = new int[str.length];

        for(int i = 0; i < index.length; i++){
            index[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0 ; i < index.length; i++){

            int idx = deque.indexOf(index[i]);
            int half_idx;

            if(deque.size() % 2 == 0){
                half_idx = deque.size() / 2 -1;
            }else {
                half_idx = deque.size() / 2;
            }

            if(idx <= half_idx) {

                for(int k = 0 ; k < idx; k++){
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            }else{

                for(int k = 0; k < deque.size() - idx ; k ++){
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();

        }
        System.out.println(count);
    }
}
