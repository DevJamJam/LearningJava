package exercise.chapter_32.fish;

//Fish.java로 부터 상속받은 FishChild!
public class FishChild extends Fish {
    // 새로운 필드
    private boolean eatable;
    // 쉐도잉 실습을 위한 코드
    protected String leavingSea;
    // 하지만 대부분의 현업에서는 부모 class의 필드명을 같게 작성하지 않는다
    protected  String leavingSeaChild;
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

    @Override
    String myInfo() {
        //부모 class의 myInfo()를 하고 그 뒤에 자식 물고기의 값을 추가로 넣겠다!
        return super.myInfo() + "는 부모물고기,\n" + String.format("자식 물고기(eatable=%b, leavingSea=%s)", this.eatable, this.leavingSea);
    }
    void printSea() {
        System.out.println(myInfo()+ "는 " + this.leavingSeaChild + " 바다 출신이고, " +
        "부모 물고기는 " + super.leavingSea + "바다 출신이야.");
    }

    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }

    // 생성자 생성
    FishChild() {
        // 자식 클래스는 생성자를 할때 super()를 호출하게 된다
        // 보이지 않아도 자동으로 호출 !
        // ex. super(); "부모 물고기가 만들어 지고 있습니다."
        System.out.println("자식 물고기가 생성되고 있습니다.");
    }

    // 쉐도잉 실습을 위한 추가 생성자


    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        this.leavingSea = leavingSea;
        // super.leavingSea 로 변경하면 정상으로 출력될 수 있다
    }

    // full argument 생성자
    FishChild(String sexual, boolean eatable,String leavingSea){
        super(sexual,false,"2024","2024",leavingSea); // 기본 생성자를 불러오는 것
        this.eatable = eatable;
    }
}
