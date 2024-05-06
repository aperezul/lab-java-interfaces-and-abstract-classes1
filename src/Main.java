import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest hundredth.
        // For example, 4.2545 should return 4.25.

        BigDecimal a = new BigDecimal("4.2545");
        BigDecimal b = a.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Returns a double of the BD to nearest 100:  " + b);

        //Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive, the result should be negative and vice versa),
        // rounds the number to the nearest tenth and returns the result.
        // For example, 1.2345 should return -1.2 and -45.67 should return 45.7.

        BigDecimal c = new BigDecimal("1.2345");
        BigDecimal d = c.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println("Returns a negative value rounded to nearest tenth " + d.negate());
        BigDecimal e = new BigDecimal("544.54544465465464659");
        BigDecimal f = e.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println("Returns a huge negative number " + f.negate());

        System.out.println(" Adding them all just because: " + b + d + f);

        //Exercise2

        public static void car() {

            Sedan sedan = new Sedan("123456", "Toyota", "Camry", 50000);
            UtilityVehicle utilityVehicle = new UtilityVehicle("789012", "Ford", "Explorer", 60000, true);
            Truck truck = new Truck("345678", "Chevrolet", "Silverado", 70000, 10000.0);

            System.out.println(sedan.getInfo());
            System.out.println(utilityVehicle.getInfo());
            System.out.println(truck.getInfo());
        }
            }
        }



    /*
    Suppose you are building a car inventory system. All cars have a vinNumber, make, model and mileage. But no car is just a car. Each car is either a Sedan, a UtilityVehicle or a Truck.
    Create an abstract class named Car and define the following properties and behaviors:
    vinNumber: a String representing the VIN number of the car
    make: a String representing the make of the car
    model: a String representing the model of the car
    mileage: an int representing the mileage of the car
    getInfo(): a method that returns a String containing all of the car's properties in a readable format
    Create three classes that extend Car: Sedan, UtilityVehicle and Truck.
    UtilityVehicle objects should have an additional fourWheelDrive property, a boolean that represents whether the vehicle has four-wheel drive.
    Truck objects should have an additional towingCapacity property, a double that represents the towing capacity of the truck.
    */







