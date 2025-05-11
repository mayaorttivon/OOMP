public class TestItem extends PlayItem{

    public TestItem(String name, double length) throws IllegalLength {
        super(name, length);
    }

    @Override
    public double calcRating() {
        return 0;
    }

    @Override
    public double getMinLength() {
        return 0;
    }

    @Override
    public double getMaxLength() {
        return 0;
    }
}
