package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt");
            int i = 10;
            int data = 100 / i;

            String str = "abcdefg";
            System.out.println(str.toUpperCase());

            int index = 15;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);
            /**
             *  index = 15 시
             *  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 10
             * 	    at exercise.chapter_51.TryMultiCatchTest.main(TryMultiCatchTest.java:18)
             */

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
            /**
             *  경로 잘못 지정시 발생
             *  파일을 찾을 수 없습니다.
             *  java.io.FileNotFoundException: sr\exercise\chapter_51\test.txt (지정된 경로를 찾을 수 없습니다)
             * 	    at java.base/java.io.FileInputStream.open0(Native Method)
             * 	    at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
             * 	    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
             * 	    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
             * 	    at exercise.chapter_51.TryMultiCatchTest.main(TryMultiCatchTest.java:9)
             */
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("ArithmeticException 혹은 NullPointerException 발생");
            e.printStackTrace();
            /**
             *  i = 0 일때
             *  ArithmeticException 혹은 NullPointerException 발생
             *  java.lang.ArithmeticException: / by zero
             * 	    at exercise.chapter_51.TryMultiCatchTest.main(TryMultiCatchTest.java:11)
             * 	str = null 일 때
             *  ArithmeticException 혹은 NullPointerException 발생
             *  java.lang.NullPointerException
             * 	    at exercise.chapter_51.TryMultiCatchTest.main(TryMultiCatchTest.java:14)
             */
        } catch (Exception e) {
            // 상위 클래스Exception으로 나머지 예외의 경우 처리
            System.out.println("최종 Exception 필터에 걸렸습니다. ");
            e.printStackTrace();
            /**
             *  결과 :
             *  ABCDEFG
             *  최종 Exception에 걸렸습니다.
             *  메인 메소드 종료
             *  java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 10
             * 	    at exercise.chapter_51.TryMultiCatchTest.main(TryMultiCatchTest.java:18)
             *
             * 	해당 catch 문을 제일 앞에 둘 경우 뒤의 catch문은 의미가 없다.
             */

        }
//        catch (ArithmeticException e) {
//            System.out.println("ArithmeticException 발생");
//            e.printStackTrace();
//            /**
//             *  i = 0 일때 발생
//             *  ArithmeticException 발생
//             *  java.lang.ArithmeticException: / by zero
//             * 	    at exercise.chapter_51.TryMultiCatchTest.main(TryMultiCatchTest.java:11)
//             */
//        } catch (NullPointerException e) {
//            System.out.println("nullPointerException 발생");
//            e.printStackTrace();
//            /**
//             *  str = null 일때 발생
//             *  nullPointerException 발생
//             *  java.lang.NullPointerException
//             * 	    at exercise.chapter_51.TryMultiCatchTest.main(TryMultiCatchTest.java:14)
//             */
//        }
        System.out.println("메인 메소드 종료");
    }
}
