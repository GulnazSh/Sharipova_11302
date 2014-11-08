public class MyThread extends Thread {
    General general = null;
    int max=0;

    public MyThread(General general, int max) {
        this.general = general;
        this.max=max;
    }

    @Override
    public void run() {
        for(int i=0; i<max; i++)
        {
           general.inc();
        }
    }
}
