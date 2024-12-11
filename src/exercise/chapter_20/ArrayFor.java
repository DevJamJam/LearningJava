package exercise.chapter_20;

public class ArrayFor {
    public static void main(String[] args){
        // for loop Array
        int[] birthNumber = {10,25,9,15,11,6};
        // for loop
        for(int i=0; i < birthNumber.length; i++) {
            // length => Array 길이
            System.out.printf("이 Array의 %d의 인덱스의 값은 %d이다.\n",i,birthNumber[i]);
            /**
             * 결과 :
             * 이 Array의 0의 인덱스의 값은 10이다.
             * 이 Array의 1의 인덱스의 값은 25이다.
             * 이 Array의 2의 인덱스의 값은 9이다.
             * 이 Array의 3의 인덱스의 값은 15이다.
             * 이 Array의 4의 인덱스의 값은 11이다.
             * 이 Array의 5의 인덱스의 값은 6이다.
             */
        }
        // 강화된 for loop
        for(int bNumber: birthNumber) {
            System.out.printf("birthNumber의 값은 %d 이다.\n",bNumber);
            /**
             * 결과 :
             * birthNumber의 값은 10 이다.
             * birthNumber의 값은 25 이다.
             * birthNumber의 값은 9 이다.
             * birthNumber의 값은 15 이다.
             * birthNumber의 값은 11 이다.
             * birthNumber의 값은 6 이다.
             */
        }
    }
}
