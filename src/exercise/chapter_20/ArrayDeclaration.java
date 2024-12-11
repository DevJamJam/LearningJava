package exercise.chapter_20;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args){
        // int[]
        int[] intArr1 = new int[10];
        int[] intArr2 = new int[]{1,2,3,4,5};
        int[] intArr3 = {1,2,3,4,5};
        // intArr2 축약 ver

        System.out.println(intArr1);
        // 결과: [I@3ac3fd8b , 메모리값이 나온다..
        System.out.println(Arrays.toString(intArr1));
        // 결과 : [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], int 기본 값인 0이 10개
        System.out.println(Arrays.toString(intArr2));
        // 결과 : [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(intArr3));
        // 결과 : [1, 2, 3, 4, 5]

        // float[]
        float[] floatArr1 = new float[10];
        float[] floatArr2 = {1.5f, 2.5f, 3.5f};

        System.out.println(Arrays.toString(floatArr1));
        // 결과 : [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        // 기본값인 0.0 이 10개
        System.out.println(Arrays.toString(floatArr2));
        // 결과 : [1.5, 2.5, 3.5]

        // boolean[]
        boolean[] booleans1 = new boolean[5];
        boolean[] booleans2 = { true, false, true};

        System.out.println(Arrays.toString(booleans1));
        // 결과 : [false, false, false, false, false]
        // boolean의 기본값은 false / 0 = false
        System.out.println(Arrays.toString(booleans2));
        // 결과 : [true, false, true]

        // char String[]
        char[] charArr1 = new char[10];
        char[] charArr2 = {'A', 'B', 'C'};
        String[] stringArr1 = new String[10];
        String[] stringArr2 = {"Hello", "Mr.", "My", "Yesterday"};

        System.out.println(Arrays.toString(charArr1));
        // 결과 : 아스키코드 0  에 해당하는 기본값이 10개
        System.out.println(Arrays.toString(charArr2));
        // 결과 : [A, B, C]
        System.out.println(Arrays.toString(stringArr1));
        // 결과 : [null, null, null, null, null, null, null, null, null, null]
        // 레퍼런스 타입은 기본값이 null
        System.out.println(Arrays.toString(stringArr2));
        // 결과 : [Hello, Mr., My, Yesterday]

    }
}
