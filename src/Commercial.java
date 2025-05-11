import java.util.Scanner;

public class Commercial extends PlayItem implements LyricsHandler{

    private final String COOL_PRODUCT = "perfume";
    public static final double MAX_COMMERCIAL_LENGTH = 1.5;
    public static final double MIN_COMMERCIAL_LENGTH = 0.1;


    Product product;

    public Commercial(String name, double length) throws IllegalLength{
        super(name, length);
        this.product = null;
    }

    @Override
    public double getMinLength() {
        return MIN_COMMERCIAL_LENGTH;
    }

    @Override
    public double getMaxLength() {
        return MAX_COMMERCIAL_LENGTH;
    }

    @Override
    public double calcRating() {
        return 0;
    }

    /**
     *
     * @return true if the product name equals to a COOL_PRODUCT
     */
    @Override
    public boolean isCool()
    {
        if( product == null )
            return false;
        return product.getName().toLowerCase().equals(COOL_PRODUCT);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && ((Commercial)obj).getProduct().equals(product);
    }

    @Override
    public void display(String text) throws IllegalLength{

     /*   while (text.length()>100 )
        {
            System.out.println("Commercials should be short! please enter a valid text: ");
            text = new Scanner(System.in).nextLine();
        }*/
        if( text.length()>4 )
        {
            throw new IllegalLength("Commercials should be short! max text length is 100 characters");
        }
        System.out.println(text);
    }
}
