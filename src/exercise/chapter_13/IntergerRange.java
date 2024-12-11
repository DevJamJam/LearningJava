package exercise.chapter_13;

public class IntergerRange {
    public static void main(String[] args){
        // Byte 범위 : -128 ~ 127
        // Short 범위 : -32768 ~ 32767
        int myByte = 32768; // error Cast expression to 'short'
        long myLong = -2138127842043239849L; // long 타입으로 정의 시 뒤에 L 붙여주어야 한다.
        System.out.println(myByte);
    }
}
