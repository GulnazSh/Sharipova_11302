import java.io.*;
import java.util.*;

public class Rating {

    private String[] s = {"Hello", "apple", "google", "welcome", "phone", "mac"};
    private int rating;

    public Rating() {

    }

    public void compute(int rating) {
        this.rating = rating;

        HashMap<String, Word> words = new HashMap<String, Word>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("src\\log-pass"));

            boolean flag = reader.ready();
            while (flag) {
                String temp = "";
                boolean f = true;
                while (flag) {
                    String e = String.valueOf((char) reader.read());
                    if (!e.equals(" ") && !e.equals("\n")&& !e.equals("\r")) {
                        temp += e;
                        f = false;
                    } else {
                        if (!f)
                            break;
                    }

                    if (!reader.ready())
                        flag = false;
                }

                if (temp.length() > 3) {
                    if (!words.containsKey(temp)) {
                        Word w = new Word(temp);
                        words.put(temp, w);
                    } else {
                        Word w = words.get(temp);
                        w.count();

                    }
                }


            }


        } catch (Exception e) {
            System.err.println(e);
        }
        ArrayList<Word> x=new ArrayList<Word>();
        x.addAll(words.values());
        Collections.sort(x,new CompAmount());
        int i=0;
        Iterator<Word> iterator=x.iterator();
        while (iterator.hasNext()&&i<rating)
        {
            System.out.println(iterator.next());
             i++;
        }

    }

    public void rand() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("src\\log-pass"));
            Random random = new Random();

            for (int i = 0; i < 1000; i++)
                writer.write(s[random.nextInt(s.length-1)] + " ");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
