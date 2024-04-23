public class Laptop extends Computer{
private int batteryLifeHrs;
    public Laptop(String operatingSystem, String ram, int storage) {
        super(operatingSystem, ram, storage);
    }

    public Laptop(String operatingSystem, String ram, int storage, int batteryLifeHrs) {
        super(operatingSystem, ram, storage);
        this.batteryLifeHrs = batteryLifeHrs;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryLifeHrs=" + batteryLifeHrs +
                '}';
    }
}
