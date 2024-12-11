package exercise.chapter_29;

/**
 *  시나리오 참고
 *  1. 바리스타는 아메리카노 주문 확인을 알린다
 *  2. 바리스타는 물 500ml와 원두 30g 으로 아메리카노 커피를 만든다.
 *  3. 바리스타는 아메리카노 커피 완성을 알린다.
 *  추가
 *  4. 바리스타는 우유 450ml와 원두 30g 으로 라떼를 만든다.
 *  5. 바리스타는 라떼 커피 완성을 알린다.
 */
public class Barista {

    // 속성

    // 행위
    public void noticeOrder(String coffeeName){
        System.out.println("바리스타: 커피 주문 확인 했습니다 커피:"+ coffeeName);
    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long milkQuantity, long coffeeBeanQuantity){
        Coffee coffee = new Coffee(coffeeName, waterQuantity, milkQuantity, coffeeBeanQuantity);
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타 : 커피 제작이 완료 되었습니다. 커피: " + coffeeName);
    }
}
