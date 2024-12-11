package exercise.chapter_17;

public class ParkingLotMission {
    public static void main(String[] args){
        // 주차장 할인 구현
        int useMoney = 200_000;
        int parkingTime = 6;

        if (useMoney >= 200_000) {
            // tip :  _ 써도 그냥 넘어가기 때문에 금액의 단위가 높아질때 구분용으로 사용
            parkingTime = parkingTime -5;
        }
        else if (useMoney >= 100_000){
            parkingTime = parkingTime -4;
        }
        else if(useMoney >= 50_000){
            parkingTime = parkingTime -3;
        }
        else if (useMoney >= 30_000) {
            parkingTime = parkingTime -2;
        }
        else if (useMoney >= 10_000) {
            parkingTime = parkingTime -1;
        }
        String result = String.format("고객님은 %d 원을 사용하셔서, %d 시간 결제 하셔야합니다.",useMoney,parkingTime);
        System.out.println(result);
    }
}
