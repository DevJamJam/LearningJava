package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionAdd {
    public static void main(String[] args){
        // 두개의 array 더하기

        int[][] arr1 = {
                {12, 100, 25, 33},
                {70, 23, 401, 110},
                {40, 65, 340, 81}
         };
        int[][] arr2 = {
                {15, 20, 25, 30},
                {20, 30, 40, 50},
                {60, 65, 70, 80}
        };
        int[][] resultArr = new int[3][4];
        //3개의 row 4개의 column

        for(int row = 0; row < 3; row++) {
            for(int col =0; col <4; col++){
                resultArr[row][col] = arr1[row][col] + arr2[row][col];
            }
        }
        System.out.println(Arrays.deepToString(resultArr));
        //결과 : [[27, 120, 50, 63], [90, 53, 441, 160], [100, 130, 410, 161]]

    }
}
