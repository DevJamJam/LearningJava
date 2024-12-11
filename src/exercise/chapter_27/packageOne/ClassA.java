package exercise.chapter_27.packageOne;

public class ClassA {
    //Public
    public String pubStr = "pubStr";

    public void pubMethod() {}

    //Private
    private String privStr = "privStr";
    private void privMethod() {}

    void testPrivate() {
        String str = privStr;
        privMethod();
        /**
         * 자신의 안에서 적용할때는 가능 !
         */
    }

    // default
    String defStr = "defStr";
    void defMethod() {}
}
