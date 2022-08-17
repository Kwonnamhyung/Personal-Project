package Baek_Joon.CLASS1;

import java.io.IOException;
import java.util.Scanner;


public class case_10951 {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int numA = scanner.nextInt();
            int numB = scanner.nextInt();

            if(numA < 10 && numB < 10){
                System.out.println(numA + numB);
            }
        }

        scanner.close();

    }
}
