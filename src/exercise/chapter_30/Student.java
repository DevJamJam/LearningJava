package exercise.chapter_30;

public class Student {
    // static
    static private int serialNum = 1; // static 동작 테스트를 위한 serialNum
    static private String city = "Dokyo"; //static 변수 접근을 위한 테스트 static
    // static 변수들은 인스턴스화랑 관계가 없다 !

    // 속성
    private String schoolName;
    private int classYear;
    private int classroomNumber;
    private int studentNumber;
    private int studentId; // student 고유 ID

    // 기본 정보
    private String name;
    private String gender;

    // 정적 메소드 static
    public static int getSerialNum() { return serialNum; }
    public static int setSerialNum(int num) {
        // this는 인스턴스 변수만 이야기 하므로 this 안 붙인다.
        return serialNum = num;
    }
    public static String getCity() { return city; }
    public static void setCity(String city) { Student.city = city; }

//    // 행위 : 해당 Chapter에서는 사용하지 않으므로 주석처리
//    void study(Teacher teacher, String subjectName) {
//        // get 사용
//        String teacherName = teacher.getName();
//        System.out.printf("학생 : 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName,subjectName);
//    }

    // 생성자
    Student() {
    }
    Student(String name, String gender) {
        this.studentId = serialNum++;
        this.name = name;
        this.gender = gender;
    }
    Student(String schoolName, int classYear, int classroomNum, int studentNum, String name, String gender) {
        this.studentId = serialNum++;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNum;
        this.studentNumber = studentNum;
        this.name = name;
        this.gender = gender;
    }

    public void printMyInfo() {
        // static을 확인하기 위한 코드
        System.out.printf("[Student] StudentId : %d, StudentName: %s, " +
                "StudentGender: %s, City: %s\n", this.studentId, this.name, this.gender, city);
    }
    // getter
    public String getName() { return this.name; }
}
