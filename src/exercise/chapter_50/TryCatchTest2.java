package exercise.chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행 합니다.");
        List<String> strList = new ArrayList<String>();

        strList.add("Hello");
        strList.add("World");
        strList.add("I");
        strList.add("like");
        strList.add(null);
        strList.add("Coding");
        strList.add("Java");

        for (int i = 0; i < strList.size() + 5 ; i++) {
            try {
                System.out.println("i : " + i);
                String str = strList.get(i);
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                //  null 값이 들어가게 되면 하단의 에러 메세지 발생하므로 예외처리
                //  Exception in thread "main" java.lang.NullPointerException
                //	at exercise.chapter_50.TryCatchTest2.main(TryCatchTest2.java:21)
                System.out.println("null 은 들어갈 수 없습니다.");
            } catch (IndexOutOfBoundsException e) {
                // strList.size() + 5 라고 하게 되면 error 발생
                //  Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7
                //	 at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                //	 at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                //	 at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                //	 at java.base/java.util.Objects.checkIndex(Objects.java:372)
                //	 at java.base/java.util.ArrayList.get(ArrayList.java:458)
                //	 at exercise.chapter_50.TryCatchTest2.main(TryCatchTest2.java:21)
                System.out.println("Index는 Array Bound를 넘어갈 수 없습니다.");
                break;
            }
        }
        /**
         *  try catch 이전
         *  메인 메소드 실행 합니다.
         *  HELLO
         *  WORLD
         *  I
         *  LIKE
         *  CODING
         *  JAVA
         *  메인 메소드 종료 합니다.
         */
        /**
         *  try catch null 포인트 체크 결과
         *  메인 메소드 실행 합니다.
         *  HELLO
         *  WORLD
         *  I
         *  LIKE
         *  null 은 들어갈 수 없습니다.
         *  CODING
         *  JAVA
         *  메인 메소드 종료 합니다.
         */
        /**
         *  try catch index 체크 결과
         *  메인 메소드 실행 합니다.
         *  i : 0
         *  HELLO
         *  i : 1
         *  WORLD
         *  i : 2
         *  I
         *  i : 3
         *  LIKE
         *  i : 4
         *  null 은 들어갈 수 없습니다.
         *  i : 5
         *  CODING
         *  i : 6
         *  JAVA
         *  i : 7
         *  Index는 Array Bound를 넘어갈 수 없습니다.
         *  메인 메소드 종료 합니다.
         */

        System.out.println("메인 메소드 종료 합니다.");

    }
}
