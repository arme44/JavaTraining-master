package training.oop.shop;

class CdMusic extends Product {
    private int playLengh;

    public CdMusic(String title, double price, int duration) {
        this.playLengh = duration;
        this.name = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " play time: " + playLengh;
    }
}
