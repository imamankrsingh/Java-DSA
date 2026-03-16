class Library {

    private String title;
    private String author;
    private double price;

    Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void showBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class LibraryMain {

    public static void main(String[] args) {

        Library b1 = new Library("Java Programming", "James Gosling", 500);

        b1.showBookDetails();

        b1.setPrice(600);

        System.out.println("Updated Price: " + b1.getPrice());

    }

}