public abstract class Computer {
    private String operatingSystem;
    private String ram;
    private int storage;

    public boolean turnOn(){
        return true;
    }

    public String bootScreen(){
        return operatingSystem;
    }

    public Computer(String operatingSystem, String ram, int storage) {
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", ram='" + ram + '\'' +
                ", storage=" + storage +
                '}';
    }
}
