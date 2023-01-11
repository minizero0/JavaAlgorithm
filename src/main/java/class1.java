public class class1 implements interface1{

    static int n = 100;

    @Override
    public int calculate(int n) {
        n -= 50;
        return n;
    }

    public static void main(String[] args) {
        class1 a = new class1();
        System.out.println(a.calculate(n));
    }
}
