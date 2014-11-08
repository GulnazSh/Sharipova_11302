public class Main {
    public static void main(String args[]) {
        final General general= new General();
        new Thread(new Runnable() {
            @Override
            public void run() {

                general.print1(new MyThread());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                general.print3(new MyThread());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                general.print2(new MyThread());
            }
        }).start();


    }
}
