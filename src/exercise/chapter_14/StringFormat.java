package exercise.chapter_14;

public class StringFormat {
    public static void main(String[] args){
        //String 생성방식
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        System.out.println(str1); // Happy
        System.out.println(str2); // 123

        // String 1
        String result;

        result = String.format("문자 서식: %s, %S", str1, str1);
        System.out.println(result); // 문자 서식: Happy, HAPPY

        // Int
        int myInt = 10;
        result = String.format("정수 서식: %d",myInt);
        System.out.println(result); // 정수 서식: 10 , %05d 다섯자리 숫자를 해줘 라는 뜻으로 출력값은 00010이 나온다.

        // Float
        float myFloat = 10.250915f;
        result = String.format("실수 서식: %f, %.1f, %.2f, %.3f",myFloat,myFloat,myFloat,myFloat);
        System.out.println(result); // 실수 서식: 10.250915, 10.3, 10.25, 10.251
        // 반올림해서 1번째 자리 숫자 까지 , 2번째 자리 숫자 까지, 3번째 짜리 숫자까지 출력
    }
}
