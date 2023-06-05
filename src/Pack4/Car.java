package Pack4;

public class Car extends Vehicle{
    protected int acPower = 0;
    public void increaseACPower(){
        acPower = acPower+1;
    }

    @Override
    public void getDetails() {
        System.out.println("Speed: " + speed + ", Engine Capacity: " + engineCapacity + ", Fuel Octane Number" + getFuelOctaneNumber() + ", AC Power: " + acPower + ".");
    }
}
