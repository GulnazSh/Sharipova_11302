import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
       Rating rating= new Rating();
       rating.rand();
       rating.compute(Integer.parseInt(args[0]));

    }
}
