package arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){}
public class Challenge2 {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Place> places = new LinkedList<>();

    public static void main(String[] args) {
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(places, adelaide);
        addPlace(places, new Place("adelaide", 1374));
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));

        places.addFirst(new Place("Sydney", 0));

        program();
    }

    private static void program() {
        printMenu();
        String input = scanner.nextLine();
        var iterator = places.listIterator();
        boolean forward = true;
        if (!(input.toLowerCase().charAt(0) == 'f')){
            forward = false;
        }
        while (input.toLowerCase().charAt(0) != 'q'){
            switch (input.charAt(0)){
                case 'f' :
                    if (!forward){
                        iterator.next();
                        forward = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }else {
                        System.out.println(iterator.previous());
                    }
                    input = scanner.nextLine();
                    break;
                case 'b' :
                    if (forward){
                        iterator.previous();
                        forward = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }else {
                        System.out.println(iterator.next());
                    }
                    input = scanner.nextLine();
                    break;
                case 'm':
                    printMenu();
                    input = scanner.nextLine();
                    break;

                case 'l':
                    System.out.println(places);
                    input = scanner.nextLine();
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> places, Place place) {
        for (Place placeDuplicateValidation: places) {
            if (placeDuplicateValidation.name().equalsIgnoreCase(place.name())){
                System.out.println("OOps! Duplicate value! Can not be added to list!");
                return;
            }
        }
        int matchingIndex = 0;
        for (Place p : places) {
            if (place.distance() < p.distance()){
                places.add(matchingIndex,place);
                return;
            }
            matchingIndex++;
        }
        places.add(place);
    }
    private static void printMenu() {

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
