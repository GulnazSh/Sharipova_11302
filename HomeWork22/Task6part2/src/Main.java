import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        final General general= new General();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1;i++)
                general.print1(new MyThread());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1;i++)
                general.print3(new MyThread());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1;i++)
                general.print2(new MyThread());
            }
        }).start();


    }
}
