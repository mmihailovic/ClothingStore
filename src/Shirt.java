public class Shirt extends Product{
    private String size;
    public Shirt(String name, String brand, double price, String size, String color) {
        super(name, brand, price, color);
        this.size = size;
    }

    @Override
    public void setDiscountForProduct(double currentDiscount,String day) {
        if(day.equalsIgnoreCase("TUESDAY"))this.setDiscount(Math.max(currentDiscount,0.1));
        else this.setDiscount(currentDiscount);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
