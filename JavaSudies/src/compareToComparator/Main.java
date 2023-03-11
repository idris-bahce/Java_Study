package compareToComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Dell",32,1200));
        list.add(new Laptop("HP",16,800));
        list.add(new Laptop("Apple",8,1000));

        Collections.sort(list);
        System.out.println(list);

        Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getRam()>o2.getRam()){
                    return 1;
                } else if (o1.getRam() == o2.getRam()) {
                    return 0;
                }else {
                    return -1;
                }
            }
        };
        Collections.sort(list,com);
        System.out.println(list);
    }
}
