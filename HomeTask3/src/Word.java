
public class Word {
    private String word;
    private int amount;
    public int getAmount() {
        return amount;
    }

    public String getWord() {
        return word;
    }


    public Word(String word)
    {
        this.word=word;
        amount=1;
    }
    public void count()
    {
        amount++;
    }

    @Override
    public String toString() {
        return getWord()+" "+getAmount();
    }
}
