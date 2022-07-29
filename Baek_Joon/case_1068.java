package Baek_Joon;

public class case_1068 {

    public static void main(String[] args) {

    }
}
class BinaryTree{

    Node head;

    BinaryTree(int parent, int data){
        if(parent == -1){
            this.head = new Node(-1, 0,null,null);
        }
    }

    public void addNode(Node cur, int parent, int data){

        if(cur.data == parent){
           if(cur.left == null){
               cur.left = new Node(parent,data,null,null);
           }else{
               cur.right = new Node(parent,data,null,null);
           }
        }

        if(cur.left != null && parent != cur.data){
            addNode(cur.left,parent,data);
        }

        if(cur.right != null && parent != cur.data){
            addNode(cur.right,parent,data);
        }
    }

}
class Node{

    int data;
    int parent;
    Node left;
    Node right;

    Node(int parent, int data , Node left , Node right){
        this.parent = parent;
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
