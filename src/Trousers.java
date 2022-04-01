public class Trousers extends Product{
    private int size;
    public Trousers(String name, String brand, double price, int size,String color) {
        super(name, brand, price, color);
        this.size = size;
    }

    @Override
    public void setDiscountForProduct(double currentDiscount,String day) {
        this.setDiscount(currentDiscount);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
