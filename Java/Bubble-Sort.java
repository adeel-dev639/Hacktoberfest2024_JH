import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,0};
        check(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void check(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = false;
                }
            }
            if (sorted){break;}
        }
    }
}