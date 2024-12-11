package mission.Day7_missoin;

/**
 *  시나리오
 *  학생 객체를 추가, 삭제, 검색할 수 있는 메서드
 */
public class StudentManagementSystem {
    private Student[] studentsArray;
    private int studentCount;

    public StudentManagementSystem(int maxStudentCount) {
        studentsArray = new Student[maxStudentCount];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < studentsArray.length) {
            studentsArray[studentCount] = student;
            studentCount++;
            System.out.println("학생이 추가 되었습니다 : " + student.getName());
        } else {
            System.out.println("학생의 수가 다 찼습니다.");
        }
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            // 학생을 찾으면
            if (studentsArray[i].equals(student)) {
                // 요소 이동
                for (int j = i; j < studentCount - 1; j++) {
                    studentsArray[j] = studentsArray[j + 1];
                }
                // 마지막 요소를 null로 설정
                studentsArray[studentCount - 1] = null;
                studentCount--; // 학생 수 감소
                System.out.println("학생이 삭제되었습니다: " + student.getName());
                return; // 메서드 종료
            }
        }
        // 학생을 찾지 못한 경우
        System.out.println("해당 학생을 찾을 수 없습니다.");
    }
    public Student findStudent(int studentNo) {
        for (int i = 0; i < studentCount; i++) {
            if (studentsArray[i].getStudentNo() == studentNo) { // 학생 번호로 비교
                System.out.println("학생을 찾았습니다.");
                System.out.println("이름: " + studentsArray[i].getName());
                System.out.println("학번: " + studentsArray[i].getStudentNo());
                System.out.println("전공: " + studentsArray[i].getMajor());
                System.out.println("학년: " + studentsArray[i].getStudentYear());
                return studentsArray[i];
            }
        }
        System.out.println("해당 학생을 찾을 수 없습니다");
        return null; // 찾지 못한 경우 null 반환
    }
}
