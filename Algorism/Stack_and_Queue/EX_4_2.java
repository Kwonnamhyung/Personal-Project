package Algorism.Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_4_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IntStack intStack = new IntStack(64);

        while (true){
            System.out.println();
            System.out.printf("현재 데이터의 개수 : %d / %d\n" , intStack.size(),intStack.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료 : ");

            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                break;
            }

            switch (num){
                case 1 :
                    System.out.println("넣으실 데이터를 입력하시오 : ");
                    int data = Integer.parseInt(br.readLine());

                    try {
                        intStack.push(data);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("Stack is full");
                    }
                    break;
                case 2:
                    try {
                        data = intStack.pop();
                        System.out.println("꺼낸 데이터는 " + data + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 3 :
                    try {
                        data = intStack.peek();
                        System.out.println("찾아본 데이터는 " + data + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 4:
                    intStack.dump();
                    break;

            }
        }
    }
}
