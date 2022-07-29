package Algorism.SearchAlgorism;

public class EX_03 {

    public static void main(String[] args) {
        int[] a ={1,9,2,9,4,6,7,9};

        int key = 9;

        int[] idx = new int[0];

        System.out.println(search(a, 8 ,key,idx));

    }

    public static int search(int[] a , int n , int key , int[] idx){

        int count = 0;
        int index = 0;

        for(int i = 0 ; i < n ; i ++){
            if(a[i] == key){
                count++;
            }
        }

        idx = new int[count];

        for(int i = 0; i < n; i++){
            if(a[i] == key){
                idx[index] = i;
                index++;
            }
        }

        return idx.length;

    }
}
