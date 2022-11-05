public class Book {
    
    private String name;
    private int productNum;
    private double price;
    private int quantity;


    Book(String name, int productNum, double price, int quantity) {
        this.name = name;
        this.productNum = productNum;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return this.name; }
    public int getProductNum() { return this.productNum; }
    public double getPrice() { return this.price; }
    public int getQuantity() { return this.quantity; }



    public String toString() {
        return String.format("%-27s   %-14s   $%6s   %8s",
        this.name, this.productNum, this.price, this.quantity);
    }

}
