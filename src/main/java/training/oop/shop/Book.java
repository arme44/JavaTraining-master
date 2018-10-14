package training.oop.shop;

class Book extends Product {
    private int pages;

    public Book(String name, double price, int pages) {
        this.pages = pages;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " pages: " + pages;
    }
}
