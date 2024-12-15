package exercise.chapter_31;

public class Fish {
    // 속성 : 정보 은닉화 해두기
    private String sexual; // "Male", "Female"
    //상속 실습을 위한 protected로 변경
    protected boolean havingPoison; // true : 독이 있다, false : 독이 없다.
    private String StartSpawningDate; // 산란 시작 시기
    private String endSpawningDate; // 산란 종료
    String leavingSea; // 사는 곳

    // 행위
    void eat(String food) {
        System.out.printf(myInfo() + "%s를 먹고 있습니다.\n", food);
    }

    void swim(int meter) {
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }

    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리 짓습니다.");
    }
    void sleep() {}

    // 매번 문자열 포맷 및 출력하기엔 번잡스러우므로 , 미리 코드로 생성해둔다!
    String myInfo() {
        return String.format("물고기(sexual=%s, havingPoison=%b,leavingSea=%s)\n",
                this.sexual, this.havingPoison, this.leavingSea);
    }
    void printMyInfo() {
        System.out.println(myInfo());
    }

    // 정보은닉화 이후 접근히가 위한 setter
    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    // 값을 가져오기 위한 getter

    public boolean isHavingPoison() {
        return havingPoison;
    }
}
