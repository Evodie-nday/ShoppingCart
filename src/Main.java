import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
//      Product laptop = new Product("Laptop", 1200000);
        list.add(new Product("Laptop", 120000));
        list.add(new Product("Phone", 100000));
        list.add(new Product("Headphones", 70000));
//        list.remove(1);
        int number = 1;
//        for(Product product : list){
//            System.out.println("Product name: " + product.name);
//            System.out.println("Product Price: " + product.price);
//            System.out.println();
//    }
//
for(Product product : list){
    System.out.println(number + " ." + "Product Name: "+ product.name +" " + product.price);
    number++;
}
    }
}
