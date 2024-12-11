package exercise;

public class Operator2 {
    public static void main(String[] args){
        // 관계 연산자 > , < , >= , <=, ==
        int num1 = 10;
        int num2 = 25;
        boolean result1 = num1 > num2;
        System.out.println(result1); //false

        String str1 = "JAM";
        String str2 = "JAM";
        boolean result2 = str1 == str2;
        System.out.println(result2); // true

        // && , || , ! 논리 연산자
        boolean condition1 = 5 > 3;
        boolean condition2 = 4 >=4;

        boolean result3 = condition1 && condition2;
        System.out.println(result3);

    }
}
