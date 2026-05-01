package Lambda_Expression;
import java.util.List;
public class StreamOperations {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> l = List.of(1, 3, 2, 4, 6, 4, 67, 66, 78, 5, 35, 54, 3);
        l.stream().distinct().sorted().forEach(System.out::println);
        /*l.stream().sorted().toList().forEach(System.out::print);*/
        System.out.println("Square of even elements");
        l.stream().filter(x->x%2==0).map(i->i*i).forEach(System.out::println);

        System.out.println("Odd numbers:- ");
        l.stream().filter(x->x%2!=0).forEach(System.out::println);

        Thread.sleep(2000);
        System.out.println("Mapping in the list:- ");
        l.stream().filter(x->x>60).map(i->i+20).forEach(System.out::println);



    }
}