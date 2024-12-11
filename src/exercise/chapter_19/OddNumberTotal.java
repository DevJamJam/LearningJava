package exercise.chapter_19;

public class OddNumberTotal {
    public static void main(String[] args){
        int total = 0;

        for(int i= 1; i <=10; i++) {
            if(i % 2 == 0) {
                //i가 짝수면 넘어가게
                continue;
            }
            System.out.println(i); // 1, 3, 5, 7, 9
            total += i;
        }
        System.out.printf("0 ~ 10까지 홀수를 더한 값은 %d", total);
        //0 ~ 10까지 홀수를 더한 값은 25
    }
}
