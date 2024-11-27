public class Book {
    String title = " ";
    String author = " ";
    double price;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }
    // dp = discount percentage (double)
    //The discount percentage must be greater
    // than 0.00 and less than 100.00.
    public double applyDiscount(double dp){
        if(dp > 0.00 && dp < 100.00){
            price = price - (price * (dp/100));
        }
        else System.out.println("                 invalid discount");
        return price;
    }
}

