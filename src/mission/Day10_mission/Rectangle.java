package mission.Day10_mission;

// Shape 클래스를 상속받아 Rectangle(직사각형) 클래스를 정의
public class Rectangle extends Shape {
    // 직사각형의 너비와 높이를 저장하는 변수
    private double width;
    private double height;

    // Rectangle 클래스의 생성자
    public Rectangle(double width, double height) {
        // 부모 클래스(Shape)의 생성자 호출 (dimension을 2로 설정하고, 기본 색상을 "기본색"으로 설정)
        super(2, "기본색");
        this.width = width;
        this.height = height;
    }

    // 대각선 길이(diagonal) 계산: 피타고라스 정리를 이용하여 구함
    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    // 면적(Area) 계산: 너비 × 높이
    @Override
    public double calculateArea() {
        return width * height;
    }

    // 둘레(Perimeter) 계산: 2 × (너비 + 높이)
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // 너비(width) 값을 반환하는 getter 메서드
    public double getWidth() {
        return width;
    }

    // 높이(height) 값을 반환하는 getter 메서드
    public double getHeight() {
        return height;
    }
}