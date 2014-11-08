import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String args[]) {
        final Object o = new Object();
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    try {

                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Первый поток завершился!");
                }
            }
        });
        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    try {

                        Thread.sleep(2000);
                        o.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });


        Executor dExecutor= Executors.newFixedThreadPool(2);
        dExecutor.execute(thread1);
        dExecutor.execute(thread2);


    }
}
