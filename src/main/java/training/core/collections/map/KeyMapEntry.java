package training.core.collections.map;

public class KeyMapEntry {

    private Integer key;

    public KeyMapEntry (Integer key) {
        this.key = key;
    }

    @Override
    public int hashCode() {    // psujemy implementację
        return 1;
    }

    @Override
    public boolean equals(Object obj) {   // psujemy implementację
        return true;
    }
}
