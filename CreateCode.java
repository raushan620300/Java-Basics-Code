import java.util.Scanner;
import java.time.LocalDateTime;

public class CreateCode {
  public static void squareSolution() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter side: ");
    float side = sc.nextFloat();
    float area = side * side;
    float perimeter = 4 * side;
    System.out.println("Area:" + area + "\n" + "Perimeter:" + perimeter);
  }

  public static void rectangleSolution() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length: ");
    float len = sc.nextFloat();
    System.out.print("Enter breadth: ");
    float bre = sc.nextFloat();
    float area = len * bre;
    float perimeter = 2 * (len + bre);
    System.out.println("Area: " + area + "\n" + "Perimeter: " + perimeter);
  }

  public static void circleSolution() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius: ");
    double rad = sc.nextDouble();
    double area = 3.14 * rad * rad;
    double perimeter = 2 * 3.14 * rad;
    // System.out.println("Area: ");
    // System.out.format("%.2f", area);
    // System.out.println("Perimeter: ");
    // System.out.format("%.2f", perimeter);
    System.out.println(
        "Area: " + String.format("%.2f", area) + "\n" + "Perimeter: " + String.format("%.2f", perimeter));
  }

  public static void swappingNumbers() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input first no.: ");
    float a = sc.nextFloat();
    System.out.print("Input second no.: ");
    float b = sc.nextFloat();
    System.out.println("Before swapping --");
    System.out.println("First no.: " + a + "\n" + "Second no.: " + b);
    float temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping --");
    System.out.println("First no. " + a + "\n" + "Second no.: " + b);
  }

  public static void factorialSolution() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no.: ");
    int num = sc.nextInt();
    int fact = 1; // Take a value 1 for muultilpy with iterator
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    System.out.println("Fcatorial: " + fact);
  }

  public static void solutionPrimeorNonPrime() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no.: ");
    int num = sc.nextInt();
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      System.out.println("Prime no.");
    } else {
      System.out.println("Non-Prime no.");
    }
  }

  public static void solutionMaxOrMin() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input first no.: ");
    int a = sc.nextInt();
    System.out.print("Input second no.: ");
    int b = sc.nextInt();
    if (a > b) {
      System.out.println("Maximum no.:" + a);
      System.out.println("Minimum no.:" + b);
    } else {
      System.out.println("Maximum no.:" + b);
      System.out.println("Minimum no.:" + a);
    }
  }

  public static void printTable() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no.: ");
    int num = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      int result = num * i;
      System.out.println(num + " * " + i + " = " + result);
    }
  }

  public static void printTotalSum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no.: ");
    int num = sc.nextInt();
    int sum = 0; // Take a value sum from '0' because of sum
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.println("Total sum: " + sum);
  }

  public static void printSimpleInterest() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Principal: "); // Principal of S.I
    double p = sc.nextDouble();
    System.out.print("Enter Rate: "); // Ratel of S.I
    double r = sc.nextDouble();
    System.out.print("Enter Time: "); // Time of S.I
    double t = sc.nextDouble();
    double si = (p * r * t) / 100;
    System.out.println("S.I: " + si);
  }

  public static void currentDateTime() {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }

  // Function of Standard Calculator
  public static void standardCalculator() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input first no.: ");
    double num_1 = sc.nextDouble();
    System.out.print("Input second no.: ");
    double num_2 = sc.nextDouble();
    double result;
    System.out.print("Choose n operator(+,-,*,/): ");
    char op = sc.next().charAt(0);
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
        System.out.println("Wrong choice!");
        break;
    }
  }

  public static void marksheetSolution() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks of subjects ----->");
    System.out.print("Maths: ");
    double marks1 = sc.nextDouble();
    System.out.print("English: ");
    double marks2 = sc.nextDouble();
    System.out.print("English: ");
    double marks3 = sc.nextDouble();
    System.out.print("Hindi: ");
    double marks4 = sc.nextDouble();
    System.out.print("Science: ");
    double marks5 = sc.nextDouble();
    // For total marks--
    double totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
    // For percentage marks & all subjects total marks--(100*5)--
    double percentageMarks = (totalMarks / 500) * 100;
    System.out.println("Students`s` Marksheet ---");
    System.out.print("Total marks:" + totalMarks);
    System.out.println();
    System.out.print("Percentage:" + String.format("%.2f", percentageMarks));
  }

  public static void findSolution() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the character by user: ");
      char ch = sc.next().charAt(0);
        if(ch >= 'a' || ch <= 'z' || ch >= 'A' || ch <= 'Z') {
          System.out.println("Alphabetic character");
        } else if (ch >= '!' || ch <= '*') {
            System.out.println("Symbolic character");
        }  else {
          System.out.println("Numberical character");
        }
  }

  /* Function for find the no. is Armstrong or not */
  public static void findArmstrong() {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a three digit no.: ");
      int num = sc.nextInt();
      int temp = num;
      int rem, result=0;
        while (temp != 0) {
          rem = temp%10;
          result += rem*rem*rem;
          temp /= 10;
        }
        if (result == num) {
          System.out.println("Armstrong no.");
        } else {
          System.out.println("Not Armstrong no.");
        }
  }

  /* This is the main function to perform all upper functions */
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("You can choose the question and find them answers --->");
    System.out.println();
    System.out.println("a. Find Area & Perimeter of Square.");
    System.out.println("b. Find Area & Perimeter of Rectangle.");
    System.out.println("c. Find Area & Perimeter of Circle.");
    System.out.println("d. Swapping the numbers.");
    System.out.println("e. Find factorial of the number.");
    System.out.println("f. Find number is Prime or Non-prime.");
    System.out.println("g. Find maximum or minimum number between two numbers. ");
    System.out.println("h. Print the table of the given number.");
    System.out.println("i. Print total sum of a number in the given range.");
    System.out.println("j. Find Simple Interest(S.I)");
    System.out.println("k. Your current Date & Time.");
    System.out.println("l. Solve your problem with standard calculator.");
    System.out.println("m. Find total marks & percentage of total subjects.");
    System.out.println("n. Find the character which is inputted by you/user.");
    System.out.println("o. Find the number is Armstrong or not.");
      char function = sc.next().charAt(0);
    /* Choose a alpha-number which you wanna perform */

      if (function == 'a' || function == 'A') {
        squareSolution();
      } else if (function == 'b' || function == 'B') {
        rectangleSolution();
      } else if (function == 'c' || function == 'C') {
        circleSolution();
      } else if (function == 'd' || function == 'D') {
        swappingNumbers();
      } else if (function == 'e' || function == 'E') {
        factorialSolution();
      } else if (function == 'f' || function == 'F') {
        solutionPrimeorNonPrime();
      } else if (function == 'g' || function == 'G') {
        solutionMaxOrMin();
      } else if (function == 'h' || function == 'H') {
        printTable();
      } else if (function == 'i' || function == 'I') {
        printTotalSum();
      } else if (function == 'j' || function == 'J') {
        printSimpleInterest();
      } else if (function == 'k' || function == 'K') {
        currentDateTime();
      } else if (function == 'l' || function == 'L') {
        standardCalculator();
      } else if (function == 'm' || function == 'M') {
        marksheetSolution();
      } else if (function == 'n' || function == 'N') {
        findSolution();
      } else if (function == 'o' || function == 'O') {
        findArmstrong();
      }
        else {
         System.out.println("Wrong choice");
        }
  }
}