public class MyThread extends Thread {
    General general = null;

    public MyThread(General general) {
        this.general = general;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++)
        {
            general.inc();
        }
    }
}
