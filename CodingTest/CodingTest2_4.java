package CodingTest;

public class CodingTest2_4 {

    public static void main(String[] args) {


        int delay= 5;
        int capacity = 5;
        int[] times = {3,2,0,0,2,3,0,0,2,2,5};

        System.out.println(solution(delay,capacity,times));
    }

    public static int solution(int delay , int capacity,int[] times){
        int currentTime = 0;
        int sent = 0;
        int Queue = 0;
        int result = 0;


        for(int time : times){
            currentTime += time;
            sent = currentTime / delay;
            Queue = Math.max(0,Queue - sent);

            if(Queue == capacity){
                result++;
            }else {
                Queue++;
            }

            currentTime = currentTime % delay;
        }

        return result;

    }
}
