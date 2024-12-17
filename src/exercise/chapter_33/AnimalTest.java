package exercise.chapter_33;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();

        feed(animal,"빼빼로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
        /**
         *  결과 :
         *  동물이 빼빼로 을 먹습니다. Animal()의 eat
         *  새가 벌레 부리로 쪼아 먹고 있습니다. Bird()의 eat
         *  물고기가 모이 을 뻐끔뻐금하며 입으로 먹습니다. Fish()의 eat
         */
    }

    public static void feed(Animal animal,String food) {
        animal.eat(food);
    }
}
