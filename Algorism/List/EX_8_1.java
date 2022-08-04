package Algorism.List;

import java.util.Comparator;

public class EX_8_1 {

    public static void main(String[] args) {

    }
}

class LinkedList<E> {

    private Node<E> head;
    private Node<E> crnt;

    LinkedList(){
        head = crnt = null;
    }

    class Node<E> {

        private E data;
        private Node<E> next;

        Node(E data , Node<E> next){
            this.data = data;
            this.next = next;

        }
    }


    public E search(E obj , Comparator<? super E> c){
        Node<E> ptr = head;

        while (ptr != null){

            if(c.compare(obj,ptr.data) == 0){
                crnt = ptr;
                return ptr.data;
            }

            ptr =  ptr.next;
        }

        return null;
    }

    public void addFirst(E obj){

        Node<E> ptr = head;
        head = crnt = new Node<>(obj,ptr);
    }

    public void addLast(E obj){

        if(head == null){
            addFirst(obj);
        }else {

            Node<E> ptr = head;

            while (ptr.next != null){
                ptr = ptr.next;
            }

            ptr.next = crnt = new Node<>(obj,null);
        }
    }

    public void removeFirst(){

        if(head != null){
            head = crnt = head.next;
        }
    }

    public void removeLast(){

        if(head != null){

            if(head.next == null){
                removeFirst();
            }else {

                Node<E> ptr = head;
                Node<E> pre = head;

                while (ptr.next != null){
                    pre = ptr;
                    ptr = ptr.next;
                }

                pre.next = null;
                crnt = pre;
            }
        }
    }

    public void remove(Node<E> p) {

        if(head != null) {
            if (head.next == null){
                removeFirst();
            } else {
                Node<E> ptr = head;

                while (ptr.next != p){
                    ptr = ptr.next;
                    if(ptr.next == null){
                        return;
                    }
                }

                ptr.next = p.next;
                crnt = ptr;
            }
        }
    }

    public void removeCurrentNode() {
        remove(crnt);
    }

    public void clear(){
        while (head != null){
            removeFirst();
        }

        crnt = null;
    }

    public boolean next(){

        if(crnt == null || crnt.next == null){
            return false;
        }

        crnt = crnt.next;
        return true;
    }

    public void printCurrentNode(){

        if(crnt == null){
            System.out.println("선택한 노드가 없습니다.");
        } else {
            System.out.println(crnt.data);
        }
    }

    public void dump(){

        Node<E> ptr = head;

        while (ptr.next != null){

            System.out.print(ptr.data);
            ptr = ptr.next;
        }
    }
}
