import java.util.Scanner;
import java.time.LocalDateTime; //here, we import date & time for the userg

public class Practice {
    public static int getCharacterOrDigit() { // Function for getting the input character is digit or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Input character: ");
        char ch = sc.next().charAt(0);
        if (ch >= '0' && ch <= '9') {
            System.out.println("It`s a digit");
        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '!' && ch <= '*') {
            System.out.println("It`s a character:)");
        } else {
            System.out.println("Error typing!");
        }
        return 0;
    }

    public static int getVowelOrConsonant() { // Function for getting the input character is vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("Input character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("It`s a Vowel");
        } else {
            System.out.println("It`s a Consonant");
        }
        return 0;
    }

    public static int getCalculator() { // Function for getting the solution of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first no.= ");
        double num_1 = sc.nextDouble();
        System.out.print("Input second no.= ");
        double num_2 = sc.nextDouble();
        System.out.print("Choose an operator which you wanna use(+,-,*,/): ");
        char op = sc.next().charAt(0);
        // take a variable where you`ll store the result of that permoforming function--
        double result;
        switch (op) {
            case '+':
                result = num_1 + num_2;
                System.out.print("Addition: " + result);
                break;
            case '-':
                result = num_1 - num_2;
                System.out.print("Subtraction: " + result);
                break;
            case '*':
                result = num_1 * num_2;
                System.out.print("Multiplication: " + result);
                break;
            case '/':
                result = num_1 / num_2;
                System.out.print("Division: " + result);
                break;

            default:
                System.out.println("Something Error!");
                break;
        }
        return 0;
    }

    public static double getSimpleInterest() { // Function for getting the SimpleInterest
        Scanner sc = new Scanner(System.in);
        System.out.print("Input principal= ");
        double p = sc.nextDouble();
        System.out.print("Input rate= ");
        double r = sc.nextDouble();
        System.out.print("Input time= ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        return si;
    }

    public static void getTable() { // Function for getting the table of inputted no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }

    public static void getLocalDateTime() { // Function for getting the local date time
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
    }

    public static void getEvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even no.");
        } else {
            System.out.println("Odd no.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Here, you can choose function which you wanna use--
        System.out.print("Choose a function to perform(a/b/c) --- ");
        System.out.println("\n");
        System.out.println("a) Find the character is Digit or Character.");
        System.out.println("b) Find the character is Vowel or Consonant.");
        System.out.println("c) Calculate the solution of two numbers.");
        System.out.println("d) Find Simple Interest.");
        System.out.println("e) Find the Table.");
        System.out.println("f) Know your Current Date & Time.");
        System.out.println("g) Find Even or Odd.");
        char function = sc.next().charAt(0);
        if (function == 'a') {
            System.out.println(getCharacterOrDigit());
        } else if (function == 'b') {
            System.out.println(getVowelOrConsonant());
        } else if (function == 'c') {
            System.out.println(getCalculator());
        } else if (function == 'd') {
            System.out.println("S.I: " +getSimpleInterest());
        } else if (function == 'e') {
            getTable();
        } else if (function == 'f') {
            getLocalDateTime();
        } else if (function == 'g') {
            getEvenOrOdd();
        } else {
            System.out.println("Error! 404");
        }
    }
}
