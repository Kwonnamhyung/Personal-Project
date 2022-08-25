package CodingTest;

public class CodingTest7_1 {

    public static String temp = "";

    public static void main(String[] args) {

        int[][] img = {{0, 0, 0, 0, 1, 1, 1, 1},
                       {0, 0, 0, 0, 1, 1, 0, 0},
                       {0, 0, 0, 0, 0, 0, 1, 1},
                       {0, 0, 0, 0, 0, 0, 1, 1},
                       {1, 1, 0, 0, 0, 0, 0, 0},
                       {1, 0, 0, 0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0, 0, 0, 1}};

        System.out.println(solution(img));

    }

    public static String solution(int[][] img) {

        int size = img.length;

        quad(0,0,size,img);

        return temp;
    }

    public static void quad(int start_X,int start_Y,int size , int[][] img){

        if(checkQuad(start_X,start_Y,size,img)){
            if(img[start_X][start_Y] == 1){
                temp += "1";
            }else {
                temp += "0";
            }

            return;
        }

        temp += "(";

        quad(start_X,start_Y,size /2 ,img);
        quad(start_X, start_Y + size / 2,size / 2,img);
        quad(start_X + size / 2,start_Y,size / 2,img);
        quad(start_X + size /2 , start_Y + size/ 2,size /2 ,img);

        temp += ")";

    }

    private static boolean checkQuad(int start_x, int start_y, int size, int[][] img) {

        for(int i = start_x; i< start_x + size; i++){
            for(int k = start_y; k < start_y + size; k++){

                if(img[start_x][start_y] != img[i][k]){
                    return false;
                }
            }
        }
        return true;
    }


}

