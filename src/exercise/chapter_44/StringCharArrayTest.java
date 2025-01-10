package exercise.chapter_44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        // CharArray -> String
        char[] chars = {'a','b','c'};

        // String으로 바꾸는 2가지 방법
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1); // abc
        System.out.println(str2); // abc

        // String -> CharArray
        char[] chars1 = str1.toCharArray();
        for (char c : chars1) {
            System.out.println(c);
        }
        /**
         *  결과 :
         *  a
         *  b
         *  c
         */


        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        /**
         *  결과 :
         *  a
         *  b
         *  c
         */

    }
}
