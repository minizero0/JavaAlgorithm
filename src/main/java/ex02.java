public class ex02 {
    public static void main(String[] args) {
        int arr[] = {7,44,16,32,1,22};

        java.util.Arrays.sort(arr);

        for(int num : arr){
            System.out.print(num+",");
        }
    }
}
