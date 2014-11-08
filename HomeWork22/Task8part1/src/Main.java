public class Main {
    static long th1;
    static long th2;

    public static void main(String args[]) {
        MyThread1 myThread1 = new MyThread1();
        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(new MyThread2(myThread1));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(th2 - th1);


    }
}
