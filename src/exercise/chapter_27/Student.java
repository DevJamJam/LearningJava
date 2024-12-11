package exercise.chapter_27;

public class Student {
    // 속성
    private String schoolName;
    private int classYear;
    private int classroomNumbers;
    private int studentNumber;

    // 기본 정보
    private String name;
    private String gender;

    // 행위
    void study(Teacher teacher, String subjectName) {
        // get 사용
        String teacherName = teacher.getName();
        System.out.printf("학생 : 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName,subjectName);
    }

    // 생성자
    Student() {
    }
    Student(String pSchoolName,int pClassYear,int pClassroomNum,int pStudentNum, String pName, String pGender) {
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumbers = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }

    // getter
    public String getName() { return name; }
}
