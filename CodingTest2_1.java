import java.util.Arrays;

public class CodingTest2_1 {

    public static void main(String[] args) {

        int[] numbers = {9,4,2,3,7,5};
        System.out.println(solution(numbers));

    }

    public static int solution(int[] numbers) {

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length - 1; i++){

            if(numbers[i] + 1 != numbers[i + 1]){
                return numbers[i] + 1;
            }
        }

        return  - 1;

    }
}
