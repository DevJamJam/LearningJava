package exercise.chapter_36;

public class InterfaceTest {
    public static void main(String[] args) {

        // interface 필드 값 확인 해보기 실습
        System.out.println(Flyable.atmospahereLimit ); // 결과 : 486

        // Flyable
        Flyable bird = new Bird(); // 앞에 Bird or Animal로 명시 가능
        Flyable airplane = new Airplane("SC787");

        bird.fly(); // bird는 Flyable로 선언되었기 때문에 기존 Bird 에 있는 메소드는 선언 불가.
        airplane.fly();
        /**
         *  결과
         *  새가 날고 있습니다.
         *  비행기 ID(SC787)가 납니다.
         */

        // Walkable
        Walkable person = new Person();
        Walkable robot = new Robot("AP4466");

        person.walk();
        robot.walk();

        /**
         *  결과 :
         *  사람이 걷고 있습니다.
         *  로봇 ID(AP4466)가 걷습니다.
         */


    }
}
