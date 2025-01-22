package exercise.chapter_50;

public class ErrorTest {
    /*
        VM Option 추가
        -Xmx1m
    */
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행합니다.");
        System.out.println("메인 메소드 실행합니다. 2");
        /*
            Error occurred during initialization of VM
            Too small maximum heap
         */
    }
}
