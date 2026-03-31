package MultiThreading;
public class B extends Thread{
    @Override
    public void run(){
        for(int j=1;j<=10;j++){
            if(j%2==0){
                System.out.println("Thread 2:-" +j);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
