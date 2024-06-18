// import java.util.Scanner;

// /**
//  * Function
//  */
// public class Function {
//     public static int Swapping(int num_1, int num_2) {
//         int temp = num_1;
//         num_1 = num_2;
//         num_2 = temp;
//         System.out.println("---After Swapping---");
//         System.out.println("First no.:" +num_1);
//         System.out.println("Second no.:" +num_2);
//         return 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);        /* Swapping two numbers */
//         System.out.println("---Before Swapping----");
//         System.out.print("Input first no.:");
//         int num_1 = sc.nextInt();
//         System.out.print("Input second no.:");
//         int num_2 = sc.nextInt();

//         /* Calling function */
//        Swapping(num_1, num_2);
//     }
// }

// import java.util.Scanner;

// /**
//  * Function
//  */
// public class Function {

//     public static int Factorial(int num) {
//         int fact = 1;
//         /* using loop */
//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }
//         return fact;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);      /* Factorial of a given number */
//         System.out.print("Input a no.:");
//         int num = sc.nextInt();
//         System.out.println("Factorial:" +Factorial(num));
//     }
// }

// import java.util.Scanner;

// /**
//  * Function
//  */
// public class Function {
//     public static int LeapOrNot(int year){
//         if (year%4 == 0  &&  year%100 != 0) {
//             System.out.println("Leap year");
//         }else{
//             System.out.println("Not Leap year");
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);       /* Find Leap year */
//         System.out.print("Enter an year: ");
//         int year = sc.nextInt();
//         LeapOrNot(year);
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static int PrimeOrNot(int num){
//         int count = 0;
//         /*using loop */
//         for (int i = 1; i <= num; i++) {
//             if (num % i == 0) {
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println("Prime number");
//         }else{
//             System.out.println("Non-Prime number");
//         }
//         return 0;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);         /*Prime or Non-Prime */
//         System.out.println("Input a no.:");
//         int num = sc.nextInt();
//         PrimeOrNot(num);
//     }
// } 

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//      public static int MaxOrMin(int num_1, int num_2){
//          if (num_1>num_2) {
//             System.out.println("Maximum no.:" +num_1);
//             System.out.println("Minimum no.:" +num_2);
//          }else if (num_2>num_1) {
//             System.out.println("Maximum no.:" +num_2);
//             System.out.println("Minimum no.:" +num_1);
//          }else {
//             System.out.println("Numbers are same");
//          }
//          return 0;
//      }
//      public static void main(String[] args){
//         Scanner sc = new Scanner(System.in );            /*Maximum or MInimumm */
//         System.out.print("Input first no.:");
//         int num_1 = sc.nextInt();
//         System.out.print("Input second no.:");
//         int num_2 = sc.nextInt();
//         MaxOrMin(num_1, num_2);
//      }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static int PrintNumber(int num) {
//        /*Using loop */
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//        }
//        return num;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);        /* Print the number in limited number */   
//         System.out.print("Input a no.: " );
//         int num = sc.nextInt();
//         /*Callinng function */
//         PrintNumber(num);
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static int PrintTotal(int num){
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             sum += i;
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);          /*Print total sum of a number in the given range */
//         System.out.print("Input a no.:");
//         int num = sc.nextInt();
//         /* Calling function */
//         System.out.print("Total:" +PrintTotal(num));
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//      public static int Table(int num){
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num +"*"+ i +"="+ num*i);
//         }
//         return 0;
//      }
//      public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);            /* Print the Table */
//          System.out.print("Input a no.:");
//          int num = sc.nextInt();
//           /*Calling function */
//           Table(num);
//      }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static float Calculator(float num_1, float num_2, char op){
//         float result;
//         switch (op) {
//             case '+':
//             result = num_1+num_2;
//                 System.out.println("Addition:" +result);
//                 break;
//             case '-':
//             result = num_1-num_2;
//                 System.out.println("Subtraction:" +result);
//                 break;
//             case '*':
//             result = num_1*num_2;
//                 System.out.println("Multiplication:" +result);
//                 break;
//             case '/':
//             result = num_1/num_2;
//                 System.out.println("Division:" +result);
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//                 break;
//         }
//         return 0;  
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);            /*Simple calculator */
//         System.out.print("Input first no.:");
//         float num_1 = sc.nextInt();
//         System.out.print("Input second no.:");
//         float num_2 = sc.nextInt();
//         System.out.print("Choose an operator:");
//         char op =sc.next().charAt(0);
//         Calculator(num_1, num_2, op);
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static char Character(char ch) {
//         if (ch >= '0' && ch <= '9'){
//             System.out.println("It`s a digit");
//         }else if (ch >= 'a' && ch <= 'z'){
//             System.out.println("It`s a lowercase character");
//         }else if (ch >= 'A' && ch <= 'Z'){
//             System.out.println("It`s a uppercase character");
//         }else if (ch >='!' && ch <= '*'){
//             System.out.println("It`s a symbolic character");
//         }else {
//             System.out.println("Invalid character");
//         }
//         return ch;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); /*  Find character or not */
//         System.out.print("Input a character: ");
//         char ch = sc.next().charAt(0);
//         Character(ch);
//     }
// }

// import java.util.Scanner;
//   public class Function {
//     public static int PowerFunction(int a, int b){
//         System.out.println(Math.pow(a, b));
//         return 1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);        /* Power function */
//         System.out.print("Input a no.:");
//         int a = sc.nextInt();
//         System.out.print("Input base:");
//         int b = sc.nextInt();
//         PowerFunction(a, b);
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static float PositiveOrNegative(float num){
//         if (num > 0){
//             System.out.println("Positive");
//         }else{
//             System.out.println("Negative");
//         }
//         return num;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);         /*Positive or Negative */
//         System.out.print("Input a no.:");
//         float num = sc.nextFloat();
//         PositiveOrNegative(num);
//     }
// }

// import java.util.Scanner;;
// /**
//  * Function
//  */
// public class Function {
//     public static int EvenOrOdd(int x, int y) {
//         /*using loop */
//         /*This loop is used for Even no. */
//         System.out.println("Even numbers:");
//         for (int i = x; i <= y; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i + " ");
//             }
//         }
//         /*This loop is used for Odd no. */
//         System.out.println("Odd numbers:");
//         for (int i = x; i <= y; i++) {
//             if (i % 2 != 0) {
//                 System.out.println(i + " ");
//             }
//         }
//         return 0;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);           /*Even or Odd in limited range */
//         System.out.print("Input a starting point:");
//         int x = sc.nextInt();
//         System.out.print("Input a final point:");
//         int y = sc.nextInt();
//         EvenOrOdd(x, y);
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static int ASCIIvalue(char ch) {
//         //Here, we used 'int' becuase we need to ASCII value of the character which is in integer form--
//         int ascii_value = ch;
//         return ascii_value;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);             /*ASCII value of a character */
//         //Here, we enter a character--
//         System.out.print("Input a character: ");
//         char ch = sc.next().charAt(0);
//         System.out.print("ASCII value of a character:" +ASCIIvalue(ch));
//     }
// }

// import java.lang.Math;
// /**
//  * Function
//  */
// public class Function {
//     public static int RandomNumber(){
//         System.out.println("1st Random no.:" + Math.random());
//         System.out.println("2nd Random no.:" + Math.random());
//         System.out.println("3rd Random no.:" + Math.random());
//         System.out.println("4th Random no.:" + Math.random());
//         return 0;
//     }
//     public static void main(String[] args){
//      /*Random number generate */
//         RandomNumber();
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static int FindGCD(int x, int y){
//         int gcd = 1;
//         //using loop start from 1--
//         for (int i = 1; i <= x  &&  i <= y; i++) {
//             if(x%i == 0  && y%i ==0){
//                 gcd = i;
//             } 
//         }
//         return gcd;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);       /* Greatest Common Factor */
//         System.out.println("Input no.:");
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println("GCD of " + x + " and " + y + " :" + FindGCD(x, y));
//     }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//      public static int Reverse(int num){
//           int rev = 0;
//           //using loop--
//           while (num != 0) {
//                int rem = num % 10;
//                rev = rev * 10 + rem;
//                num = num / 10;
//           }
//           return rev;
//      }
//      public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);        /*Reverse a number */
//         System.out.print("Input a number: ");
//         int num = sc.nextInt();
//         System.out.print("Reverse nuo.: " + Reverse(num));
//      }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//      public static int LargestNumber(int a, int b, int c) {
//           //comparing a and b and storing the largest value in temp variable--
//           int temp = a>b?a:b;
//           //comparing c value and storing the largest value in largest variable--
//           int largest = c>temp?c:temp;
//           return largest;
//      }
//      public static void main(String[] args){
//           Scanner sc = new Scanner(System.in);         /*Largest number */
//           System.out.print("Input first no.:");
//           int a = sc.nextInt();
//           System.out.print("Input second no.:");
//           int b = sc.nextInt();
//           System.out.print("Input third no.:");
//           int c = sc.nextInt();
//           System.out.print("Largest value: " + LargestNumber(a, b, c));
//      }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//      static boolean isPerfectSquare(int num){
//           //claculating the square root of a number--
//           double sqrt = Math.sqrt(num);
//           //finds the floor value of the square root of a number and comparing it with a zero--
//           return ((sqrt - Math.floor(sqrt)) == 0);
//      }
//      public static void main(String[] args){
//           Scanner sc = new Scanner(System.in);                  /*Square root of a given number */
//           System.out.print("Input a no.:");
//           int num = sc.nextInt();
//           if (isPerfectSquare(num)) {
//                System.out.println("This is a perfect square ");
//           }else{
//                System.out.println("This is not a perfect square");
//           }
//      }
// }

// import java.util.Scanner;
// /**
//  * Function
//  */
// public class Function {
//     public static int Palindrome(int num){
//         //Here we will take three variables for solving it
//         int rem, sum=0, temp;
//         temp = num;
//         //using loop--
//         while (num > 0) {
//             rem = num % 10;
//             sum = (sum * 10) + rem;
//             num = num / 10;
//         }
//         if (temp == sum) {
//             System.out.println("Palindrome no.");
//         }else{
//             System.out.println("Not palindrome no.");
//         }
//         return num;
//     }
//      public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);          /*Palindrome number */
//         System.out.print("Input a no.: ");
//         int num = sc.nextInt();
//         Palindrome(num);
//      }
// }

// import java.util.Scanner;
// public class Function {
//      public static int ATM_machine(){
//           Scanner sc = new Scanner(System.in);
//           int balance = 2500000, withdraw, deposit;
//           //using loop--
//           while (true) {
//               System.out.println("Press 1 for Withdraw money");
//               System.out.println("Press 2 for Deposit money");
//               System.out.println("Press 3 for Check balance ");
//               System.out.println("Press 4 for Exit to the process ");
//               System.out.print("Choose a button which you wanna to process:");
//               int choose = sc.nextInt();
//               //using switch case--
//               switch (choose) {
//                case 1:
//                   System.out.print("Enter the amount to be withdrwan:");
//                   withdraw = sc.nextInt();
//                   if (balance >= withdraw) {
//                      balance = balance - withdraw;
//                      System.out.println("Collect your money");
//                   }else{
//                      System.out.println("Insufficient balance");
//                   }
//                   System.out.println("");
//                   break;
//                case 2:
//                   System.out.print("Enter the amount to be deposited:");
//                   deposit = sc.nextInt();
//                   balance = balance + deposit;
//                   System.out.println("Your money has been successfully deposited.");
//                   System.out.println("");
//                   break;
//                case 3:
//                   System.out.print("Your current balance:" +balance);
//                   System.out.println(""); 
//                   break;  
//                case 4:
//                 System.exit(0);
//                }
//             }
//      }
//      public static void main(String[] args){
//                 /*ATM machine */
//         System.out.println("~~~~~~~$$$$~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~₹₹₹₹~~~~~~~~~");
//         System.out.println("~~~~~~~~~~~~~~~Welcome in ATM~~~~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("~~~~~~~$$$$~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~₹₹₹₹~~~~~~~~~");
//         ATM_machine();
//     }
// }


  