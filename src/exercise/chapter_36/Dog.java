package exercise.chapter_36;

public class Dog extends Animal {

    @Override
    public void eat(String food) {
        System.out.printf("개가 %s 을 단단한 이빨로 뜯어먹고 있습니다. \n", food);
    }

    @Override
    public void sleep() {
        System.out.println("개가 잠을 자고 있습니다.\n");
    }
}
