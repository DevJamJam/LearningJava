package exercise.chapter_29;

// 시나리오 참고
// '아메리카노 커피'는 물 500ml와 원두 30g 으로 만들어진다.
// '아메리카노 커피'는 '테이크아웃용'으로 포장된다.
// *추가 '카페라떼'는 우유 450ml와 원두 30g 으로 만들어진다.
public class Coffee {
    //속성
    private String coffeeName;
    private long waterQuantity; // ml 단위
    private long milkQuantity; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp; // 포장 여부

    // 행위
    void beWrappedUp() { //포장 되어 진다.
        this.isWrappedUp = true;
    }
    // 생성자
    Coffee(String coffeeName,long waterQuantity,long milkQuantity,long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.milkQuantity = milkQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }

    // getter
    public String getCoffeeName() {
        return coffeeName;
    }
}
