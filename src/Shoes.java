public class Shoes extends Product{
    private int size;
    public Shoes(String name, String brand, double price, int size,String color) {
        super(name, brand, price, color);
        this.size = size;
    }

    @Override
    public void setDiscountForProduct(double currentDiscount,String day) {
        if(day.equalsIgnoreCase("TUESDAY"))this.setDiscount(Math.max(currentDiscount,0.25));
        else this.setDiscount(currentDiscount);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
