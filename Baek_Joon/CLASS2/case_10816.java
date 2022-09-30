package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class case_10816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalNum = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);
        for(int i = 0; i < totalNum; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(temp)) {
                hashMap.replace(temp , hashMap.get(temp) + 1);
            }else {
                hashMap.put(temp , 1);
            }
        }

        int searchNum = Integer.parseInt(br.readLine());

        num = br.readLine();
        st = new StringTokenizer(num);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < searchNum; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(temp)) {
                sb.append(String.valueOf(hashMap.get(temp)));
            }else {
                sb.append('0');
            }

            if(i != searchNum - 1)  {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
