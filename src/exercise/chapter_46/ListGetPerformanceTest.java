package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {
    static final int SIZE = 100000;
    public static void main(String[] args) {
        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
        }

        // List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList2.add(i);
        }

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            integerList1.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by list 1: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            integerList2.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by list 2: " + (endTime - startTime) + "ms");

        /**
         *  Time taken by list 1: 5ms
         *  Time taken by list 2: 3028ms
         *  데이터를 가져올때는 ArrayList가 훨씬 빠르다.
         */

    }
}
