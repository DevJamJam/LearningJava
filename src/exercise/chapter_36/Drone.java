package exercise.chapter_36;

public class Drone implements Flyable{
    // Flyable에 default 선언 되어 있어서 implements시 아무런 error 발생 X

    // 속성
    private String droneID;
    private long remainingFuelAmount; // 잔여 연료량
    private long remainingFileStorage; // 잔여 사진 파일 용량

    public void takePicture() {
        Flyable.printLanding();
        System.out.println("Drone take picture");
    }
}
