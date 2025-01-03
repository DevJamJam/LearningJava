package exercise.chapter_31;

//Fish.java로 부터 상속받은 FishChild!
public class FishChild extends Fish {
    // 새로운 필드
    private boolean eatable;

    // 새로운 메소드
    public void digging(){
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }

    // getter & setter
    public boolean isEatable() {
        // boolean값의 getter는 is로 시작
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    // 접근제어자 변경으로 바로 접근 하는 방법
    public void becomeDanger() {
        this.havingPoison = false;
    }

    // Override 실습
    @Override
    void eat(String food){
        System.out.printf(myInfo() + "%s를 맛있게 먹고 있습니다.\n", food);
    }

}
