public class MyThread2 implements Runnable {
    private MyThread1 thread;
    MyThread2(MyThread1 thread)
    {
        this.thread=thread;
        //new Thread(this).start();
    }

    @Override
    public void run() {
         while (!thread.isFlag())
         {

         }
        Main.th2=System.nanoTime();
        System.out.println("Второй поток завершился");

    }
}
