package Algorism.Alignment;

public class EX_4_1 {

    public static void main(String[] args) {

    }
}

class IntStack{

    private int[] stack;
    private int capacity;
    private int pointer;


    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public IntStack(int maxlen){

        pointer = 0;
        capacity = maxlen;
        try {
            stack = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public void push(int x) throws OverflowIntStackException{
        if(pointer >= capacity){
            throw new OverflowIntStackException();
        }

        stack[pointer] = x;
        pointer++;
    }

    public int pop() throws EmptyIntStackException{

        if(pointer <= 0 ){
            throw new EmptyIntStackException();
        }

        pointer--;
        int result = stack[pointer];


        return result;
    }

    public int peek() throws EmptyIntStackException{

        if(pointer <=0){
            throw new EmptyIntStackException();
        }

        return stack[pointer - 1];
    }

    public void clear(){
        pointer = 0;
    }

    public int indexOf(int x){

        for(int i = stack.length - 1; i >= 0 ; i--){

            if(stack[i] == x){
                return i;
            }
        }

        return -1;
    }

    public int getCapacity(){

        return capacity;
    }

    public int size(){
        return pointer;
    }

    public boolean isEmpty(){

        return pointer <= 0;
    }

    public boolean isFull(){

        return pointer >= capacity;
    }

    public void dump(){

        if(pointer <= 0){
            System.out.println("Stack is Empty");
        } else{
            for(int i = 0; i < stack.length; i++){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

