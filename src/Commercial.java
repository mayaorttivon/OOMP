import java.util.Scanner;

public class Commercial extends PlayItem implements LyricsHandler {

    private final String COOL_PRODUCT = "perfume";

    Product product;

    public Commercial(String name, double length) {
        super(name, length);
        product = null;
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
    public void display(String text) {

        while (text.length()>100 )
        {
            System.out.println("Commercials should be short! please enter a valid text: ");
            text = new Scanner(System.in).nextLine();
        }
        System.out.println(text);
    }
}
