class Mobile {

    private String brand;
    private int price;

    
    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price!");
        }
    }

    
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        
        Mobile m1 = new Mobile("Samsung", 20000);

    
        m1.showDetails();

        m1.setPrice(25000);

        System.out.println("Updated Price: " + m1.getPrice());
    }
}