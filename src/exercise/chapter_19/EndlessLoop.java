package exercise.chapter_19;

public class EndlessLoop {
    public static void main(String[] args){
        // tip : 분 단위로 하면 계산하기 수월하다
        final int WAKE_UP_TIME = 8 * 60;
        //일어나는 시간 8시, 분단위 므로 * 60
        final int END_DAY = 24 * 60;

        int now = WAKE_UP_TIME;

        System.out.println(("아 공부하기 싫다, 30분 부터 해야지 "));
        while (now < END_DAY) {
            now++;
            int hour = now / 60;
            if ( now % 60 == 0 ) {
                System.out.printf("지금 시간은 %d 정각이네!\n", hour);
            }

            if (hour == 10 ) { //10시가 되면 loop탈출
                break;
            }
            if ( now % 60 == 34 ) {
                // 현재 시간을 60으로 나눴을때 나머지가 34
                // 즉 34분 ..
                System.out.println("헐 34분 이잖아..? ");
                System.out.println("그럼 그냥 정각 되면 해야겠다.");
            }
            if (now % 60 == 8) {
                // 현재 시간을 60으로 나눴을때 나머지가 8
                // 즉 8분 ..
                System.out.println("왓더..? 08분 이잖아..? ");
                System.out.println("아..공부하기 진짜 싫다.. 30분에는 진짜..");
            }

        }
    }
}
