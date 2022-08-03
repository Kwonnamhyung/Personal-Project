package Algorism.Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_4_6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IntDeque deque = new IntDeque(5);

        while (true){

            System.out.println();
            System.out.printf("현재 데이터의 개수 : %d / %d\n" , deque.size(),deque.getCapacity());
            System.out.println("(1)firstenque (2)lastenque (3)firstdeque (4)lastdeque (5)firstpeek (6)lastpeek (7)dump(0)exit");

            int menu = Integer.parseInt(br.readLine());

            if(menu == 0){
                break;
            }
            switch (menu){
                case 1 :
                    System.out.print("데이터를 입려하시오 : ");
                    int data = Integer.parseInt(br.readLine());

                    try {
                        deque.firstenque(data);
                    }catch (IntDeque.OverflowIntDequeException e ){
                        System.out.println("Deque is Full");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("데이터를 입려하시오 : ");
                        data = Integer.parseInt(br.readLine());

                        deque.lastenque(data);
                    }catch (IntDeque.OverflowIntDequeException e){
                        System.out.println("Deque is Full");
                    }

                    break;
                case 3:
                    try {
                        data = deque.firstdeque();
                        System.out.println("찾으시는 데이터는 " + data + "입니다.");
                    }catch (IntDeque.EmptyIntDequeException e ){
                        System.out.println("Deque is Empty");
                    }

                    break;
                case 4:
                    try {
                        data = deque.lastdeque();
                        System.out.println("찾으시는 데이터는 " + data + "입니다.");
                    }catch (IntDeque.EmptyIntDequeException e ){
                        System.out.println("Deque is Empty");
                    }
                    break;

                case 5:
                    try {
                        System.out.println("찾아보신 앞의 데이터는 " + deque.firstpeek() + "입니다.");
                    }catch (IntDeque.EmptyIntDequeException e){
                        System.out.println("Deque is Empty");
                    }
                    break;
                case 6:
                    try {
                        System.out.println("찾아보신 뒤의 데이터는 " + deque.lasttpeek() + "입니다.");
                    }catch (IntDeque.EmptyIntDequeException e){
                        System.out.println("Deque is Empty");
                    }
                    break;
                case 7:
                    for(int i = 0; i < deque.getCapacity(); i++){
                        System.out.print( i + " ");
                    }
                    System.out.println();
                    deque.dump();
                    break;
            }
        }
    }
}
