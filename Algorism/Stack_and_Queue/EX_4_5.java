package Algorism.Stack_and_Queue;

public class EX_4_5 {
}

class IntDeque{

    private int[] deque;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    IntDeque(int capacity){
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.num = 0;
        deque = new int[capacity];
    }

    public class EmptyIntDequeException extends RuntimeException{
        public EmptyIntDequeException(){}
    }

    public class OverflowIntDequeException extends RuntimeException{
        public OverflowIntDequeException(){}
    }

    public void firstenque(int data) throws OverflowIntDequeException{
        if(num >= capacity){
            throw new OverflowIntDequeException();
        }

        deque[front] = data;
        num ++;

        if(front == 0){
            front = capacity;
        }
        front--;
    }

    public void lastenque(int data) throws OverflowIntDequeException{
        if(num >= capacity){
            throw new OverflowIntDequeException();
        }

        deque[rear] = data;
        rear++;
        num ++;

        if(rear == capacity){
            rear = 0;
        }
    }

    public int firstdeque() throws  EmptyIntDequeException{
        if(num <= 0){
            throw new EmptyIntDequeException();
        }

        front++;
        int result = deque[front];
        num--;

        if(front == capacity){
            front = 0;
        }

        return result;
    }

    public int lastdeque() throws EmptyIntDequeException{

        if(num <= 0){
            throw new EmptyIntDequeException();
        }


        if(rear == 0){
            rear = capacity;
        } else{
            rear--;
        }

        int result = deque[rear];
        num--;

        return result;

    }

    public int firstpeek() throws EmptyIntDequeException {
        if(num <= 0 ){
            throw new EmptyIntDequeException();
        }

        return deque[front + 1];
    }

    public int lasttpeek() throws EmptyIntDequeException {
        if(num <= 0 ){
            throw new EmptyIntDequeException();
        }

        return deque[rear - 1];
    }

    public void clear(){
        front = 0;
        rear = 0;
        num = 0;
    }

    public int indexOf(int data){

        for(int i = 0; i < num; i++){
            int idx = (i + front) % capacity;
            if(deque[idx] == data){
                return idx;
            }
        }
        return -1;
    }

    public int getCapacity(){
        return capacity;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){

        return num <= 0;
    }

    public boolean isFull(){

        return num >= capacity;
    }

    public void dump(){

        if(num <= 0){
            System.out.println("Deque is Empty");
        }

        for(int i = 0; i < capacity; i++){
            System.out.print(deque[i] + " ");
        }
        System.out.println();
    }

}
