package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionArray1 {
    public static void main(String[] args){
        // 2d array
        int[][] arr1 = new int[3][5];
        //3개의 row, 5개의 column

        // 2d array
        int[][] arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        // 2d array를 출력할 때는 deepToString
        System.out.println(Arrays.deepToString(arr1));
        // 결과 : [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
        System.out.println(Arrays.deepToString(arr2));
        // 결과 : [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]

        // indexing
        int myInt = arr2[0][2];
        int myInt2 = arr2[1][3];

        System.out.println(myInt); // 결과 : 3
        System.out.println(myInt2); // 결과 : 8

        // indexing update
        arr2[2][2] = 20;
        System.out.println(Arrays.deepToString(arr2));
        // 결과 : [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 20, 12]]

        // for loop
        for(int row=0; row < 3; row++) {
            for(int col=0; col <4; col++) {
                System.out.printf("%d ",arr2[row][col]);
            }
            System.out.println();
        }
        /**
         * 결과 :
         * 1 2 3 4
         * 5 6 7 8
         * 9 10 20 12
         */
    }
}
