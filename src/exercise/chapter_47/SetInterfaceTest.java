package exercise.chapter_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        // Set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        // add
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("orange");
        fruitSet.add("grape");
        System.out.println("fruitSet : " + fruitSet); // fruitSet : [banana, orange, apple, grape]

        // add 중복 Add
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("pineapple");
        fruitList.add("pineapple");
        System.out.println("fruitList : " + fruitList);
        // fruitList : [apple, banana, pineapple, pineapple]
        // 중복으로 값이 들어간다.
        fruitSet.add("apple");
        System.out.println("fruitSet : " + fruitSet);
        // fruitSet : [banana, orange, apple, grape]
        // 값이 중복으로 들어가지 않는다.

        // remove()
        fruitSet.remove("apple");
        System.out.println("fruitSet : " + fruitSet); // fruitSet : [banana, orange, grape]

        // container
        System.out.println("apple 있나요 ? " + fruitSet.contains("apple"));
        System.out.println("grape 있나요 ? " + fruitSet.contains("grape"));
        /**
         *  apple 있나요 ? false
         *  grape 있나요 ? true
         */

        // Size, isEmpty, Clear
        System.out.println("사이즈 : " + fruitSet.size());
        fruitSet.clear();
        System.out.println("Set이 비어있나요 ? " + fruitSet.isEmpty());
        System.out.println("fruitSet : " + fruitSet);
        /**
         *  사이즈 : 3
         *  Set이 비어있나요 ? true
         *  fruitSet : []
         */


    }
}
