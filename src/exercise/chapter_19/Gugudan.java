package exercise.chapter_19;

public class Gugudan {
    public static void main(String[] args){
        // 구구단 구현
        int dan;
        int hang;

        for(dan = 2;dan <= 9;dan++) { //큰 범위
            for(hang = 1;hang <=9; hang++){ // 작은 범위
                int result = dan * hang;
                System.out.printf("%d * %d= %d\n",dan,hang,result);
            }
            System.out.println();
        }
    }
}
