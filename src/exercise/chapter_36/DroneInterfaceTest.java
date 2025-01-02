package exercise.chapter_36;

public class DroneInterfaceTest {
    public static void main(String[] args) {
        // Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AP0915");

        Drone drone1 = new Drone();

        drone.fly();
        airplane.fly();

        /**
         *  결과 :
         *  <정보> 현재 이 사물은 날고 있습니다. Flyable의 default fly가 출력
         *  비행기 ID(AP0915)가 납니다. Airplane의 메소드 fly가 출력
         */

        drone1.fly();
        drone1.takePicture();

        /**
         *  결과 :
         *  <정보> 현재 이 사물은 날고 있습니다.  Flyable의 default fly가 출력
         *
         *  drone1 의 takePicture() 실행 되어 출력
         *  <경보> 현재 이 사물은 공중에 있습니다.
         *  Drone take picture
         */
    }
}
