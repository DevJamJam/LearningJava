package exercise.chapter_50;

public class TryCatchTest1 {
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행 합니다.");
        // 하단의 구문 이후 중요한 구문이 있을때 만약 try catch문을 안쓰게 되면
        // 해당 구문에서 오류가 난 이후 다음 구문이 실행되지 않기 때문에 try catch문을 사용한다.
        try {
            //int i = 0;
            int i = 10;
            int data = 50 / i;
            System.out.println("data : "+data);
        } catch (ArithmeticException e) {
            System.out.println("0 으로는 나눌수가 없습니다.");
            System.out.println("data : "+ 0);
            e.printStackTrace();
            /*
                java.lang.ArithmeticException: / by zero
	            at exercise.chapter_50.TryCatchTest1.main(TryCatchTest1.java:10)
             */
        }
        System.out.println("메인 메소드 종료 합니다.");
        /**
         *  메인 메소드 실행 합니다.
         *  0 으로는 나눌수가 없습니다.
         *  data : 0
         *  메인 메소드 종료 합니다.
         */

        /*
            int i = 5 일때 결과
            메인 메소드 실행 합니다.
            data : 5
            메인 메소드 종료 합니다.
         */
    }
}
