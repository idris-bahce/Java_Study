package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    public static void main(String[] args) {

        int[] arr = readIntegers();

        int min = findMin(arr);

        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(min);
    }

    private static void reverseArray(int[] arr) {
        int i1 = arr.length - 1;
        for (int i = 0; i <(arr.length/2); i++) {
            int temp = arr[i];
            arr[i] = arr[i1];
            arr[i1--] = temp;
        }
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers with comas: ");
        String input = scanner.nextLine();

        String[] array = input.split(",");

        int[] intArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArr[i] = Integer.parseInt(array[i]);
        }
        return intArr;
    }

}
