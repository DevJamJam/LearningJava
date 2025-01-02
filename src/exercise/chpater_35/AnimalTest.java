package exercise.chpater_35;

public class AnimalTest {
    public static void main(String[] args) {
    //    Animal animal = new Animal(); 추상 class 인스턴스화 X
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Dog();

   //     feed(animal,"빼빼로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "초밥");
        feed(animal5, "개껌");
        /**
         *  결과 :
         *  새가 벌레 부리로 쪼아 먹고 있습니다.
         *  물고기가 모이 을 뻐끔뻐금하며 입으로 먹습니다.
         *  사람이 초밥 을 젓가락으로 먹습니다.
         *  개가 개껌 을 단단한 이빨로 뜯어먹고 있습니다.
         */
    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
