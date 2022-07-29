package Algorism.SearchAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinSearch {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수 : ");
        int num = Integer.parseInt(br.readLine());
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요 .");

        System.out.print("x[0] : ");
        x[0] = Integer.parseInt(br.readLine());

        for(int i = 1; i < num; i++){

            do{
                System.out.print("x[" + i + "] : ");
                x[i] = Integer.parseInt(br.readLine());
            } while (x[i] < x[i - 1]);
        }

        System.out.println("검색할 값 입력 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = binSearch(x,num,key);

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
        }
    }

    private static int binSearch(int[] x, int num, int key) {

        int pl = 0;
        int pr = num - 1;

        do{
            int pc = (pl + pr) / 2;
            if(x[pc] == key){
                return pc;
            } else if (x[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }while (pr >= pl);


        return -1;
    }
}
