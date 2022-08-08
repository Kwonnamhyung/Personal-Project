package CodingTest;

import java.util.ArrayList;
import java.util.Comparator;

public class K_Number {

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(solution(array,commands));

    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list;

        for(int i = 0; i < commands.length; i++){
            list = new ArrayList<>();
            int first = commands[i][0];
            int last = commands[i][1];
            int select = commands[i][2];

            for(int k = first - 1 ;  k <= last - 1 ; k ++){
                list.add(array[k]);
            }

            list.sort(Comparator.naturalOrder());
            answer[i] = list.get(select - 1);
        }
        return answer;
    }
}
