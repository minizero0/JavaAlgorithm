import java.util.Scanner;

public class adminException {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if(score < 0){
                throw new ScoreException("음수 입력 불가");
            }
        }catch (ScoreException e){
            e.printStackTrace();
        }
    }
}
