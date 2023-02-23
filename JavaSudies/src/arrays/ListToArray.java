package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry","strawberry","orange"};
        ArrayList<String> list = new ArrayList<>(List.of(arr));
        list.add("melon");
        System.out.println(list);
        var arrayList = list.toArray(new String[list.size()]);
        List<String > strings = new ArrayList<>();
        System.out.println(Arrays.toString(arrayList));
    }
}
