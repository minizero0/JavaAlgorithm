import java.util.Scanner;

public class throwTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        try {
            int score = sc.nextInt();
            if(score < 0){
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("0이하임");
        }
    }
}
