public class MyThread1 implements Runnable {
    private boolean flag = false;

    MyThread1() {
       // new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        Main.th1=System.nanoTime();


    }

    public boolean isFlag() {
        return flag;
    }
}
