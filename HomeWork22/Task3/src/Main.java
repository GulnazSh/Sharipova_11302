public class Main {
    public static void main(String args[]) {
        General general = new General();

        Print print = new Print(general);
        MyThread myThread = new MyThread(general);
        myThread.start();
        print.start();



    }
}
