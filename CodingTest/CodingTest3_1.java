package CodingTest;

import java.util.*;

public class CodingTest3_1 {
    public static void main(String[] args) {
        int[][] trust = {{1,2},{1,4},{1,3},{2,3},{2,4},{3,4}};
        System.out.println(solution(4,trust));
    }

    public static int solution(int N, int[][] trust) {
        int answer = 0;
        HashMap<Integer,ArrayList<Integer>> hashMap = new HashMap<>();
        ArrayList<Integer> list;
        int judge = 0;
        boolean allTrust = true;
        int count = 0;

        for(int[] b : trust){
            if(hashMap.containsKey(b[0])){
                list = hashMap.get(b[0]);
                list.add(b[1]);
            }else {
                list = new ArrayList<>();
                list.add(b[1]);
            }

            hashMap.put(b[0],list);
        }

        for(int i = 1 ; i <= N; i++){
            if(!hashMap.containsKey(i)){
                judge = i;
                count++;
            }
        }

        for(ArrayList arrayList : hashMap.values()){
            if(!arrayList.contains(judge)){
                allTrust = false;
                break;
            }
        }

        if(allTrust && !hashMap.containsKey(judge) && count == 1){
            answer = judge;
        }else {
            answer = -1;
        }

        return answer;
    }
}
