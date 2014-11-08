
public class General {
    private int  coun=0;

    public synchronized void inc() {
        coun++;
    }


    public int getCoun() {
        return coun;
    }
}
