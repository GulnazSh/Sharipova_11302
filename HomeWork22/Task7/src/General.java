public class General {

    public void print1() {
        synchronized (new General())
        {
        System.out.println("print1 start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("print1 end");
        }
    }

    public void print2() {
        synchronized (new General())
        {
        System.out.println("print2 start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("print2 end");
        }
    }

    public void print3() {
        synchronized (new General())
        {
        System.out.println("print3 start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("print3 end");
    }
    }
}
