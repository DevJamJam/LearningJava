package mission.Day8_mission;

import java.util.Arrays;
public class ScoresSituation {
    public static void main(String[] args) {
        // **1. 초기 상태**: 아직 어떤 학생도 생성되지 않은 상태
        // StudentScore 클래스의 정적 배열 `allScores`는 초기값 `null`이므로 출력 결과는 `null`이 됩니다.
        System.out.println("학생들이 아무도 없을때 전체 시험 점수 : " + Arrays.toString(StudentScore.getAllScores()));
        // 출력: "학생들이 아무도 없을때 전체 시험 점수 : null"

        // **2. 첫 번째 학생 생성**
        // 새로운 StudentScore 객체 생성 (점수: 85)
        // 생성자의 `addAllScore` 호출로 정적 배열 `allScores`에 85가 추가됩니다.
        StudentScore student1 = new StudentScore(85);
        // 출력: "학생이 한명 추가 되었을 때, 전체 시험 점수: [85]"
        System.out.println("학생이 한명 추가 되었을 때, 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        // **3. 추가 학생 생성**
        // student2: 점수 90 추가 → `allScores`는 [85, 90]
        // student3: 점수 77 추가 → `allScores`는 [85, 90, 77]
        StudentScore student2 = new StudentScore(90);
        StudentScore student3 = new StudentScore(77);
        // 출력: "여러 명 추가후 전체 시험 점수: [85, 90, 77]"
        System.out.println("여러 명 추가후 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        // **4. 점수 변경**
        // student1 점수를 95로 수정 → `allScores[0] = 95`
        // student2 점수를 88로 수정 → `allScores[1] = 88`
        // student3 점수를 55로 수정 → `allScores[2] = 55`
        student1.setScore(95);
        student2.setScore(88);
        student3.setScore(55);
        // 출력: "변경된 전체 시험 점수: [95, 88, 55]"
        System.out.println("변경된 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        // **5. 새로운 학생 추가**
        // student4: 점수 20 추가 → `allScores`는 [95, 88, 55, 20]
        StudentScore student4 = new StudentScore(20);
        // 출력: "추가후 전체 시험 점수: [95, 88, 55, 20]"
        System.out.println("추가후 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));

        // **6. 개별 점수 조회**
        // 각 학생의 점수를 개별적으로 반환하는 `getScore` 호출
        System.out.println("Student1 점수: " + student1.getScore()); // 출력: Student1 점수: 95
        System.out.println("Student2 점수: " + student2.getScore()); // 출력: Student2 점수: 88
        System.out.println("Student3 점수: " + student3.getScore()); // 출력: Student3 점수: 55
        System.out.println("Student4 점수: " + student4.getScore()); // 출력: Student4 점수: 20
    }
}

