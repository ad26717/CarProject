public class CarDriver {

    public static void main(String [] args){

        // Create myCar
        Car myCar = new Car();
        // Create hisCar
        Car hisCar = new Car("Black", 400, 3.5, "Honda");
        // Create herCar
        Car herCar = new Car("Pink", 300, 2.5, "Volkswagen");

        // Print initialized myCar values
        System.out.println(myCar);
        // Print herCar values according to parameters
        System.out.println(herCar);
        // Print hisCar values according to parameters
        System.out.println(hisCar);

        // Set myCar values
        myCar.setHorsePower(650);
        myCar.setEngineSize( 6.5 );
        myCar.setColor("Blue");
        myCar.setMake("Ferrari");

        // Set hisCar Values
        hisCar.setEngineSize( 6.5 );
        hisCar.setHorsePower(650);
        hisCar.setColor("Blue");
        hisCar.setMake("Ferrari");

        // Set herCar Values
        herCar.setEngineSize( 6.5 );
        herCar.setHorsePower(650);
        herCar.setColor("Blue");
        herCar.setMake("Ferrari");

        // Print out the results after new values were set using getters
        System.out.println("Color:" + myCar.getColor() + "    HP:" + myCar.getHorsePower()  +
                "    Engine Size:" + myCar.getEngineSize() + "    Make:" + myCar.getMake());

    }
}
