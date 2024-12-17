package exercise.chapter_33;

public class Animal {
    // public과 class 사이에 final 작성 시 상속 불가하여 error 발생한다.
    // 속성
    protected String gender;

    // 행위
    // public과 void사이에 final 작성 시 can not override  error 발생
    public void eat(String food) {
        System.out.printf("동물이 %s 을 먹습니다.\n", food);
    }

    public void sleep() {
        System.out.println("동물이 잠을 자고 있습니다.\n");
    }
}
