package Algorism.SearchAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PhysExamSearch {

    public static void main(String[] args) throws IOException {

        Comparator<PhyscData> comparator = new HeightOrderComparator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PhyscData[] x ={ new PhyscData("강민하" , 162,0.3),
                new PhyscData("이수연" , 168,0.4),
                new PhyscData("황지안" , 169,0.8),
                new PhyscData("유서범" , 171,1.5),
                new PhyscData("김찬우" , 173,0.7),
                new PhyscData("장경오" , 174,1.2),
                new PhyscData("박준서" , 175,2.0)};

        System.out.println("찾고 싶은 사람의 키를 입력하시오 : ");
        int height = Integer.parseInt(br.readLine());

        int idx = Arrays.binarySearch(x,new PhyscData( "",height,0.0),comparator);

        if(idx < 0){
            System.out.println("찾으시는 사람이 없습니다.");
        } else{
            System.out.println("그 값은 x[ " + idx + "]  에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx].toString());
        }


    }
}

class HeightOrderComparator implements Comparator<PhyscData>{

    public int compare(PhyscData p1 , PhyscData p2) {
        return 0;
    }

}
class PhyscData{

    private String name;
    private int height;
    private double vision;

    PhyscData(String name,int height,double vision){
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    public String toString(){
        return name + " " + height + " " + vision;
    }
}

