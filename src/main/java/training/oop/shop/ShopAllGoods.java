package training.oop.shop;

import java.util.LinkedList;
import java.util.List;

/**
 * polimorfizm pozwala na traktowanie jako jeden rodzaj: Produkt, wszystkich obiektów a traktować
 * szczególnie gdy jest to wymagane
 */
class ShopAllGoods {

    public static void main(String[] args) {
        List<Product> allGoods = new LinkedList<>();

        //let's add new fancy products to sell list
        allGoods.add(new Book("Java", 99.9, 900));
        allGoods.add(new Book("Hibernate", 109.9, 450));
        allGoods.add(new eBook("JSP", 39.9, 50));
        allGoods.add(new eBook("Spring Boot", 31.9, 130));
        allGoods.add(new CdMusic("Dark side of the Moon", 11.9, 76));
        allGoods.add(new CdMusic("Wall", 25.99, 87));
        allGoods.add(new eCdMusic("Enjoy the silence", 3.99, 3));
        allGoods.add(new eCdMusic("Walk in my shoes", 3.99, 4));

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Show all books:");
        for (Product p : allGoods) {
            if (p instanceof Book) {
                System.out.println(p);
            }
        }

        System.out.println("----------------------------------------------------------------------");
        List<Downloadable> toDownload = new LinkedList<>();
        System.out.println("Show all web stuff");
        for (Product p : allGoods) {
            if (p instanceof Downloadable) {
                System.out.println(p);
                toDownload.add((Downloadable) p);
            }
        }

        for (Downloadable d : toDownload) {
            System.out.println("Start");
            d.download();
            System.out.println("Completed");
        }

    }

}