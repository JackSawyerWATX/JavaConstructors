class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle(null);
        Vehicle car = new Vehicle(null);
            bike.setNumberOfWheels(2);
            bike.setColor("red");

        int bikeWheels = bike.getNumberOfWheels();

        String bikeColor = bike.getColor();
            car.setNumberOfWheels(4);
            car.setColor("green");

        int carWheels = car.getNumberOfWheels();

        String carColor = car.getColor();

        System.out.println("Bike object - Wheels: " + bikeWheels + " Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + " Color: " + carColor);

        Vehicle redVehicle = new Vehicle("green");
        String color = redVehicle.getColor();
        System.out.println("The color of the car is: " + color) ;

        Vehicle greenVehicle = new Vehicle("red");
        String color2 = greenVehicle.getColor();
        System.out.println("The color of the bike is: " + color2);
    }
}
