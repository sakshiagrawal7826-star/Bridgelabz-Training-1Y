package Lambda_Expression;

public class Prac2 {
    public static void main(String[] args) {
        Runnable r1=()->{
            System.out.println("First");
        };
        Thread t1=new Thread(r1);
        t1.start();
        Runnable r2=()->{
            for (int i=1; i<6; i++) {
                System.out.print(" "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2=new Thread(r2);
        t2.start();;
    }
}