package exercise.chapter_16;

public class AvocadoSituation {
    public static void main(String[] args){
        //장보기 전
        int milks = 0; // 우유 0개
        int avocados = 0; // 아보카도 0개
        boolean existedAvocado = true; //아보카도 유/무

        //장보기
        milks = (existedAvocado) ? 6 : 1;
        // 아보카도가 있으면 우유 6개 , 아니면 1개

        // 집으로 돌아오기
        String comment = String.format("장보고 돌아왔어 %d개 아보카도, %d개 우유 사왔어",avocados,milks);
        System.out.println(comment);
    }
}
