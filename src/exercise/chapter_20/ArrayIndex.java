package exercise.chapter_20;

import java.util.Arrays;

public class ArrayIndex {
    public static void main(String[] args){
        // index get
        int[] animalBirth = {915,1106};
        int hada = animalBirth[0];
        System.out.println(hada); // 결과 : 915

        // index modify
        animalBirth[1] = 1102;
        System.out.println(Arrays.toString(animalBirth));
        // 결과 : [915, 1102]

        //index error
        int errorIndex = animalBirth[3];
        System.out.println(errorIndex);
        // 결과 : Index 3 out of bounds for length 2
        // 음수도 X , 인덱스는 0 부터 시작
    }
}
