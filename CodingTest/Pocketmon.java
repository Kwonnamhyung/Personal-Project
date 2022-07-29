package CodingTest;

import java.util.HashSet;

public class Pocketmon {

    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));

    }

    public static int solution(int[] nums) {

        int answer = 0;
        int select = nums.length / 2 ;

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i ++){
            hashSet.add(nums[i]);
        }

        if(select <= hashSet.size()){
            answer = select;
        } else {
            answer = hashSet.size();
        }

        return answer;
    }
}
