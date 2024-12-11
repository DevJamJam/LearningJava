package mission.Day7_missoin;

/**
 *  시나리오
 *  학생 클래스에는 학생의 이름, 학번, 전공, 학년을 저장하는 private 멤버 변수가 있어야 합니다.
 *  정보 은닉을 위해 멤버 변수에 직접 접근하지 못하도록 접근 제어자를 사용해야 합니다.
 *  적절한 생성자를 작성하여 학생 객체를 초기화해야 합니다.
 *  getter와 setter 메서드를 사용하여 학생 정보에 접근하고 변경할 수 있어야 합니다.
 *  학생 정보 관리 시스템 클래스 설계:
 *  학생 정보 관리 시스템 클래스는 학생 객체를 생성하고 관리하는 기능을 제공해야 합니다.
 *  학생 객체를 추가, 삭제, 검색할 수 있는 메서드를 작성해야 합니다.
 */
public class Student {
    // 접근 제어자
    private String name;
    private int studentNo;
    private String major;
    private int studentYear;

    // 생성자
    public Student(String name, int studentNo, String major, int studentYear) {
        this.name = name;
        this.studentNo = studentNo;
        this.major = major;
        this.studentYear = studentYear;
    }

    public String getName() {
        return name;
    }
    public int getStudentNo() {
        return studentNo;
    }
    public String getMajor() {
        return major;
    }
    public int getStudentYear() {
        return studentYear;
    }
}
