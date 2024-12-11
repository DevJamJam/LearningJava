package mission;

public class Triangle {
    public static void main(String[] args) {
        // 다이아몬드의 크기를 나타내는 변수
        int size = 10;

        // 윗부분 이등변 삼각형 출력
        for (int i = 1; i <= size; i++) { // 행 수를 나타내는 반복문 (1부터 size까지 반복)
            for (int j = size - i; j >= 1; j--) { // 공백을 출력하는 반복문 (현재 행의 번호에 따라 공백 개수 결정)
                System.out.print(" "); // 공백 출력
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // 별(*)을 출력하는 반복문 (현재 행의 번호에 따라 별 개수 결정)
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 한 행이 끝난 뒤 줄바꿈
        }

        // 아랫부분 이등변 삼각형 출력
        for (int i = size - 1; i >= 1; i--) { // 행 수를 나타내는 반복문 (size-1부터 1까지 반복)
            for (int j = 1; j <= size - i; j++) { // 공백을 출력하는 반복문 (현재 행의 번호에 따라 공백 개수 결정)
                System.out.print(" "); // 공백 출력
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // 별(*)을 출력하는 반복문 (현재 행의 번호에 따라 별 개수 결정)
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 한 행이 끝난 뒤 줄바꿈
        }
    }
}
