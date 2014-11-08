public class Print extends Thread {
    private General general = null;

    Print(General general) {
        this.general = general;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            while (general.isFlag())
            {
            }
            System.out.println(general.getCount());
            general.setFlag(true);
        }
    }
}
