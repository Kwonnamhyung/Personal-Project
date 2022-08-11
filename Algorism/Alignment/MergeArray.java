package Algorism.Alignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = {2,4,6,8,11,13};
        int[] b = {1,2,3,4,9,16,21};
        int[] c = new int[a.length + b.length];

        System.out.println("두 배열을 병합");
        merge(a,a.length,b,b.length,c);

        System.out.println("배열 a 와 배열 b를 병합하였습니다.");

        System.out.println("a의 배열");
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("b의 배열");
        for(int i : b){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("c의 배열");
        for(int i : c){
            System.out.print(i + " ");
        }


    }

    static void merge(int[] a , int a_length,int[] b, int b_length,int[] c){
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < a_length && pb < b_length){

            if(a[pa] <= b[pb]){
                c[pc] = a[pa];
                pa++;
                pc++;
            }else if(a[pa] > b[pb]){
                c[pc] = b[pb];
                pb++;
                pc++;
            }

        }

        while (pa < a_length){
            c[pc] = a[pa];
            pa++;
            pc++;
        }

        while (pb < b_length){
            c[pc] = b[pb];
            pb++;
            pc++;
        }

    }
}
