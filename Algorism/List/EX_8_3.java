package Algorism.List;

import java.util.Comparator;

public class EX_8_3 {

    public static void main(String[] args) {

    }
}

class DoubleLinkedList<E> {

    private Node<E> head;
    private Node<E> crnt;


    class Node<E> {

        private E data;
        private Node<E> prev;
        private Node<E> next;


        Node(){
            this.data = null;
            prev = next = this;
        }
        Node(E data , Node<E> prev , Node<E> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public DoubleLinkedList(){ //head가 가리키는 더미노드를 생성
        head = crnt = new Node<>();
    }

    public boolean isEmpty(){
        return head.next == head;
    }

    public E search(E obj, Comparator <? super E> c){

        Node<E> ptr = head.next;

        while (ptr.next != head){

            if(c.compare(obj, ptr.data) == 0){
                crnt = ptr;
                return ptr.data;
            }

            ptr = ptr.next;
        }

        return null;
    }

    public void printCurrntNode(){

        if(isEmpty()){
            System.out.println("선택하신 노드가 없습니다.");
        } else {
            System.out.println(crnt.data);
        }
    }

    public void dump(){

        Node<E> ptr = head.next;

        while (ptr != head){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public void dumpReverse(){

        Node<E> ptr = head.prev;

        while (ptr != head){
            System.out.println(ptr.data);
            ptr = ptr.prev;
        }
    }

    public boolean next(){

        if(isEmpty() || crnt.next == head){
            return false;
        }

        crnt = crnt.next;
        return true;
    }

    public boolean prev(){

        if(isEmpty() || crnt.prev == head){
            return false;
        }

        crnt = crnt.prev;
        return true;
    }

    public void add(E obj){
        Node<E> node = new Node<>(obj,crnt,crnt.next);
        crnt.next = crnt.next.prev = node;
        crnt = node;
    }

    public void addFirst(E obj){

        crnt = head;
        add(obj);
    }

    public void addLast(E obj){

        crnt = head.prev;
        add(obj);
    }

    public void removeCurrentNode(){

        if(!isEmpty()){
            crnt.prev.next = crnt.next;
            crnt.next.prev = crnt.prev;
            crnt = crnt.prev;

            if(crnt == head){
                crnt = head.next;
            }
        }
    }

    public void remove(Node<E> p){

        Node<E> ptr = head.next;

        while (ptr != head){

            if(ptr == p){
                crnt = ptr;
                removeCurrentNode();
                break;
            }

            ptr = ptr.next;
        }
    }

    public void removeFirst(){

        crnt = head.next;
        removeCurrentNode();
    }

    public void removeLast(){

        crnt = head.prev;
        removeCurrentNode();
    }

    public void clear(){

        while (!isEmpty()){
            removeFirst();
        }
    }
}
