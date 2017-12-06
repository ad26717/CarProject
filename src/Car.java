public class Car {

    private String color;
    private String make;
    private int horsePower;
    private double engineSize;

    public Car(){
        this.color = "White";
        this.make = "Hyundai";
        this.horsePower = 139;
        this.engineSize = 2.4;
    }

    public Car(String color, int horsePower, double engineSize, String make ){
        this.color = color;
        this.make = make;
        this.engineSize = engineSize;
        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        return "Color: " + color + "     HP: " + horsePower  + "     Engine Size: " + engineSize + "     Make: " + make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

}
