package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertPerformanceTest {
    static final int SIZE = 1000000;
    public static void main(String[] args) {

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
            if (i % 5 == 0) integerList1.remove(0);
        }
        endTime = System.currentTimeMillis();


        System.out.println("ArrayList Insert/Delete time: " + (endTime - startTime) + "ms");

        // List LinkedList 구현
        startTime = System.currentTimeMillis();
        List<Integer> integerList2 = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList2.add(i);
            if (i % 5 == 0) integerList2.remove(0);
        }
        endTime = System.currentTimeMillis();

        System.out.println("LinkedList Insert/Delete time: " + (endTime - startTime) + "ms");
        /**
         *  ArrayList Insert/Delete time: 7961ms
         *  LinkedList Insert/Delete time: 170ms
         *  데이터가 많이 나가고 많이 들어오는 경우엔 ArrayList가 시간이 더 많이 소요된다.
         */
    }
}
