public class Podcast extends ContentItem{
    String category;

    public Podcast(String name, double length, String performer, String category) {
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
}
