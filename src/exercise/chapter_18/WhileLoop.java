package exercise.chapter_18;

public class WhileLoop {
    public static void main(String[] args){
        // 1~ 100까지 다 더하는 while loop
        int sum = 0;
        int num = 0;

        while(num <100) {
            // 조건 num 이 100보다 작을 것
            // 0부터 시작해서 99까지 반복 된다.
            num = num + 1;
            sum = sum + num;
        }
        String result = String.format("모든 수를 더한 값은 %d 입니다.", sum);
        System.out.println(result);
    }
}
