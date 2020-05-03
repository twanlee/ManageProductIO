public class Product {
    private String name;
    private String ID;
    private String manufacturer;
    private int price;
    public Product(){};
    public Product(String name, String ID, String manufacturer, int price){
        this.name = name;
        this.ID = ID;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    public String show(){
        return "Name: " + getName() + ". ID: "+ getID() + ". Manufacturer: "+ getManufacturer()+". Price: " + getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
