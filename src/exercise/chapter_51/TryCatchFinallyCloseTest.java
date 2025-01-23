package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("메인 메소드 실행");

        try (FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt")){
            /**
             *  try - with - resources 문
             *  try (파일을 열거나 자원을 할당하는 명령문) {}
             *  괄호() 안에 객체를 생성하는 문장을 넣으면, 따로 close() 를 호출하지 않아도 try 블럭을 벗어나는 순간 자동적으로 close() 가 호출
             *  그리고 다음에 catch 블럭 또는 finally 블럭이 수행 된다.
             *  괄호 안에 IO객체 문장을 두개 이상 넣어줄수도 있다 이때는 세미콜론으로 각 문장을 구분해줘야한다!
             *  파일을 열고 모두 사용되면 자동으로 닫아준다
             *
             *  어떠한 클래스가 try - with - resources 문으로 사용될 수 있기 위해서는 AutoCloseable 인터페이스를 구현 받아야 한다.
             *  AutoCloseable을 가지고 있다면 try-with-resource 문법을 사용할 수 있는 것
             */
            int i;
            while ((i=fs.read()) != -1) {
                System.out.write(i);
            }
            int myInt = 0;
            int data = 100 / myInt;
        } catch(FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 생겼습니다.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다.");
            e.printStackTrace();
        }
        System.out.println("메인 메소드 종료");
        while (true) { // Finally 적용 전/후 close 되었는지 확인 하기 위한 코드
            Thread.sleep(1000);
        }
        /**
         *  메인 메소드 실행
         *  자바 예외처리 실습을 위한 txt 파일
         *  Hello
         *  Java
         *  World
         *  I
         *  Like
         *  Coding
         *  메인 메소드 종료
         *
         *  myInt = 0 일 때
         *  메인 메소드 실행
         *  자바 예외처리 실습을 위한 txt 파일
         *  Hello
         *  Java
         *  World
         *  I
         *  Like
         *  Coding
         *  0으로는 나눌 수 없습니다.
         *  메인 메소드 종료
         *  java.lang.ArithmeticException: / by zero
         * 	    at exercise.chapter_51.TryCatchFinallyCloseTest.main(TryCatchFinallyCloseTest.java:17)
         */
    }
}

