package Algorism.Stack_and_Queue;

public class EX_4_3 {

    public static void main(String[] args) {

    }
}

class IntArrayQueue{

    private int[] queue;
    private int capacity;
    private int num;
    int front;
    int rear;

    IntArrayQueue(int capacity){
        this.capacity = capacity;
        this.num = 0;
        this.front = 0;
        this.rear = 0;
        try {
            queue = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
        }

    }

    public class EmptyIntArrayQueue extends RuntimeException{
        public EmptyIntArrayQueue(){}
    }

    public class OverflowIntArrayQueue extends RuntimeException{
        public OverflowIntArrayQueue(){}
    }

    public void enque(int data ) throws OverflowIntArrayQueue{

        if(num >= capacity){
            throw  new OverflowIntArrayQueue();
        }

        queue[rear] = data;
        rear++;
        num++;

        if(rear == capacity){
            rear = 0;
        }
    }

    public int deque() throws EmptyIntArrayQueue{

        if(num <= 0){
            throw new EmptyIntArrayQueue();
        }

        int result = queue[front];
        front++;
        num--;

        if(front == capacity){
            front = 0;
        }

        return result;
    }

    public int peek() throws EmptyIntArrayQueue{
        if(num <= 0 ){
            throw new EmptyIntArrayQueue();
        }

        return queue[front];
    }

    public void clear(){
        front = 0;
        rear = 0;
        num = 0;
    }

    public int indexOf(int data){

        for(int i = 0; i < num; i++){
            int idx = (i + front) % capacity;
            if(queue[idx] == data){
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
            System.out.println("Queue is Empty");
        }

        for(int i = 0; i < num; i++){
            System.out.print(queue[(i + front) % capacity] + " ");
        }
        System.out.println();
    }
}
