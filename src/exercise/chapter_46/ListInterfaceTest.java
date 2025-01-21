package exercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        // List 정의
        List<String> fruitList = new ArrayList<>();

        // add(E element) : 리스트의 끝에 요소를 추가
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Pear");
        fruitList.add("Grape");
        System.out.println(fruitList); // [Apple, Banana, Orange, Pear, Grape]
        // List 는 내부적으로 toString 이 구현 되어 있다.

        // add(int index, E element) : 지정된 인덱스에 요소를 삽입한다.
        fruitList.add(3,"Mango");
        System.out.println(fruitList); // [Apple, Banana, Orange, Mango, Pear, Grape]

        // remove(int index) : 지정된 인덱스의 요소 제거
        fruitList.remove(3);
        System.out.println(fruitList); // [Apple, Banana, Orange, Pear, Grape]

        // get(int index) : 지정된 인덱스의 요소를 반환
        String myFruit = fruitList.get(1);
        System.out.println("내가 좋아하는 과일은 ? " + myFruit); // 내가 좋아하는 과일은 ? Banana

        // set(int index, E element) : 지정된 인덱스의 요소를 새로운 요소로 대체
        fruitList.set(3,"Pineapple");
        System.out.println(fruitList); //[Apple, Banana, Orange, Pineapple, Grape]

        // size() : 리스트의 요소 수를 반환
        System.out.println(fruitList.size()); // 5

        // isEmpty() : 리스트가 비어 있는지 여부를 확인
        System.out.println(fruitList.isEmpty()); // false

        // contains(Object o) : 리스트에 지정된 요소가 있는지 확인 한다.
        System.out.println(fruitList.contains("Pineapple")); // true
        System.out.println(fruitList.contains("Kiwi")); // false

        // indexOf(Object o) : 지정된 요소의 첫 번째 등장 인덱스를 반환 한다.
        String myFruit2 = "Banana";
        System.out.println(fruitList.indexOf(myFruit2)); // 1
        String myFruit3 = "Kiwi";
        System.out.println(fruitList.indexOf(myFruit3)); // -1

        // clear() : 리스트의 모든 요소를 제거
        fruitList.clear();
        System.out.println("FruitList 의 요소 : "+fruitList); // FruitList 의 요소 : []
    }
}
