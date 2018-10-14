package training.core;

public enum Day {
    MONDAY(1, "pon"),
    TUESDAY(2, "wt"),
    WEDNESDAY(3, "śr"),
    THURSDAY(4, "czw"),
    FRIDAY(5, "pt"),
    SATURDAY(6, "sob"),
    SUNDAY(7, "ndz");

    private int dayNumber;
    private String shortName;

    Day(int dayNumber, String shortName) {
        this.dayNumber = dayNumber;
        this.shortName = shortName;
    }

    public void dayNumber() {
        System.out.println("Number of day: " + dayNumber);
    }

    public void shortName() {
        System.out.println("Short name: " + shortName);
    }


    @Override
    public String toString() {
        String nameLower = super.toString().toLowerCase();
        Character firstLetter = nameLower.toUpperCase().charAt(0);

        String finalName = firstLetter + nameLower.substring(1);
        return finalName;
    }
}
