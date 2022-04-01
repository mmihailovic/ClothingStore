public abstract class Product {
    private String name;
    private String brand;
    private double price;
    private String color;
    private double discount;

    public Product(String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public abstract void setDiscountForProduct(double currentDiscount,String day);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name +"-" + this.brand + "\n$" + this.price + "\n");
        if(discount > 0) stringBuilder.append("#discount " + (int)(this.discount * 100) + "% - $" + String.format("%.2f",this.price * discount));
        return stringBuilder.toString();
    }
}
