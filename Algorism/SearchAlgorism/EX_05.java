package Algorism.SearchAlgorism;

public class EX_05 {

    public static void main(String[] args) {

        int[] n = {1,3,5,7,7,7,7,8,8,9,9};
        int key = 7;

        System.out.println(binSearch(n,n.length,key));
    }

    public static int binSearch(int[] a , int n , int key){

        int pl = 0;
        int pr = n - 1;

        do{
            int pc = (pl + pr) / 2;

            if(a[pc] == key){

                while (a[pc] == a[pc - 1]){
                    pc = pc - 1;
                }

                return pc;

            } else if (key > a[pc]) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }while (pr >= pl);

        return -1;
    }
}
