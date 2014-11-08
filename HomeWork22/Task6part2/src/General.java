public class General {

    public void print1(MyThread thread) {
        synchronized (thread) {
            System.out.println("print1 start");
            try {
                System.out.println(thread.rand());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("print1 end");
        }
    }

    public void print2(MyThread thread) {
        synchronized (thread) {
            System.out.println("print2 start");
            try {
                System.out.println(thread.rand());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("print2 end");
        }
    }

    public void print3(MyThread thread) {
        synchronized (thread) {
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
}
