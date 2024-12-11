package exercise.chapter_21;

public class CmdLineArgs {
    public static void main(String[] args){
        /**
         * 터미널에서  주입하는 방법 :
         * java exercise.chapter_21.CmdLineArgs hello world
         *
         * 인텔리 제이에서 주입 방법 :
         * 재생버튼 누르고 4번째 Modify Run Configuration
         * program arguments 값 띄어쓰기로 구분해서 넣기
         */

        System.out.println("인자의 개수: " + args.length);
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.printf("인자 %d: %s\n", i + 1, args[i]);
            }
        } else {
            System.out.println("명령줄 인자가 없습니다.");
        }

        /**
         * 결과 :
         * 인자의 개수: 3
         * 인자 1: Test
         * 인자 2: modify
         * 인자 3: args
         */
    }
}
