public class ex01 {

    public static void main(String[] args) {
        int arr[] = {7,44,16,32,1,22};

        int temp = 0;

        for(int i = 0; i <arr.length-1; i++){
            for(int j = 0; j <arr.length-(i+1);j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int num : arr){
            System.out.print(num +",");
        }
    }

}
