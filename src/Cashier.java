import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cashier {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public void printReceipt(Cart cart, LocalDateTime dateTime){
        System.out.println("Date: " + dateTime.format(formatter));
        System.out.println("\n ---Products---\n");
        double discountPercentage = 0;
        double discount = 0;
        double price = 0;
        String day = dateTime.getDayOfWeek().toString();
        if(cart.getProductList().size() >= 3)
            discountPercentage = 0.2;
        for(Product product: cart.getProductList()){
            product.setDiscountForProduct(discountPercentage,day);
            price += product.getPrice();
            discount += Math.round(product.getDiscount() * product.getPrice() * 100.0) / 100.0; // 2 decimals
            System.out.println(product);
        }
        System.out.println("--------------------------\n");
        System.out.println("SUBTOTAL: $" + String.format("%.2f",price));
        System.out.println("DISCOUNT: -$" + String.format("%.2f",discount));
        System.out.println("\nTOTAL: $" + String.format("%.2f",price - discount));

    }
}
