import java.util.Scanner;

public class throwTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        int score = sc.nextInt();

        if(score < 0){
            throw new IllegalArgumentException();
        }
        System.out.println(score);
    }
}
