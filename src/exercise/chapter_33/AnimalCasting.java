package exercise.chapter_33;

public class AnimalCasting {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal(), new Person(), new Person(), new Fish(), new Bird(),
                new Bird(), new Person(), new Fish(), new Animal(), new Bird()
        };

        sleepTogether(animals);

        System.out.println("------------------------------------------------------");

        doSomethingSeparately(animals);

        /**
         *  결과 :
         *  동물이 잠을 자고 있습니다.
         *
         *  사람이 침대에 누워서 잡니다.
         *
         *  사람이 침대에 누워서 잡니다.
         *
         *  물고기가 잠을 자고 있습니다.
         *
         *  새가 잠을 자고 있습니다.
         *
         *  새가 잠을 자고 있습니다.
         *
         *  사람이 침대에 누워서 잡니다.
         *
         *  물고기가 잠을 자고 있습니다.
         *
         *  동물이 잠을 자고 있습니다.
         *
         *  새가 잠을 자고 있습니다.
         *
         *  ------------------------------------------------------
         *  동물 클래스이거나, 지원하지 않는 객체입니다.
         *
         *  사람이 걷고 있습니다.
         *
         *  사람이 걷고 있습니다.
         *
         *  물고기가 신나게 헤엄을 치고 있습니다.
         *
         *  새가 날고 있습니다.
         *
         *  새가 날고 있습니다.
         *
         *  사람이 걷고 있습니다.
         *
         *  물고기가 신나게 헤엄을 치고 있습니다.
         *
         *  동물 클래스이거나, 지원하지 않는 객체입니다.
         *
         *  새가 날고 있습니다.
         */
    }
    static void sleepTogether(Animal[] animals) {
        for(Animal animal : animals) {
            // for loop에서 array는 위와 같이 사용 가능 하다
            // 각 각 한개씩 꺼내서 실행 가능
            animal.sleep();
        }
    }
    static void doSomethingSeparately(Animal[] animals) {
        for(Animal animal : animals) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            } else if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                fish.swim();
            } else if (animal instanceof Person) {
                Person person = (Person) animal;
                person.walk();
            } else {
                System.out.println("동물 클래스이거나, 지원하지 않는 객체입니다.\n");
            }
        }
    }
}
