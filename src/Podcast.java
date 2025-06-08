public class Podcast extends ContentItem{
    String category;
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
}
