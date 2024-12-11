package exercise.chapter_13;

public class ExplicitCasting {
    public static void main(String[] args){
        // 더 정밀한 타입 -> 덜 정밀한 타입
        float myFloat = 5.55f;
        int myInt = (int)myFloat;
        System.out.println(myInt); // 결과 5 , 소수점은 버려지고 출력된다.

        // Size 큰 -> Size 작은
        int myInt2 = 600;
        byte myByte = (byte)myInt2;
        System.out.println(myByte);
        // 결과 88, 쌩뚱맞은 숫자가 나온다. 자료 손실됨
        // 만약 byte 범위 내 숫자인 경우에는 값이 제대로 남는다.

        // 연산  " + "
        double myDouble1 = 5.5;
        double myDouble2 = 3.7;

        int result =(int)myDouble1 + (int)myDouble2;
        System.out.println(result); // 8  : 소수점을 버린 상태 5 + 3 이므로 8
        int resultDouble = (int)(myDouble1+myDouble2);
        System.out.println(resultDouble); // 9 : 5.5+3.7 한 후 소수점을 버리므로 9

    }
}
