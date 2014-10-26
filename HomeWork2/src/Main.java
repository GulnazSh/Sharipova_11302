import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args)
    {
        try
        {
        BufferedReader reader= new BufferedReader(new FileReader("src\\log-pass"));
            String temp[]= new String[2];
            for(int i=0; i<temp.length;i++)
            {
                temp[i]=new String("");
                boolean f=true;
                while(reader.ready())
                {
                  String e=String.valueOf((char) reader.read());
                  if(!e.equals(" ")&&!e.equals("\n")&&!e.equals("\r"))
                  {
                   temp[i]+=e;
                    f=false;
                  }
                    else
                  {
                      if(!f)
                          break;
                  }
                }

            }

           new CheckUser(temp[0],temp[1]).check();
        }
        catch (Exception e)
        {
            System.err.println(e);
        }

    }
}
