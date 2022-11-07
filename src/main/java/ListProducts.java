import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products {
    private List<Product> products = new ArrayList(); // Using this in place of an actual datebase

    public ListProducts() {
        insert(new Product("Hammer", 9.99));
        insert(new Product("Screwdriver", 9.99));
        insert(new Product("Drill", 19.99));
    }

    public List<Product> all() {
        return this.products;
    }

    public void insert(Product product) {
        this.products.add(product);
    }
}
