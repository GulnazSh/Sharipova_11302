import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.print("Enter the number of threads:");
        Scanner scanner = new Scanner(System.in);
        int th=scanner.nextInt();
        System.out.print("Enter the number of iterations:");
        int it=scanner.nextInt();
        General general = new General();


        try {
            int active=Thread.activeCount();
            for(int i=0; i<th; i++)
            {
                MyThread myThread = new MyThread(general,it);
                myThread.start();
            }


            while ((Thread.activeCount()-active)!=0)
            {
            }
               System.out.println(general.getCoun());



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
