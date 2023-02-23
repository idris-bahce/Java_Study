package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Challenge {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        addingOrRemovingToList();
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
    }

    private static void addingOrRemovingToList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?");
        int specifier = scanner.nextInt();
        while (specifier != 0){
            switch (specifier){
                case 1 -> {
                    System.out.println("Add items to grocery list. Use commas for each element:");
                    scanner.nextLine();
                    String listAdd = scanner.nextLine();
                    String[] arrListAdd = listAdd.split(",");
                    for (int i = 0; i < arrListAdd.length; i++) {
                        if (!isInGroceryList(arrListAdd[i])){
                            groceryList.add(arrListAdd[i]);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Remove items to grocery list. Use commas for each element:");
                    scanner.nextLine();
                    String listRemove = scanner.nextLine();
                    String[] arrListRemove = listRemove.split(",");
                    for (int i = 0; i < arrListRemove.length; i++) {
                        if (isInGroceryList(arrListRemove[i])){
                            groceryList.remove(arrListRemove[i]);
                        }
                    }
                }
            }
            System.out.println("What would you like to do?");
            specifier = scanner.nextInt();
        }
    }

    private static boolean isInGroceryList(String s) {
        for (int i = 0; i < groceryList.size(); i++) {
            if (groceryList.get(i).equalsIgnoreCase(s)){
                return true;
            }
        }
        return false;
    }


}
