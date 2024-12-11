package exercise.chapter_14;

public class Encoding {
    public static void main(String[] args){
        // 'Z' -> int
        char ch1 = 'Z';
        System.out.println(ch1); // Z
        System.out.println((int)ch1); // 90

        // Int -> char
        // 참고 : 65 ~ 90 : A ~ Z , 96 ~ 122 : a ~ z
        int num = 68;
        System.out.println(num); // 68
        System.out.println((char)num); // D

        // 크고, 작음 비교
        char smallA = 'a';
        char largeA = 'A';
        boolean result = smallA > largeA;

        System.out.println(result); // 96 > 65 true

        //
        char hangul = '\uAC00';
        System.out.println(hangul); // 가

        //특수 "\t", "\n" , "\"
        char special1 = '\t'; // 탭
        char special2 = '\n'; // 줄바꿈
        char special3 = '\'';

        System.out.println(special3); // 특수문자로 인식 ' 출력
    }
}
