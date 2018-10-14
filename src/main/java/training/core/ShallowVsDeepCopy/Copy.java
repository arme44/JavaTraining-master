package training.core.ShallowVsDeepCopy;

public class Copy {

    public static void main(String[] args) {
        Person father = new Person("John", new Address("B-stok", "KEN", 12));
        Person son = new Person(father);
        son.setName("William");
        System.out.println(father);
        System.out.println(son);
        son.getAddress().setCity("Wawa");
        son.getAddress().setStreet("Rondo ONZ");
        son.getAddress().setNumber(125);
        System.out.println("----------------------------------");
        System.out.println(father);
        System.out.println(son);
    }
}
