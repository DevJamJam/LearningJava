package mission;

import java.util.Arrays;

public class TwoWeekMission1 {

    /**
     * 정수 배열의 길이를 2의 정수 거듭제곱으로 확장하며, 나머지 부분은 0으로 채운 배열을 반환하는 함수
     * 정수 배열 arr을 매개변수로 받아 처리합니다.
     * 이 함수는 static으로 정의됩니다.
     */
    public static int[] involutionArrays(int[] arr) {
        // 입력 배열의 길이를 변수 length에 저장
        int length = arr.length;

        // 입력 배열이 이미 2의 거듭제곱 길이인지 확인
        if ((length & (length - 1)) == 0) {
            // 길이가 2의 거듭제곱이면 입력 배열을 그대로 반환
            return arr;
        }

        // 2의 거듭제곱 길이를 찾기 위한 변수 초기화 (1부터 시작)
        int plusLength = 1;

        // plusLength가 배열의 길이보다 작을 동안 반복
        while (plusLength < length) {
            // plusLength를 두 배로 증가시켜 2의 거듭제곱으로 만듦
            plusLength *= 2;
        }

        // plusLength 크기의 새로운 배열 생성 (기본값 0으로 초기화)
        int[] result = new int[plusLength];

        // 기존 배열의 값을 새로운 배열로 복사
        for (int i = 0; i < length; i++) {
            result[i] = arr[i];
        }

        // 확장된 배열 반환
        return result;
    }

    // main 메서드: 프로그램 실행의 시작점
    public static void main(String[] args) {
        // Base 코드
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        // involutionArrays 메서드를 호출하여 확장된 배열을 반환받음
        int[] result1 = involutionArrays(arr1);

        // 확장된 배열을 문자열로 변환하여 출력
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {58, 172, 746, 89};
        int[] result2 = involutionArrays(arr2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = {9, 8, 7};
        int[] result3= involutionArrays(arr3);
        System.out.println(Arrays.toString(result3));

        int[] arr4 = {11, 22, 33, 44, 55, 66, 77, 88,99, 1111,2222,333, 4444, 2222,333, 4444 ,2222,333, 4444, 2222,333, 4444, 2222,333, 4444};
        int[] result4= involutionArrays(arr4);
        System.out.println(Arrays.toString(result4));
    }
}
