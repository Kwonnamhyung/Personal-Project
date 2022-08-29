package Baek_Joon.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class case_1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String deathNumber = "666";
        ArrayList<String> list = new ArrayList();
        int count = 0;

        while (true){

            if(deathNumber.contains("666")){
                list.add(deathNumber);
            }

            if(number == list.size()){
                System.out.println(list.get(list.size() - 1));
                break;
            }

            deathNumber = String.valueOf(Integer.parseInt(deathNumber) + 1);
            count = 0;
        }



    }
}
