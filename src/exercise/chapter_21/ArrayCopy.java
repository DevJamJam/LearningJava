package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        // 변수 복사
        int a = 5;
        int b = a;

        b += 5;

        System.out.println(a); // 5
        System.out.println(b); // 10

        // array 복사
        int[] arr1 = { 1, 2, 3, 4};
        int[] arr2 = arr1;

        arr1[1] = 25;

        System.out.println(Arrays.toString(arr1));
        // 결과 : [1, 25, 3, 4]
        System.out.println(Arrays.toString(arr2));
        // 결과 : [1, 25, 3, 4] .... ? 왜 ?

    }
}
