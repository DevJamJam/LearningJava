package exercise.chapter_24;

public class Scores {
    public static void main(String[] args){
        // A class 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 35;
        int studentAClass3 = 45;

        // B class 학생들 점수
        int studentBClass1 = 61;
        int studentBClass2 = 65;
        int studentBClass3 = 67;

        // Average A
        // int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
        //double averageAClass = sumAClass / (double) 3;
        double averageAClass = calculateAverage(studentAClass1,studentAClass2,studentAClass3);

        // Average B
        // int sumBClass = studentBClass1 + studentBClass2 + studentBClass3;
        // double averageBClass = sumBClass / (double) 3;
        double averageBClass = calculateAverage(studentBClass1,studentBClass2,studentBClass3);

        System.out.printf("A 학급의 평균 점수는 %.2f, B학급 평균 점수는 %.2f\n",averageAClass,averageBClass);
        // 결과 : A 학급의 평균 점수는 43.33, B학급 평균 점수는 64.33
    }

    // 평균 메소드 생성
    static double calculateAverage(int studentScore1, int studentScore2, int studentScore3) {
        //다른 인자, 같은 메커니즘
        int sumClass = studentScore1 + studentScore2 + studentScore3;
        return sumClass / (double) 3;
    };
}
