package exercise.chapter_13;

public class ImplicitCasting2 {
    public static void main(String[] args){
        // + , * 사칙연산 Casting
        int myInt = 10;
        double myDouble = 55.1;
        double result1 = myInt + myDouble;
        System.out.println(result1); // 65.1

        int myInt2 = 10;
        long myLong = 20L;
        long result2 = myInt2 * myLong;
        System.out.println(result2); //200

        // "/" 나누기
        int num1 = 10;
        int num2 = 2;

        int result3 = num1 / num2;
        System.out.println(result3); // 5
        /**
         * 만약 num2가 3이면 결과값은 3이 나온다.
         * why? 정수형 이기 때문에 정수형의 값이 출력 되고 소수점 자리는 버려진다.
         * 그럼 소수점까지 보고 싶으면 어떻게 해야하나?
         * num2 를 float 타입으로 변환 하고 result3도 float타입으로 변환 해주어야 한다.
         * float num2 = 3.0f;
         * float result3 = number1/number2;
         */
    }
}
