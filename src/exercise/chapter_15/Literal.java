package exercise.chapter_15;

public class Literal {
    public static void main(String[] args){
        int num = 0b1010; //2진법
        System.out.println(num); // 10

        int num2 = 0xAC0; //16진법
        System.out.println(num2); // 12 * 16 + 10 * 16^2 = 2752

        double myDouble = 5.22E5;
        System.out.println(myDouble); //522000.0

        double myDouble2 = 2.55E-3;
        System.out.println(myDouble2); // 0.00255

        //null
        String str = null;
        // int myInt = null;  error 발생 레퍼런스 타입에서만 가능
        System.out.println(str); // null
    }
}
