public class Main {
    static long th1;
    static long th2;

    public static void main(String args[]) {
         final MyThread2 myThread2 = new MyThread2();
        Thread thread2 = new Thread(myThread2);
        Thread thread1 = new Thread(new MyThread1(myThread2));
        thread2.start();
        thread1.start();

        try {
            thread1.join();
            System.out.println(thread2.getState().toString());
          // synchronized (thread2){thread2.notifyAll();}
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(th2 - th1);


    }
}
