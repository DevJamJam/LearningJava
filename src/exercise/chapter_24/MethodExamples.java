package exercise.chapter_24;

public class MethodExamples {
    /**
     *  class 밖에서는 함수를 구현할 수 없다.
     */

    public static void main(String[] args){
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode); //결과 : 65

        int myInt1 = 10;
        int myInt2 = 15;
        int result = sumAndMultiplyFour(myInt1,myInt2);
        System.out.println(result); // 결과 100

        String res = sayHello();
        System.out.println(res); // 결과 : Hello

        printHello("printHello");
        // 결과 : 함수 안에서 실행합니다. printHello
        printHi();
        // 결과 : Hi
    }


    // 일반적인 입력값, 출력값도 있는경우
    // 둘 다 하나인 경우
    static int toUnicode(char randomchar){
        return (int) randomchar;
    }

    static int sumAndMultiplyFour(int paraA,int paraB) {
        return (paraA + paraB) * 4;
    }

    // 인자값이 없을 수 있다, 출력값은 있음.
    static String sayHello() {
        return "Hello";
    }
    // 인자값이 있는데, 출력 값은 없는 것
    static void printHello(String str) {
        //리턴 값 없을때는 꼭 ... void 명시
        System.out.printf("함수 안에서 실행 합니다. %s\n",str);
    }

    // 인자값도 없고, 출력 값도 없는 거.
    static void printHi() {
        //리턴 값 없을때는 꼭 ... void 명시
        System.out.println("Hi");
    }
}
