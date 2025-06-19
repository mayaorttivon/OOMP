import java.util.Comparator;

public class CommercialComparator implements Comparator<PlayItem> {
    @Override
    public int compare(PlayItem o1, PlayItem o2) {
        if( o1 instanceof Commercial && o2 instanceof Commercial)
        {
            return 0;
        }
        else if (o1 instanceof Commercial)
        {
            return -1;
        }
        return 1;
    }

}
