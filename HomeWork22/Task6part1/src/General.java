public class General {

    public synchronized void print1(MyThread thread) {

            System.out.println("print1 start");
            try {
                System.out.println(thread.rand());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("print1 end");

    }

    public synchronized void print2(MyThread thread) {

            System.out.println("print2 start");
            try {
                System.out.println(thread.rand());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("print2 end");

    }

    public synchronized  void print3(MyThread thread) {

            System.out.println("print3 start");
            try {
                System.out.println(thread.rand());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("print3 end");

    }
}
