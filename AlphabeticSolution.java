import java.util.Scanner;
  public class AlphabeticSolution {

    public static void printAlphabet() {
        for (char i ='A'; i <= 'Z'; i++ ) {
            System.out.println("Uppercase order:");
            System.out.println(i);
        }
        System.out.println();
        for (char i ='a'; i <= 'z'; i++ ) {
            System.out.println("Lowercase order:");
            System.out.println(i);
        }
     }



    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Choose an option which you wanna perform ------>>>>>>>");
        System.out.println("a.) Print alphabet (A - Z) in lowercase & uppercase letters.");

        System.out.println();
        char op = sc.next().charAt(0);
        System.out.print("Option: " +op);
          if (op == 'a' || op == 'A') {
            printAlphabet();
          }
    }
  }