package exercise.chapter_36;

public class Airplane implements Flyable{
    // 추상화 때와 마찬가지로 메소드 의무적으로 구현 해야한다.

    // 속성
    private String airplaneID; // 비행기 ID
    private long remainingFuelAmount; // 잔여 연료량
    private long maximunCapacity; // 최대 수용 인원


    @Override
    public void fly() {
        System.out.println("비행기 ID(" + airplaneID + ")가 납니다.");
    }

    public void refillFuel(long fuel) { // 연료 충전
        remainingFuelAmount += fuel;
    }

    public Airplane(String airplaneID) {
        this.airplaneID = airplaneID;
    }
}
