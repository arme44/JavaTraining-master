package training.oop.shop;

class eBook extends Book implements Downloadable {

    public eBook(String name, double price, int pages) {
        super(name, price, pages);
    }


    @Override
    public void download() {
        System.out.println("Downloading .....");
    }
}