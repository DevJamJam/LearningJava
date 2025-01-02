package exercise.chapter_35;

public class Dog extends Animal{
    // 추상화 된 class를 사용해 보기위해 만든 class
    // 추상화 된 class를 사용하려면 그 안에 들어있는 메소드도 의무적으로 구현해야 한다.
    @Override
    public void eat(String food) {
        System.out.printf("개가 %s 을 단단한 이빨로 뜯어먹고 있습니다. \n", food);
    }

    @Override
    public void sleep() {
        System.out.println("개가 잠을 자고 있습니다.\n");
    }
}
