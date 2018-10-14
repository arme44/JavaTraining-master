package training.oop.manufacture;

public class GasEngine extends Engine implements Catalyst {

    private boolean lpgAvailable = false;

    public GasEngine(int power, double capacity) {

        this.capacity = capacity;
        this.lpgAvailable = lpgAvailable;
        this.power_HP = power;
        this.gasType = "gasoline";
        this.rpm = 0;
    }

    @Override
    void increaseRpm() {
        rpm+=350;
    }

    @Override
    void decreaseRpm() {
        rpm-=350;
    }

    @Override
    String engineInfo() {
        StringBuilder sb = new StringBuilder("Gasoline engine");
        sb.append("\n\tPowe: ").append(power_HP)
                .append("\n\tCapacity: ").append(capacity).append("L")
                .append("\n\tLpg system: ").append(lpgAvailable);

        return sb.toString();
    }

    void activatedLpgSystem() {
        lpgAvailable = true;
    }

    @Override
    public void cleanExhaust() {
        System.out.println("In progress ...");
    }
}
