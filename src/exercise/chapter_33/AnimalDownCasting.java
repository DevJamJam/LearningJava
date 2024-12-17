package exercise.chapter_33;

public class AnimalDownCasting {
    public static void main(String[] args) {
        // 다운 캐스팅 확인
//        Animal animal = new Bird();
//        Bird bird = (Bird) animal;
//        문제 없음

//        Animal animal2 = new Animal();
//        Bird bird2 = (Bird) animal2;
//        타입 선언 Animal , 인스턴스화 Animal 그러므로 Bird로 다운캐스팅 불가
//        error 발생

//        Animal animal3 = new Person();
//        Bird bird3 = (Bird) animal3;
//        Person으로 인스턴스화 했으면 Person으로 다운캐스팅 할 수 있다.
//        Person으로 만들고 Bird로 다운 캐스팅 불가
//        해당 Error의 경우 런타임 에러라 IDE에서 바로 체크 되지 않으므로 주의 해야 한다.

        // 다운캐스팅 여부 확인
        Animal animal1 = new Bird();
        checkBirdAndFly(animal1);
        Animal animal2 = new Animal();
        checkBirdAndFly(animal2);
        Animal animal3 = new Person();
        checkBirdAndFly(animal3);

        /**
         *  결과 :
         *  새가 날고 있습니다.
         *  This animal is not a bird
         *  This animal is not a bird
         */
    }
    static void checkBirdAndFly(Animal animal) {
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        }
        else {
            System.out.println("This animal is not a bird");
        }
    }
    /**
     *  실제 실무에서도 업캐스팅 되어있는 것을 다운캐스팅하여
     *  그 함수의 확장된 함수를 실행시키는 경우에 위와 같이 검증 하여 사용 한다.
     */
}
