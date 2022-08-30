package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class case_1966 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int number = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            str = br.readLine();
            st = new StringTokenizer(str);

            Queue<Integer> numberQueue = new LinkedList<>();
            Queue<Integer> indexQueue = new LinkedList<>();

            for(int k = 0; k < number ; k++){
                numberQueue.add(Integer.parseInt(st.nextToken()));
                indexQueue.add(k);
            }

            int count = 0;
            int max = max(numberQueue);

            while (true){

                int num_temp = numberQueue.poll();
                int index_temp = indexQueue.poll();

                if(num_temp != max){
                    numberQueue.add(num_temp);
                    indexQueue.add(index_temp);
                }else {
                    count++;
                    max = max(numberQueue);
                    if(index_temp == index){
                        System.out.println(count);
                        break;
                    }
                }
            }


        }

    }

    public static int max(Queue<Integer> numberQueue){
        int max = Integer.MIN_VALUE;

        for(int j = 0 ; j < numberQueue.size(); j++){
            int temp = numberQueue.poll();

            if(temp > max){
                max = temp;
            }

            numberQueue.add(temp);
        }

        return max;
    }
}
