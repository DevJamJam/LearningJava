package exercise.chapter_19;

public class StarTriangle {
    public static void main(String[] args){
        int row;
        int column;

        for (row =1; row <=9; row++) {
            // 1번째 반복 : row : 1
            // 2번째 반복 : row : 2 ... 최종 row:9
            for(column= 1; column <= row; column++){
                System.out.print('*');
                // 1번째 row = 1, 별표 1개 *
                // 2번째 row = 2, 별표 2개 ** ... 최종 별표 9개
            }
            System.out.println(); //for문 빠져나올때 마다 한칸씩 줄바꿈
        }
    }
}
