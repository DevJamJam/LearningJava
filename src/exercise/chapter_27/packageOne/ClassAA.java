package exercise.chapter_27.packageOne;

public class ClassAA {
    void testPublic(ClassA classA) {
        String str = classA.pubStr;
        classA.pubMethod();
        /**
         * 같은 패밀리인 classAA에서는 classA의
         * pubStr과 pubMethod()에 접근이 가능하다.
         */
    }
//    void testPrivate(ClassA classA) {
//        String str = classA.privStr;
//        classA.privMethod();
//        /**
//         * private 는 빨간 줄 뜨면서 안된다.
//         */
//    }
//    public void testDefault(ClassA classA) {
//        String str = classA.defStr;
//        classA.defMethod();
//        /**
//         * 같은 package 내에서는 접근 가능
//         */
//    }
}
