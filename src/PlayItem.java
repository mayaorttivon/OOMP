import java.util.Collection;

public abstract class PlayItem {
    String name;
    double length;
    double maxLength;
    double minLength;
    public abstract double calcRating();

    public boolean isCool()
    {
        return name.toLowerCase().startsWith("x");
    }

    public PlayItem(String name, double length) throws IllegalLength{
        this.name = name;
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalLength{
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return ((PlayItem)obj).getName().equals(name) && ((PlayItem)obj).getLength()==length;
    }
}
