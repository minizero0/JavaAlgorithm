public class excetionTest {

    public static int sum(int a, int b) throws Exception{
        return a/b;
    }

    public static void main(String[] args) {

        try {
            System.out.println(excetionTest.sum(5,0));
        } catch (Exception e) {
            System.out.println("에러발생:"+e.getMessage());
        }
    }
}
