package arrays;

import java.util.Arrays;
import java.util.Random;

public class DescendingSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
//        Arrays.sort(arr);
//        int[] desc = new int[arr.length];
//        int k = 0;
//        for (int i = arr.length -1; i >= 0; i--) {
//            desc[k++] = arr[i];
//        }
//        arr = desc;
        System.out.println(Arrays.toString(arr));
    }
    public static void sortArray(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int sorting = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (sorting<arr[j]){
                    int temp = sorting;
                    sorting = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
