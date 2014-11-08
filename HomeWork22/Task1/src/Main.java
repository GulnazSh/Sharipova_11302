public class Main {
    public static void main(String args[])
    {
        General general= new General();


        try {
            MyThread myThread=new MyThread(general);
            MyThread myThread1=new MyThread(general);
            myThread.start();
            myThread1.start();
            myThread.join();
            myThread1.join();
            System.out.println(general.getCoun());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
