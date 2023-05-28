import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    List<Product> productsByPlace = new ArrayList<>();

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

    public List<Product> getProductByPlace(String placeName) {
        for(Product p : products){
            if(p.getPlace().equals(placeName)){
                productsByPlace.add(p);
            }
        }
        return productsByPlace;
    }
}
