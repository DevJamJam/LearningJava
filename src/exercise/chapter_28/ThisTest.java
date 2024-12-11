package exercise.chapter_28;

public class ThisTest {
    public static void main(String[] args) {

        Person person1 = new Person("JIN");
        Person person2 = new Person("VERMOUTH", "Female");
        Person person3 = new Person("VERVON", "Male", 25);

        person1.showMyself();
        person2.showMyself();
        person3.showMyself();

        /**
         * Person 인스턴스: name: JIN, gender: unknown, age: -1
         * Person 인스턴스: name: VERMOUTH, gender: Female, age: -1
         * Person 인스턴스: name: VERVON, gender: Male, age: 25
         */

        // this 주소 값 실습
        Person returnPerson1 = person1.returnMyself();
        Person returnPerson2 = person2.returnMyself();

        System.out.println(returnPerson1);
        System.out.println(returnPerson2);

        /**
         * exercise.chapter_28.Person@12843fce
         * exercise.chapter_28.Person@3dd3bcd
         */
    }
}
