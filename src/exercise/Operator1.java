package exercise;

public class Operator1 {
    public static void main(String[] args){
        //대입 연산자
        int sample = 10; //sample변수에 10대입
        int sample2 = sample; //sample2에 sample대입
        int sample3 = sample2; // sample3에 sample2대입
        System.out.println(sample3); //결과 10

        // + , - 부호 연산자
        int positive25 = 25; //+생략 가능, default 값이 +
        int negative25 = -25;
        System.out.println(positive25); //결과 25
        System.out.println(negative25); //결과 -25

        // + , - , * , / , % 산술 연산자
        int num1 = 10;
        int num2 = 5;
        int resultSum = num1 + num2;
        int resultMinus = num1 - num2;
        int resultMultipli = num1 * num2;
        int resultDivision = num1 / num2;
        int resultRemainder = num1 % num2;

        System.out.println(resultSum); // 15
        System.out.println(resultMinus); // 5
        System.out.println(resultMultipli); // 50
        System.out.println(resultDivision); // 2
        System.out.println(resultRemainder); // 0

    }
}
