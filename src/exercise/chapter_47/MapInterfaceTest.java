package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        // Map 정의
        Map<String,Integer> fruitMap = new HashMap<>();

        // put(key,value) : map 에 데이터 들을 넣는다
        fruitMap.put("apple",4);
        fruitMap.put("orange",5);
        fruitMap.put("pear",20);
        fruitMap.put("pineapple",7);
        System.out.println(fruitMap);
        // {orange=5, apple=4, pear=20, pineapple=7} key value 형식으로 출력
        // Map도 내부적으로 toString 구현 되어 있다.

        // get : 주어진 키에 대응하는 값을 반환하고, 키가 존재하지 않으면 null 반환
        Integer appleCount = fruitMap.get("apple");
        Integer orangeCount = fruitMap.get("orange");
        Integer kiwiCount = fruitMap.get("kiwi");

        System.out.println(appleCount); // 4
        System.out.println(orangeCount); // 5
        System.out.println(kiwiCount); // null

        // containsKey(key) : 주어진 키가 Map에 존재하는 지 확인 , 존재하면 true 존재하지 않으면 false 반환
        Boolean isApple = fruitMap.containsKey("apple");
        Boolean isKiwi = fruitMap.containsKey("kiwi");

        System.out.println(isApple); // true
        System.out.println(isKiwi); // false

        // remove(key) : 주어진 키에 대응하는 항목을 Map에서 제거, 해당키에 대응하는 이전 값은 반환
        fruitMap.remove("orange");
        System.out.println(fruitMap); // {apple=4, pear=20, pineapple=7}

        // size() : Map에 저장된 키-값 쌍의 개수를 반환
        System.out.println("fruitMap 사이즈 : "+fruitMap.size()); // fruitMap 사이즈 : 3

        // keySet() : Map에 있는 모든 키들을 Set으로 반환 , 반환 된 set은 Map의 키들의 집합이다.
        System.out.println(fruitMap.keySet()); // [apple, pear, pineapple]
    }
}
