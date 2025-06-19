import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Podcast extends ContentItem{
    String category;
    File text;

    public void setText(File text) {
        this.text = text;
    }

    public static final double MAX_PODCAST_LENGTH = 60;
    public static final double MIN_PODCAST_LENGTH = 30;

    public Podcast(String name, double length, String performer, String category)  throws IllegalLength{
        super(name, length, performer);
        this.category = category;
    }

    @Override
    public double calcRating() {
        return 0;
    }

    @Override
    public boolean isCool() {
        return super.isCool() || category.equals("Programming");
    }

    @Override
    public double getMinLength() {
        return MIN_PODCAST_LENGTH;
    }

    @Override
    public double getMaxLength() {
        return MAX_PODCAST_LENGTH;
    }

    public boolean hasReferenceToLove()
    {
        try {
            FileReader fr = new FileReader(text);
            Scanner sc = new Scanner(fr);
            while(sc.hasNext())
            {
                if(sc.next().toLowerCase().equals("love"))
                {
                    fr.close();
                    return true;
                }
            }
            fr.close();
            return false;
        }
        catch (IOException ioe)
        {
            return false;
        }
    }
}
