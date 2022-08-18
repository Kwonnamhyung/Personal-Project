package CodingTest;

public class CodingTest6_1 {

    public static void main(String[] args) {
        int[] values = {2,1,3,4,5};

        solution(values);

    }

    public static int[] solution(int[] values) {

        if(values == null){
            return null;
        }
        int[] answer = new int[2];

        int first = 0;
        int last = 0;
        int len = 0;

        while (last < values.length - 1 ){

            if(values[last] < values[last + 1]){
                last++;
                if(last == values.length - 1){
                    len = last - first;
                    answer[0] = first;
                    answer[1] = last;
                }
            }else {
                if(last - first > len){
                    len = last - first;
                    answer[0] = first;
                    answer[1] = last;
                }
                first = last + 1;
                last++;
            }
        }

        if(len == 0){
            answer[0] = 0;
            answer[1] = 0;
        }

        return answer;
    }
}
