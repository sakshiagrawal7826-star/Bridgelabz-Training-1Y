package Lambda_Expression;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Prac1 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(19,32,4,35,43,54);
        System.out.println("List: "+l);

        Collections.sort(l);
        System.out.println("Sorted: "+l);

        Collections.shuffle(l);
        System.out.println("Shuffled: "+l);

        System.out.println("Max:"+Collections.max(l));
        System.out.println("Min: "+Collections.min(l));
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Reverse: "+l);

    }
}