package CodingTest;

import java.util.*;

public class CodingTest4_1 {

    public static void main(String[] args) {

        String[] titles = {"아모르파티", "아기상어", "올챙이와개구리", "산다는건"};
        String[] lyrics = {"산다는게다그런거지누구나빈손으로와", "아기상어뚜루루뚜루귀여운뚜루루뚜루", "개울가에올챙이한마리꼬물꼬물헤엄치다", "산다는건다그런거래요힘들고아픈날도많지만"};
        String[] problems ={"산다", "아기상어", "올챙이"};

        System.out.println(solution(titles,lyrics,problems));

    }

    public static String[][] solution(String[] titles, String[] lyrics, String[] problems) {
        String[][] answer = new String[problems.length][];
        ArrayList arrayList;
        int count = 0;

        for(int i = 0; i < problems.length; i++){
            String problem = problems[i];
            arrayList = new ArrayList();
            for(int k = 0; k < lyrics.length; k++){
                String tmp = lyrics[k].substring(0,problem.length());

                if(tmp.equals(problem)){
                   arrayList.add(titles[k]);
                }
            }
            System.out.println(arrayList);

            answer[i] = new String[arrayList.size()];

            for(int k  = 0 ; k < arrayList.size(); k++){
                answer[i][k] = String.valueOf(arrayList.get(k));
            }
        }

        return answer;
    }
}
