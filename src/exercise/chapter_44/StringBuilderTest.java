package exercise.chapter_44;

public class StringBuilderTest {
    public static void main(String[] args) {
        // +=

        String str = "";

        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 5000; i++) {
            str += "Cat";
        }
        System.out.println(str);

        long endTime = System.currentTimeMillis();

        System.out.println("걸린 시간 : " + (endTime - startTime) + "ms");

        /**
         *  17 ms : 500 기준
         *  31 ms : 5000 기준
         */

        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5000; i++) {
            sb.append("Cat");
        }

        String output = sb.toString();
        System.out.println(output);

        long endTime2 = System.currentTimeMillis();

        System.out.println("걸린 시간 : " + (endTime2 - startTime2) + "ms");
        /**
         *  0ms
         *  for문 안에 도는 숫자가 커지면 커질수록 차이가 벌어진다.
         */

    }
}
