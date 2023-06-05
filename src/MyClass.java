import java.util.Scanner;

public class MyClass {

    public void run(){
        int a,b;
        float f1,f2;
        char cFirstName,cLastName;
        boolean istrue = true;
        boolean isfalse = false;
        System.out.println("I was called therefore i run.");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("***Integer***");

        System.out.println("Enter a number:");
        a = myScanner.nextInt();

        System.out.println("Enter another number:");
        b = myScanner.nextInt();

        System.out.println("The sum is: "+ (a + b));

        System.out.println("***Float***");

        System.out.println("Enter a number with a decimal point:");
        f1 = myScanner.nextFloat();

        System.out.println("Enter another number with a decimal point:");
        f2 = myScanner.nextFloat();

        System.out.println("The sum is: "+ (f1+f2));

        System.out.println("***Char***");

        System.out.println("Enter your first name:");
        cFirstName = myScanner.next().charAt(0);

        System.out.println("Enter your last name:");
        cLastName = myScanner.next().charAt(0);

        System.out.println("Your initials are: " + Character.toUpperCase(cFirstName)+Character.toUpperCase(cLastName));

        System.out.println("***Boolean***");

        System.out.println("This sentence is " + istrue + ".");
        System.out.println("This sentence is " + isfalse + ".");
    }

    public String AddStrings(String a, String b){
        return a+b;
    }

}
