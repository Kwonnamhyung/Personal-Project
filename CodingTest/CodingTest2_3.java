package CodingTest;

public class CodingTest2_3 {

    static int i = 0;

    public static void main(String[] args) {
        String code = "a2{b2{c}}";
        System.out.println(solution(code));
    }


    public static String solution(String code){
        return recursive(code);
    }

    private static String recursive(String s) {

        StringBuilder sb = new StringBuilder();
        String temp = "";
        int num = 0;

        while (i != s.length()){

            if(Character.isDigit(s.charAt(i))){
                num = Character.getNumericValue(s.charAt(i));
                i++;
            } else if (s.charAt(i) == '{') {
                i++;
                temp = recursive(s);
                for(int i = 1 ; i < num; i++){
                    temp = temp + temp;
                }
                sb.append(temp);
            } else if(s.charAt(i) == '}'){
                i++;
                break;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();

    }
}
