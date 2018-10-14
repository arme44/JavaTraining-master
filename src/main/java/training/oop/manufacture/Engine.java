package training.oop.manufacture;

abstract class Engine {
    protected double capacity;
    protected int power_HP;
    protected String gasType;
    protected int rpm;



    abstract void increaseRpm();
    abstract void decreaseRpm();
    abstract String engineInfo();

    @Override
    public String toString() {
        return engineInfo();
    }

}
