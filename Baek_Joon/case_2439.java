package Baek_Joon;

import java.util.Scanner;

public class case_2439 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        for(int i = num; i > 0; i--){

            for(int k = 0; k < i; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

