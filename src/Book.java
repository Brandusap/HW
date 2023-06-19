public class Book {
    double price;
    String title;
    String author;

    public Book() {
        price = 100;
        author = "Unknown";
        title = "Unknown";
    }


    public Book(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public double getPrice(){
        return price;
    }
    public String afiseaza(){
        return "Cartea "+title+" are ca autor "+author;
    }
}
