package exercise.chapter_17;

public class Taxi {
    public static void main(String[] args){
        // 택시 비용 구현 , 심야 할증구간 : 0 ~4시
        // 시외 할증 기준 : 서울 할증 없음 , 서울 외곽 할증 있음
        int goHomeTime = 0;
        String myHome = "경기";
        int payment = 15_000;

        if (0 <= goHomeTime && goHomeTime <4) { // 심야 할증 구간 인지 확인
            payment = payment + (int)(payment * 0.2);
        }

        if (myHome != "서울") { // 시외 할증 구간 인지 확인
            payment = payment + (int)(payment * 0.2);
        }
        String result = String.format("고객님이 내셔야 할 돈은 %d원 입니다.", payment);
        System.out.println(result); //고객님이 내셔야 할 돈은 21600원 입니다.
    }
}
