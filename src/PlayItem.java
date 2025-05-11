import java.util.Collection;

public abstract class PlayItem {
    String name;
    double length;

    public abstract double calcRating();

    public boolean isCool()
    {
        return name.toLowerCase().startsWith("x");
    }


    public PlayItem(String name, double length) throws IllegalLength{
        this.name = name;
        setLength(length);
    }

    public abstract double getMinLength();

    public abstract double getMaxLength();

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalLength{
        if( length<getMinLength() || length>getMaxLength())
        {
            throw new IllegalLength("Length is out of range for " + this.getClass() + " The valid range is: " + getMinLength() + " - " + getMaxLength());
        }
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
