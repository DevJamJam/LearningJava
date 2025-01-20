package exercise.chapter_45;

public class WrapperClassTest {
    public static void main(String[] args) {
        // Integer Type
        Integer i = new Integer(25); // int -> Integer boxing
        Integer i2 = new Integer(10); // 해당 new Integer 방식은 요즘은 잘 사용하지 않는다.

        int int1 = i.intValue(); // Unboxing , Integer -> int 바꾼 것

        Integer i3 = 20; // AutoBoxing, new Integer(20);
        int int2 = i3; // AutoUnboxing

        Integer i4 = null;
        System.out.println(i4); // null 해당 Integer Type null값을 넣을 수 있다.
        System.out.println(i); // 25
        System.out.println(int1); // 25
        System.out.println(int2); // 20
        System.out.println(i3); // 20

        // 연산자
        System.out.println(int1 + i2); // 35
        System.out.println(i + i3); // 45

        // Character Type
        Character character = new Character('a'); // 'a' charType -> Character 박싱
        char ch1 = character.charValue(); // Character -> char 언박싱

        Character character2 = 'x'; // AutoUnboxing
        char ch2 = character2; // AutoUnboxing

        System.out.println(ch1); // a
        System.out.println(character); // a

        System.out.println(ch2); // x
        System.out.println(character2); // x

        Character[] characters = {'a', 'b', 'c'};
        String str = String.valueOf(characters);

        char[] chars = {'a', 'b', 'c'};
        String str2 = String.valueOf(chars);

        System.out.println(str); // [Ljava.lang.Character;@5594a1b5
        System.out.println(str2); // abc
        /**
         *  Why?
         *  Character Type은 array 형태로 wrapper 하게 되면 오류 발생
         *  함정 카드 발동...
         */

        // Boolean Type
        Boolean bool = new Boolean(true);
        boolean b1 = bool.booleanValue(); // UnBoxing

        Boolean bool2 = true;
        boolean b2 = bool2;

        Boolean bool3 = false;

        System.out.println(b1); // true
        System.out.println(b2); // true
        System.out.println(bool & bool2); // true
        System.out.println(bool & bool3); // false
        System.out.println(bool | bool3); // true

    }
}
