package exercise.chapter_15;

public class SymbolicConstant {
    public static void main(String[] args){
        final int MY_INT = 5; //상수 선언과 동시에 값 할당
       // MY_INT = 10; error 발생 상수!

        final double MY_DOUBLE; //초기화만 해둔 상태
        MY_DOUBLE = 5.25; // 값 할당

        //MY_DOUBLE = 5.20; error 발생
        //값을 한번 정의하고 나면 바꿀 수 없다.
    }
}
