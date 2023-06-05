package Pack1;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat moews");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}
