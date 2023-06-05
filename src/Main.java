import Pack1.Animal;
import Pack1.Cat;
import Pack1.Dog;
import Pack2.BankAccount;
import Pack2.InsufficientFundsException;
import Pack3.MyReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> myAnimals = new ArrayList<>();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Cat cat2 = new Cat();
        Dog dog2 = new Dog();
        myAnimals.add(cat1);
        myAnimals.add(dog1);
        myAnimals.add(cat2);
        myAnimals.add(dog2);
        for (Animal animal : myAnimals) {
            animal.makeSound();
            animal.eat();
        }

        //******************************************************

        try {
            int firstNumber;
            int secondNumber;
            int answer;
            Scanner myScanner1 = new Scanner(System.in);
            System.out.println("Divide 2 numbers.");
            System.out.println("Enter the first number:");
            firstNumber = myScanner1.nextInt();
            System.out.println("Enter the second number:");
            secondNumber = myScanner1.nextInt();
            answer = firstNumber / secondNumber;
            System.out.println("The answer is: " + answer );
        }
        catch (ArithmeticException ae) {
            System.out.println("Division by zero is not allowed!");
        }
        catch (InputMismatchException ime) {
            System.out.println("Invalid input! Please enter integers only.");
        }

        //******************************************************

        try {
            System.out.println("Enter an account number:");
            Scanner myScanner2 = new Scanner(System.in);
            BankAccount myAccount = new BankAccount(myScanner2.next());
            System.out.println("Enter amount to deposit:");
            myAccount.deposit(myScanner2.nextDouble());
            System.out.println("The new account balance is: " + myAccount.getBalance());
            System.out.println("Enter amount to withdraw:");
            myAccount.withdraw(myScanner2.nextDouble());
            System.out.println("The new balance is: " + myAccount.getBalance());

        }
        catch (InsufficientFundsException ife) {
            System.out.println(ife.getMessage());
        }

        //******************************************************

        try{
            Scanner myScanner3 = new Scanner(System.in);

            System.out.println("Enter the input file path:");
            String inputFilePath = myScanner3.next();

            BufferedWriter bw = new BufferedWriter(new FileWriter(inputFilePath));
            System.out.println("Enter a sentence to write to the file:");
            myScanner3.nextLine();
            String fileContent = myScanner3.nextLine();
            bw.write(fileContent);
            bw.close();

            MyReader mr = new MyReader();
            mr.readFile(inputFilePath);

            System.out.println("Enter the output file path:");
            String outputFilePath = myScanner3.next();
            ArrayList<String> upperCaseLines = mr.proccessContent(inputFilePath);

            mr.writeFile(upperCaseLines,outputFilePath);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}