package Pack4;

public class Vehicle extends MeansOfTransport {
        private int fuelOctaneNumber = 98;

    public int getFuelOctaneNumber() {
        return fuelOctaneNumber;
    }

    public void getDetails() {
        System.out.println("Speed: " + speed + ", Engine Capacity: " + engineCapacity + ", Fuel Octane Number" + fuelOctaneNumber);
    }
}
