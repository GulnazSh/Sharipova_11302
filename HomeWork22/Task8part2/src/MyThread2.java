public class MyThread2 implements Runnable {
    private MyThread1 thread;
    MyThread2()
    {
       // this.thread=thread;
        //new Thread(this).start();
    }

    @Override
    public void run() {
        synchronized (this)
        {
        try {
            System.out.println("Второй поток start");
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.th2=System.nanoTime();
        System.out.println("Второй поток завершился");
        }
    }

    public void bl()
    {
        notifyAll();
    }
}
