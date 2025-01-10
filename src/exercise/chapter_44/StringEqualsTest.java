package exercise.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args) {
        String str1 = "Cat"; // Constant Pool
        String str2 = "Cat"; // Constant Pool

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("Cat"); // Heap에 생성
        String str4 = new String("Cat"); // Heap에 생성

        System.out.println(str3.equals(str4)); // true
        System.out.println(str3 == str4); // false

        // str1 , str3
        System.out.println(str3.equals(str1)); // true
        System.out.println(str3 == str1); // false

        /**
         *
         *  "==" 항상 두 변수의 메모리 주소값 비교
         *  equals 기본은 "=="과 같지만, 하위 class에서 재 정의 가능하다.
         *  String 비교시엔 equals 사용 권장
         */

    }
}
