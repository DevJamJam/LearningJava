package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopyTwo {
    public static void main(String[] args){
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr2 = new int[arr1.length];

        //for loop deep copy
        for(int i=0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
        }

        // copyOf
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        // clone : * 실무에서 가장 많이쓴다

        int[] arr4 = arr1.clone();

        arr1[0] = 125;

        System.out.println(Arrays.toString(arr1));
        // 결과 : [125, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr2));
        // 결과 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr3));
        // 결과 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr4));
        // 결과 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
