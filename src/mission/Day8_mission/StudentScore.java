package mission.Day8_mission;

import java.util.Arrays;

/**
 *  시나리오
 *  학생들의 시험점수를 관리하는 클래스 StudentScore
 *  해당 클래스는 학생들의 시험점수를 저장하고 접근하는 기능을 제공
 *  또한 이 클래스들은 모든 학생들의 시험점수를 관리하는 allScores 기능도 제공
 *  allScores는 방의 모든 StudentScore가 공동으로 접근하는 값
 *
 */
public class StudentScore {
    // static 변수
    // 모든 StudentScore 객체가 공유하는 정적 변수
    private static int serialIndex; // 학생 고유 인덱스(순서)를 생성하기 위한 정수
    private static int[] allScores; // 모든 학생의 점수를 저장하는 정적 배열

    // 인스턴스 변수
    private int myIndex; // 이 객체(StudentScore)의 고유 인덱스
    private int score;   // 이 객체의 점수

    // 모든 학생의 점수 배열을 반환 (정적 메소드라 객체 생성 없이 호출 가능)
    public static int[] getAllScores() {
        return allScores;
    }
    // 이 객체의 점수를 반환
    public int getScore() {
        return score;
    }

    // 이 객체의 점수를 설정
    public void setScore(int score) {
        // TODO 구현 부분: 현재 객체의 점수를 업데이트하고, 정적 배열도 업데이트
        this.score = score;            // 인스턴스 변수 `score`를 새로운 값으로 업데이트
        allScores[myIndex] = score;    // 정적 배열에서 해당 인덱스의 점수도 업데이트
    }
    // 생성자
    public StudentScore(int score) {
        // TODO: 구현 부분
        this.myIndex = serialIndex++; // `serialIndex` 값을 객체의 고유 인덱스로 할당 후 증가
        this.score = score;           // 객체의 점수를 전달받은 `score`로 설정
        addAllScore(score);           // 정적 배열에 점수를 추가
    }

    // 정적 배열에 점수를 추가 (배열 크기 관리 포함)
    // 정적 메소드
    private static void addAllScore(int score) {
        // 배열이 초기화되지 않은 경우
        if (allScores == null) {
            allScores = new int[1];  // 크기 1의 배열 생성
            allScores[0] = score;   // 배열의 첫 번째 요소에 점수 저장
            return;                 // 초기화 후 메서드 종료
        }

        // 배열이 이미 초기화된 경우
        int length = allScores.length;                        // 기존 배열의 크기를 저장
        allScores = Arrays.copyOf(allScores, length + 1);     // 배열 크기를 1 늘림
        allScores[length] = score;                            // 새로 생성된 공간에 점수 추가
    }
}

