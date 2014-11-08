public class MyThread1 implements Runnable {
      MyThread2 myThread2=null;

    MyThread1(MyThread2 myThread2) {
        this.myThread2=myThread2;
       // new Thread(this).start();
    }

    @Override
    public void run() {
         synchronized (myThread2)
         {
        try {
            System.out.println("First поток start");
            Thread.sleep(2000);
           myThread2.notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Main.th1=System.nanoTime();
         }
        System.out.println("First поток end");

    }


}
