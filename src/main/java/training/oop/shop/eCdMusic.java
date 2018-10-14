package training.oop.shop;

class eCdMusic extends CdMusic implements Downloadable {
    public eCdMusic(String title, double price, int duration) {
        super(title, price, duration);
    }

    @Override
    public void download() {
        System.out.println("Downloading .....");
    }
}
