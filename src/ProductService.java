import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    List<Product> productsByDate = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for(Product p : products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductByText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();

            if(name.contains(str) || type.contains(str) || place.contains(str)){
                prods.add(p);
            }
        }
        return prods;
    }

    public List<Product> getProductByDate(int year) {
        for(Product p : products){
            if(p.getWarrenty() <= year){
                productsByDate.add(p);
            }
        }
        return productsByDate;
    }
}
