package exercise.chapter_36;

public class Person extends Animal implements Walkable{
    // 속성
    private String name;
    private String job;
    private int height;

    // 행위

    @Override
    public void eat(String food) {
        System.out.printf("사람이 %s 을 젓가락으로 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("사람이 침대에 누워서 잡니다.\n");
    }

    public void walk() {
        System.out.println("사람이 걷고 있습니다.");
    }

    public String getName() {
        return name;
    }
}
