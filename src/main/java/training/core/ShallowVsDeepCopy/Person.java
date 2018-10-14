package training.core.ShallowVsDeepCopy;

public class Person {

    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person(Person origin) {
        this.name = new String(origin.name);
        Address adr = origin.getAddress();
        this.address = new Address(adr.getCity(), adr.getStreet(), adr.getNumber()); // głęboka kopia nowy obiekt alokuję w pamięci
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", address= " + address + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

