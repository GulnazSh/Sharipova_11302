public class MyThread extends Thread {
     private General general = null;

    public MyThread(General general) {
        this.general = general;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++)
        {
            while (!general.isFlag()){
            }
            general.inc();
            general.setFlag(false);
        }
    }
}
