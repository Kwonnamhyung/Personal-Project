package Baek_Joon.CLASS1;

import java.io.IOException;
import java.util.Scanner;


public class case_10952 {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        while (true){
            int numA = scanner.nextInt();
            int numB = scanner.nextInt();

            if(numA == 0 && numB == 0){
                break;
            }

            System.out.println(numA + numB);

        }

        scanner.close();

    }
}