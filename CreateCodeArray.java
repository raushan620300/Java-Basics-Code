// import java.util.Arrays;
// import java.util.Scanner;
// import java.math.*;
  
//   public class CreateCodeArray {

//    /* public static int totalSum(int size, int[] arr) {             //Function for print total sum of elements
//          int sum = 0;
//              for (int i = 0; i < arr.length; i++) {
//                 sum += arr[i];
//              }
//              return sum;
//       }       

//       public static int factorial(int size, int[] arr) {             //Function for print factorial of elements
//          int fact = 1;
//              for (int i = 0; i < arr.length; i++) {
//                 fact *= arr[i];
//              }
//              return fact;
//       }   

//       public static void main(String[] args) {          //Program to find total sum & factorial of the inputted elements-
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter size of an elements: ");
//            int size= sc.nextInt();
//            int[] arr = new int[size];
//              System.out.println("Input elements: ");
//                  for (int i = 0; i < arr.length; i++) {
//                     arr[i] = sc.nextInt();
//                  }
//                System.out.print("Sum of the elements: " +totalSum(size, arr));
//                System.out.println();
//                System.out.print("Factorial of the elements: " +factorial(size, arr));
//       } */

//    /* public static int isLargestElement(int size, int[] num) {      //Function for find largest element
//          int max = num[0];
//              for (int i = 0; i < num.length; i++) {
//                if (num[i] > max) {
//                   max = num[i];
//                }
//              }
//              return max;
//       }
      
//       public static int isSmallestElement(int size, int[] num) {      //Function for find smallest element
//          int min = num[0];
//              for (int i = 0; i < num.length; i++) {
//                 if (num[i] < min) {
//                    min = num[i];
//                 }
//              }
//              return min;
//       }

//       public static void main(String[] args) {          //Program to find largest & smallest elements-
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter size of an elements: ");
//            int size = sc.nextInt();
//            int[] num = new int[size];
//              System.out.println("Input numbers: ");
//                  for (int i = 0; i < num.length; i++) {
//                     num[i] = sc.nextInt();
//                  }
//                System.out.print("Largest element: " +isLargestElement(size, num));
//                System.out.println();
//                System.out.print("Smallest element: " +isSmallestElement(size, num));
//       } */

//    /* public static void isPrimeOrNon(int size, int[] num) {
         
//              for (int i = 0; i < num.length; i++) {
//                int count = 0;
//                  for (int j = 1; j <= num[i]; j++) {
//                      if (num[i]%j == 0) {
//                         count++;
//                      }
//                  }
//                  if (count == 2) {
//                     System.out.println("Prime no.: " +num[i]);
//                  } else {
//                     System.out.println("Non-PRime no.: " +num[i]);
//                  }
//              }
//       }
//       public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter size of an elements: ");
//            int size = sc.nextInt();
//            int[] num = new int[size];
//              System.out.println("Input numbers: ");
//                  for (int i = 0; i < num.length; i++) {
//                      num[i] = sc.nextInt();
//                  }
//              isPrimeOrNon(size, num);
//       }  */          

//    /* public static void isEvenOrOdd(int size, int[] arr) {
//       System.out.println("Even no.: ");
//           for (int i = 0; i < arr.length; i++) {
//               if (arr[i] % 2 == 0) {
//                  System.out.println(arr[i]);
//               } 
//           }
//       System.out.println("Odd no.: ");
//           for (int i = 0; i < arr.length; i++) {
//               if (arr[i] %2 != 0) {
//                  System.out.println(arr[i]);
//               } 
//           }
//    }
//    public static void main(String[] args) {         //Program to find Even & Odd no.-
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter size of an elements: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//           System.out.println("Input numbers: ");
//               for (int i = 0; i < arr.length; i++) {
//                   arr[i] = sc.nextInt();
//               }
//           isEvenOrOdd(size, arr);    
//    } */
    
//    /* public static void reverseElements(int size, int[] numbers) {
//         System.out.println("Reverse order: ");
//             for (int i = numbers.length-1; i >= 0; i--) {
//                System.out.println(numbers[i]);
//             }        
//      }
//      public static void main(String[] args) {           //Program to print elements in reverse order-
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter size of an elements: ");
//           int size = sc.nextInt();
//           int[] numbers = new int[size];
//             System.out.println("Input elements: ");
//                 for (int i = 0; i < numbers.length; i++) {
//                    numbers[i] = sc.nextInt();
//                 }
//             reverseElements(size, numbers);    
//      } */
   
//    /* public static int isIndex(int size, int[] num, int key) {
//       for (int i = 0; i < num.length; i++) {
//           if (num[i] == key) {
//              key = i;
//           }
//       }
//       return key;
//    }
//    public static void main(String[] args) {     //Find the ith Index of number which is enroll in elements
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Total size of an elements: ");
//         int size = sc.nextInt();
//         int[] num = new int[size];
//           System.out.println("Input elements: ");
//               for (int i = 0; i < num.length; i++) {
//                  num[i] = sc.nextInt();
//               }
//           System.out.print("Input key: ");
//             int key = sc.nextInt();
//             int ans = isIndex(size, num, key);
//             System.out.println(ans);
//    } */
   
//    /* public static double calculateTotalPrice(double[] items) {
//         double total = 0;
//             for (double item : items) {
//                total += item;
//             }
//             return total;
//      }
//      public static void main(String[] args) {     // Program to find toral price and GST
//         double[] items = inputItemsPrice();
//         double totalAmount = calculateTotalPrice(items);
//           System.out.printf("Total Price: %.2f\n" , totalAmount);
//      }
//    //   Create a function to input item`s price-
//      public static double[] inputItemsPrice() {
//         Scanner sc  = new Scanner (System.in);
//         System.out.print("Total no. of items: ");
//           int num = sc.nextInt();
//           double[] items = new double[num];
//             System.out.println("Input price: ");
//                 for (int i = 0; i < items.length; i++) {
//                    items[i] = sc.nextDouble();
//                 }
//             return items;    
//      } */

//    /* public static void main(String[] args) {         // FInd the total, percentage & grade of the subjects of student
//          Scanner sc = new Scanner (System.in);
//          System.out.print("Enter total no. of subjects: ");
//            int num = sc.nextInt();
//            int[] marks = new int[num];
//          System.out.println();
//          System.out.println("Subjects name: ");    // Decalaring Subject`s name
//              for (int i = 0; i < marks.length; i++) {
//                 String sub_name = sc.next(); 
//              } 
//          System.out.println();    
//          System.out.println("Input marks of the subjects ou of 100 ---> ");   // Input marks of the subjects
//              for (int i = 0; i < marks.length; i++) {
//                 System.out.printf("Enter marks of %d subject: ", i + 1);
//                 marks[i] = sc.nextInt(); 
//              }  
//           int total = 0;
//              for (int mark : marks) {
//                 total += mark;
//              }
//              System.out.print("Total Marks: " +total);
//              System.out.println();
//           double percentage = (double) total / (num * 100) * 100;
//              System.out.printf("Percentage: %.2f%%\n", percentage);   
//       } */

//    /* public static void main(String[] args) {       // Copy elements from one to another elements
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Size of an elements: ");
//           int size = sc.nextInt();
//           int[] arr = new int[size];
//         System.out.println("Input elements: ");  
//              for (int i = 0; i < arr.length; i++) {
//                  arr[i] = sc.nextInt();
//              }
//         System.out.println();     
//         System.out.println("Copied elements: ");
//              for (int i = 0; i < arr.length; i++) {
//                  System.out.println(arr[i]);
//              }     
//      } */
    
//    /* public static int sortedArray(int size, int[] num) {
//          Arrays.sort(num);
//            System.out.println("Sorted elements:");
//              for (int i = 0; i < num.length; i++) {
//                 System.out.println(num[i]);
//              }
//              return 0;
//       }
//       public static void main(String[] args) {          //Program to print sorted array elements-
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter size of an elements: ");
//            int size = sc.nextInt();
//            int[] num = new int[size];
//              System.out.println("Input unsorted elements; ");
//                  for (int i = 0; i < num.length; i++) {
//                     num[i] = sc.nextInt();
//                  }
//                  System.out.println();
//                  sortedArray(size, num);
//       } */
 
      

//   }