import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // Hey, service add the Product ...
        //Product p = new Product("Asus Tuf", "laptop", "brown table", 2022);
        //service.addProduct(p);
        //------------------same
        service.addProduct(new Product("Asus Tuf", "laptop", "brown table", 2022));
        service.addProduct(new Product("Mac", "laptop", "black table", 2024));
        service.addProduct(new Product("mixer", "device", "white table", 2025));
        service.addProduct(new Product("pad", "cable", "brown table", 2029));
        service.addProduct(new Product("cable", "cable", "black table", 2024));
        service.addProduct(new Product("black beast", "bag", "brown table", 2023));
        service.addProduct(new Product("apple mouse", "mouse", "white table", 2022));
        service.addProduct(new Product("my mouse", "mouse", "brown table", 2030));
        service.addProduct(new Product("charger", "charger", "white table", 2030));
        service.addProduct(new Product("mi 11 lite", "phone", "brown table", 2025));
        service.addProduct(new Product("phone charger", "charger", "black table", 2024));
        service.addProduct(new Product("documents", "paper", "brown table", 2023));
        service.addProduct(new Product("java book", "book", "white table", 2028));
        service.addProduct(new Product("ear buds", "buds", "brown table", 2069));

        List<Product> products = service.getAllProducts();
//        print all the products
//        System.out.println(products);
//        for(Product p : products){
//            System.out.println(p);
//        }
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("A particular Product");
        Product p = service.getProduct("black beast");
        System.out.println(p);
    }
}