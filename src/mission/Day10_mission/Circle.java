package mission.Day10_mission;

// Shape 클래스를 상속받아 Circle(원) 클래스를 정의
public class Circle extends Shape {

    // 원의 반지름을 저장하는 변수
    private double radius;

    // Circle 클래스의 생성자
    public Circle(double radius) {
        // 부모 클래스(Shape)의 생성자 호출 (dimension을 2로 설정하고, 기본 색상을 "기본색"으로 설정)
        super(2, "기본색");
        this.radius = radius;
    }

    // 원의 지름(Diameter) 계산: 지름 = 2 × 반지름
    public double calculateDiameter() {
        return 2 * radius;
    }

    // 원의 면적(Area) 계산: 면적 = π × 반지름²
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // 원의 둘레(Perimeter) 계산: 둘레 = 2 × π × 반지름
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // 반지름(radius) 값을 반환하는 getter 메서드
    public double getRadius() {
        return radius;
    }
}