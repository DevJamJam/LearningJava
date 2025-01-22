package exercise.chapter_50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드가 시작 됩니다.");
        makeCheckException();
        System.out.println("메인 메소드가 종료 됩니다.");
    }
    public static void makeUncheckException() {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int index = 10;

        System.out.println("값 : " + intArr[index]);
        /*
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
	        at exercise.chapter_50.ExceptionTest.makeUncheckException(ExceptionTest.java:13)
	        at exercise.chapter_50.ExceptionTest.main(ExceptionTest.java:6)
        */
    }

    public static void makeCheckException() throws FileNotFoundException {
        File file = new File("src/exercise/chapter_50/test.txt");
        FileInputStream fs = new FileInputStream(file);
        System.out.println("FS 실행 됩니다.");
    }


}
