import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task3 {

    static Scanner in;
    static HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please run the program with path of file and size of top!");
            System.exit(0);
        }

        File file = new File(args[0]);
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Wrong path to file!");
            System.exit(0);
        }


        int topSize = Integer.parseInt(args[1]);
        if (topSize < 1) {
            System.out.println("Too small size fo top!");
            System.exit(0);
        }

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            for (String word: words) {
                if (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
                    word = word.substring(0, word.length() - 1);
                }
                if (word.length() >= 3) {
                    word = word.toLowerCase();
                    if (dictionary.containsKey(word)) {
                        dictionary.put(word, dictionary.get(word) + 1);
                    } else {
                        dictionary.put(word, 1);
                    }
                }
            }
        }

        ArrayList<HashMap.Entry<String, Integer>> top = new ArrayList<HashMap.Entry<String, Integer>>(dictionary.entrySet());
        top.sort(new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("TOP " + topSize + ":");
        for (int i = 0; i < Math.min(topSize, top.size()); i++) {
            System.out.println((i + 1) + ". " + top.get(i).getKey() + " (" + top.get(i).getValue() + ")");
        }
    }
}
