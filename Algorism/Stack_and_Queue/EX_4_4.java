package Algorism.Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_4_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IntArrayQueue queue = new IntArrayQueue(64);

        while (true){

            System.out.println();
            System.out.printf("현재 데이터의 개수 : %d / %d\n" , queue.size(),queue.getCapacity());
            System.out.println("(1)enque (2)deque (3)peek (4)dump (0)exit");

            int menu = Integer.parseInt(br.readLine());

            if(menu == 0){
                break;
            }
            switch (menu){
                case 1 :
                    System.out.print("데이터를 입려하시오 : ");
                    int data = Integer.parseInt(br.readLine());

                    try {
                        queue.enque(data);
                    }catch (IntArrayQueue.OverflowIntArrayQueue e ){
                        System.out.println("Queue is Full");
                    }
                    break;
                case 2:
                    try {
                        data = queue.deque();
                        System.out.println("찾으시는 데이터는 " + data + "입니다.");
                    }catch (IntArrayQueue.EmptyIntArrayQueue e ){
                        System.out.println("Queue is Empty");
                    }

                    break;
                case 3:
                    try {
                        System.out.println("찾아보신 데이터는 " + queue.peek() + "입니다.");
                    }catch (IntArrayQueue.EmptyIntArrayQueue e){
                        System.out.println("Queue is Empty");
                    }

                    break;
                case 4:
                    queue.dump();
                    break;
            }
        }
    }
}
