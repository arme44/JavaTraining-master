package training.oop.manufacture;


import java.util.Date;

class Car {
    private static int carSeriesCounter;

    {
        System.out.println("Static block anonymous");
        VIN_temp = "VIN____" + carSeriesCounter;
        carSeriesCounter++;
    }

    static {
        System.out.println("Static block signature");
        carSeriesCounter = 1_000;
    }

    private String colour;
    private String brand;
    private String model;
    private int yearOfProd;
    private CarSortOf sortOf;
    private int availableSeats;

    private String VIN;
    private static String VIN_temp;

    private boolean isRunning = false;
    private Date startTime;
    private Date stopTime;

    private Engine engine;

    void start() {
        isRunning = true;
        startTime = new Date();
    }

    void stop() {
        isRunning = false;
        stopTime = new Date();
    }

    void workTime() {
        if (isRunning) {
            Date currentTime = new Date();
            long activeSec = currentTime.getTime() - startTime.getTime();
            System.out.println("Active: " + activeSec / 1000);
        } else {
            long startMilis = (startTime == null) ? 0 : startTime.getTime();
            long stopMilis = (stopTime == null) ? 0 : stopTime.getTime();
            long activeSec = stopMilis - startMilis;
            System.out.println("Active: " + activeSec / 1000);
        }
    }

    void runForward() {
    }

    void runBack() {
    }

    void turn(String direction) {
    }

    void speedUp() {
    }

    void speedDown() {
    }

    public Car() {
        this("black", "Ford", "T", 1909,
                CarSortOf.HATCHBACK, 2);
    }

    public Car(String colour, String brand, String model,
               int yearOfProd, CarSortOf sortOf, int availableSeats) {
        this.colour = colour;
        this.brand = brand;
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.sortOf = sortOf;
        this.availableSeats = availableSeats;

        this.VIN = VIN_temp;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car information: ")
                .append("\n\tBrand: ").append(brand)
                .append("\n\tModel: ").append(model)
                .append("\n\tColor: ").append(colour)
                .append("\n\tY of Prod: ").append(yearOfProd)
                .append("\n\tVIN: ").append(VIN);
        return builder.toString();
    }
}