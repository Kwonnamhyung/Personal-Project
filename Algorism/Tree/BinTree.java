package Algorism.Tree;

import java.util.Comparator;

public class BinTree<K,V> {

    public static void main(String[] args) {

    }


    static class Node<K,V>{

        private K key;
        private V data;
        private Node<K,V> left;
        private Node<K,V> right;

        Node(K key , V data , Node<K,V> left , Node<K,V> right){
            this.key = key;
            this.data= data;
            this.left = left;
            this.right = right;
        }

        public K getKey(){
            return key;
        }

        public V getValue(){
            return data;
        }

        public void print(){
            System.out.println(data);
        }
    }

    private Node<K,V> root;
    private Comparator<? super K> comparator = null;

    public BinTree(){
        root = null;
    }

    public BinTree(Comparator<? super K> c){
        this();
        comparator = c;
    }

    private int comp(K key1,K key2){

        if(comparator == null){
            return ((Comparable<K>)key1).compareTo(key2);
        }else{
            return comparator.compare(key1,key2);
        }
    }

    public V search(K key){

        Node<K,V> cur = root;

        while (true){

            if(cur == null){
                return null;
            }

            int cond = comp(key , cur.getKey());

            if(cond == 0){
                return cur.getValue();
            }else if(cond > 0){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
    }

    public void add(K key, V data){

        if(root == null){
            root = new Node<>(key,data,null,null);
        }else{
            this.addNode(root,key,data);
        }
    }

    private void addNode(Node<K,V> root, K key, V data) {

        int comd = comp(key , root.getKey());

        if(comd == 0){
            return;
        } else if (comd > 0) {

            if(root.right == null){
                root.right = new Node<>(key,data,null,null);
            }else{
                addNode(root.right,key,data);
            }
        } else {

            if(root.left == null){
                root.left = new Node<>(key,data,null,null);
            }else {
                addNode(root.left,key,data);
            }
        }
    }

    public boolean remove(K key){
        Node<K,V> cur = root;
        Node<K,V> parent  = null;
        boolean isLeftChild = true;

        while (true){

            if(cur == null){
                return false;
            }

            int cond = comp(key , cur.getKey());

            if(cond == 0){
                break;
            }else {

                parent = cur;
                if(cond > 0){
                    isLeftChild = false ;
                    cur = cur.right;
                }else {
                    isLeftChild = true;
                    cur = cur.left;
                }
            }
        }

        if(cur.left == null){

            if(cur == root){
                root  = cur.right;
            }else if(isLeftChild){
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        } else if (cur.right == null){

            if(cur == root){
                root = cur.left;
            }else if (isLeftChild){
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        } else {

            parent = cur;
            Node<K,V> left = cur.left;
            isLeftChild = true;
            while (left.right != null){
                parent = left;
                left = left.right;
                isLeftChild = false;
            }

            cur.key = left.key;
            cur.data = left.data;
            if(isLeftChild){
                parent.left = left.left;
            }else {
                parent.right = left.left;
            }
        }
        return true;
    }

    public void print(){
        pritnSubTree(root);
    }

    private void pritnSubTree(Node<K,V> node){

        if(node != null){
            pritnSubTree(node.left);
            System.out.println(node.key + " : " + node.data);
            pritnSubTree(node.right);
        }
    }

    private void printReverse(Node<K,V> node){

        if(node!= null){
            printReverse(node.right);
            System.out.println(node.key + " : " + node.data);
            printReverse(node.left);
        }
    }

    public K getMinKey(){

        Node<K,V> cur = root;

        if(cur == null){
            return null;
        }else {

            while (cur.left != null){

                cur = cur.left;
            }

            return cur.getKey();
        }
    }

    public V getDataWithMinKey(){

        Node<K,V> cur = root;

        if(cur == null){
            return null;
        }else {

            while (cur.left != null){

                cur = cur.left;
            }

            return cur.getValue();
        }

    }

    public K getMaxKey(){

        Node<K,V> cur = root;

        if(cur == null){
            return null;
        }else {

            while (cur.right != null){
                cur = cur.right;
            }

            return cur.getKey();
        }
    }

    public V getDataWithMaxKey(){

        Node<K,V> cur = root;

        if(cur == null){
            return null;
        }else {

            while (cur.right != null){
                cur = cur.right;
            }

            return cur.getValue();
        }
    }



}
