package exercise.chapter_32.fish;

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

    //생성자 생성
    FishChild() {
        // 자식 클래스는 생성자를 할때 super()를 호출하게 된다
        // 보이지 않아도 자동으로 호출 !
        // ex. super(); "부모 물고기가 만들어 지고 있습니다."
        System.out.println("자식 물고기가 생성되고 있습니다.");
    }

    // full argument 생성자
    FishChild(String sexual, boolean eatable,String leavingSea){
        super(sexual,false,"2024","2024",leavingSea); // 기본 생성자를 불러오는 것
        this.eatable = eatable;
    }
}
