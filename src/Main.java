import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /* EXAMPLE 1:
        Product shirt = new Shirt("Blue cotton shirt","BrandS",14.99,"M","blue");
        Product shirt2 = new Shirt("White cotton shirt","BrandS",15.99,"M","white");
        Product trousers = new Trousers("Black cotton trousers","BrandT",29.99,50,"black");
        Product shoes = new Shoes("Black Leather Shoes","BrandS",59.99,43,"black");
        Product jacket = new Jacket("Black cotton suit Jacket","BrandJ",99.99,50,"black");
        Cart cart = new Cart();
        cart.addProduct(shirt);
        cart.addProduct(shirt2);
        cart.addProduct(trousers);
        cart.addProduct(shoes);
        cart.addProduct(jacket);
        LocalDateTime date = LocalDateTime.now();
        */
        /* EXAMPLE 2:
        LocalDateTime date = LocalDateTime.of(2022,2,1,12,10,10);
        Cart cart = new Cart();
        Product shirt = new Shirt("White Silk Shirt","BrandS",29.99,"L","white");
        Product shirt2 = new Shirt("Black Silk Shirt","BrandS",29.99,"L","black");
        cart.addProduct(shirt);
        cart.addProduct(shirt2);
        */
        // EXAMPLE 3
        LocalDateTime date = LocalDateTime.of(2022,2,1,12,10,10);
        Product trousers = new Trousers("Red Linen Trousers","BrandT",49.99,56,"red");
        Product shoes = new Shoes("Red Suede Shoes","BrandS",59.99,44,"red");
        Product shoes1 = new Shoes("Black Suede Shoes","BrandS",59.99,44,"black");
        Product jacket = new Jacket("Red Linen Suit Jacket","BrandJ",99.99,56,"red");
        Product shirt = new Shirt("White Linen Shirt","BrandS",29.99,"L", "white");
        Cart cart = new Cart();
        cart.addProduct(trousers);
        cart.addProduct(shoes);
        cart.addProduct(shoes1);
        cart.addProduct(jacket);
        cart.addProduct(shirt);
        Cashier cashier = new Cashier();
        cashier.printReceipt(cart,date);
    }
}
