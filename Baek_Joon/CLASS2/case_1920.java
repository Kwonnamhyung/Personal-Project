package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class case_1920  {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int[] M_Arrays = new int[M];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        for(int i = 0; i < M_Arrays.length; i++){
            M_Arrays[i] = Integer.parseInt(st.nextToken());
        }

        int N = Integer.parseInt(br.readLine());
        int[] N_Arrays = new int[N];

        str = br.readLine();
        st = new StringTokenizer(str);

        for(int i = 0; i < N_Arrays.length; i++){
            N_Arrays[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        Arrays.sort(M_Arrays);

        for(int i : M_Arrays){
            if(i > max){
                max = i;
            }
        }

        for(int i = 0; i < N_Arrays.length; i++){
            int temp = N_Arrays[i];

            if(temp <= max ) {
                search(M_Arrays,temp , 0,M_Arrays.length - 1);
            } else {
                System.out.println("0");
                continue;
            }

        }

    }

    public static void search(int[] M_Arrays , int target , int first , int last){

        if(first >= last){
            if(target == M_Arrays[first]){
                System.out.println("1");
                return;
            }else {
                System.out.println("0");
                return;
            }
        }

        int mid = (last + first) / 2;

        if(target > M_Arrays[mid]){
            search(M_Arrays,target,mid + 1 , last);
        } else if(target < M_Arrays[mid]){
            search(M_Arrays,target,first,mid);
        } else {
            System.out.println("1");
            return;
        }
    }
}
