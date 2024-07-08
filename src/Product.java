public class Product {
    private String name;
    private String company;

    public Product(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Product)obj).getName().equals(name) && ((Product)obj).getCompany().equals(company);
    }

}
