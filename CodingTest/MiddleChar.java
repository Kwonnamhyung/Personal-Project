package CodingTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class MiddleChar {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        String first = "";
        String last = "";

        Deque<String> deque = new ArrayDeque();

        for(String c : s.split("")){
            deque.addLast(c);
        }

        if(deque.size() % 2 == 0 ){

            while (!deque.isEmpty()){
                first = deque.pollFirst();
                last = deque.pollLast();
            }

            answer = first + last;

        }else {
            while (!deque.isEmpty()){
                first = deque.pollFirst();
                last = deque.pollLast();
            }

            if(first != null){
                answer = first;
            } else if (last != null) {
                answer = last;
            }
        }

        return answer;
    }
}
