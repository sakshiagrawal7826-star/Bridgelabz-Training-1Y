import java.util.ArrayList;
import java.util.List;

public class testlist {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        Boolean  a= list.contains(50);
        System.out.println(a);
        int b= list.indexOf(60);
        System.out.println(b);
        int c= list.get(4);
        System.out.println(c);
        list.remove(3);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
