package exercise.chapter_51;

public class TryCatchFinallyTest {
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행");

        try {
            Integer myInt = 14;
            Integer data = 100 / myInt;

            if (myInt == 14 ) return;
            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("myInt는 0이 될 수 없습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("여기는 무조건 실행되는 Finally 영역");
        }

        System.out.println("메인 메소드 종료");
        /**
         *  myInt  = 10 일 때
         *  메인 메소드 실행
         *  data: 10
         *  여기는 무조건 실행되는 Finally 영역
         *  메인 메소드 종료
         *
         *  myInt = null 일 때
         *  메인 메소드 실행
         *  여기는 무조건 실행되는 Finally 영역
         *  Exception in thread "main" java.lang.NullPointerException
         * 	    at exercise.chapter_51.TryCatchFinallyTest.main(TryCatchFinallyTest.java:9)
         *
         * 	myInt = 0 일 때
         * 	메인 메소드 실행
         *  myInt는 0이 될 수 없습니다.
         *  여기는 무조건 실행되는 Finally 영역
         *  메인 메소드 종료
         *  java.lang.ArithmeticException: / by zero
         * 	    at exercise.chapter_51.TryCatchFinallyTest.main(TryCatchFinallyTest.java:9)
         *
         * 	if (myInt == 14) return 구문 추가시 결과
         * 	메인 메소드 실행
         *  여기는 무조건 실행되는 Finally 영역
         */

    }
}
