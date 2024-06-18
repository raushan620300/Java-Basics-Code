// import java.util.Arrays;
// import java.util.Scanner;

// public class Array {
//     public static int copy_Elements(int num, int[] array){
//     //Now we will use loop for copy the elements from one to another--
//     System.out.println("Here`s the copied elements:");
//     for (int i : array) {
//     System.out.println(i + " ");
//     }
//     return 0;
//     }
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in); /*Program to copy array elements from
//     ome to another elements */
//     System.out.print("Enter the no. of array elements=");
//     int num = sc.nextInt();
//     int[] array = new int[num];
//     //Now we will input elements by the through the ioop--
//     System.out.println("Input elements:");
//     for (int i=0; i < array.length; i++) {
//     array[i]=sc.nextInt();
//     }
//     //Calling function--
//     copy_Elements(num, array);
//     }

//     public static int isIndex(int num,int[] array,int key) {
//     //Through loop we check index of the key--
//     for (int i=0; i<array.length; i++){
//          if (array[i]==key) {
//            key=i;
//          }
//      }
//         return key;
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in); /* Program to find the index of that
//     element which is input by the user */
//     System.out.print("Enter the no. of array elements=");
//     int num = sc.nextInt();
//     int[] array = new int[num];
//     // Now we will input elements by the through the ioop--
//     System.out.println("Input elements:");
//     for (int i = 0; i < array.length; i++) {
//     array[i] = sc.nextInt();
//     }
//     //For finding the index here should be inputted key by the user--
//     System.out.print("Input key:");
//     int key = sc.nextInt();
//     //Calling function--
//     int ans=isIndex(num,array,key);
//     System.out.println("Index: " +ans);
//     }

//     public static int reverse_Elements(int num,int[] array){
//     //Through the loop for reverse order--
//     System.out.println("Reverse order:");
//     for( int i=array.length-1; i>=0; i--){
//     System.out.println(array[i]);
//     }
//     return 0;
//     }
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in); /*Here we print array elements in
//     reverse order */
//     System.out.print("Enter the no. of array elements=");
//     int num = sc.nextInt();
//     int[] array = new int[num];
//     // Now we will input elements by the through the ioop--
//     System.out.println("Input elements:");
//     for (int i=0; i<array.length; i++) {
//     array[i] = sc.nextInt();
//     }
//     //Calling function--
//     reverse_Elements(num, array);
//     }

//     public static double printGSt_Netprice(int num, double[] arr) {
//     double gstRate=0.18; //GST Rate 18%
//     double totalGST=0.0;
//     for (double price : arr) {
//     double gstAmout=price*gstRate;
//     totalGST+=gstAmout;
//     }
//     return totalGST;
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in); /*Find the GST amount & Net price of
//     total item */
//     System.out.print("Input total item:");
//     int total=sc.nextInt();
//     //Intialize array--
//     double[] arr = new double[total];
//     //Now we input price of the item by user--
//     for(int i=0; i<total; i++){
//     arr[i]=sc.nextDouble();
//     }
//     System.out.print("Total GST amount:" +printGSt_Netprice(total,arr));
//     }

//     public static int EvenOrOdd(int size, int[] arr){
//     System.out.println("Even no. are:");
//     //Using loop for finding even --
//     for(int i=0; i<size; i++){
//     if (arr[i]%2 == 0){
//     System.out.println(arr[i]);
//     }
//     }
//     System.out.println("Odd no. are:");
//     //Using loop for finding odd--
//     for(int i=0; i<size; i++){njh
//     if (arr[i]%2 != 0){
//     System.out.println(arr[i]);
//     }
//     }
//     return 0;
//     }
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in); /*Print Even no./Odd no. in inputted
//     array elements */
//     System.out.print("Input elements size:");
//     int size=sc.nextInt();
//     int[] arr=new int[size];
//     System.out.println("Input elements:");
//     for(int i=0; i<size; i++){
//     arr[i]=sc.nextInt();
//     }
//     EvenOrOdd(size,arr);
//     }

//     public static int isLargestElement(int num, int[] arr){
//     //first we search about to maximum element--
//     int max=arr[0];
//     for(int i=0; i<arr.length; i++){
//     if (arr[i]>max){
//     max=arr[i];
//     }
//     }
//     return max;
//     }
//     public static int isSmallestElement(int num, int[] arr){
//     //first we search about to minimum element--
//     int min=arr[0];
//     for(int i=0; i<arr.length; i++){
//     if (arr[i]<min){
//     min=arr[i];
//     }
//     }
//     return min;
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);                      /*Find largest no. & smallest no. in
//     array elements */
//     System.out.print("Enter a no. of elements:");
//     int num=sc.nextInt();
//     int[] arr = new int[num];
//     System.out.println("Input elements:");
//     for(int i=0; i<arr.length; i++){
//     arr[i]=sc.nextInt();
//     }
//     System.out.print("Largest element:" +isLargestElement(num,arr));
//     System.out.print("\nSmllest element:" +isSmallestElement(num,arr));
//     }

//     public static int TotalSum(int num, int[] arr) {
//         // Using for sum of elements--
//         int sum=0;
//         for (int i = 0; i < arr.length; i++) {
//             sum+=arr[i];
//         }
//         return sum;
//     }
//     public static int Factorial(int num, int[] arr) {
//         // Using for factorial of elements--
//         int fact=1;
//         for (int i = 0; i < arr.length; i++) {
//             fact*=arr[i];
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); /* Total sum & factorial of all array elemnts */
//         System.out.print("Enter no. of elemets:");
//         int num = sc.nextInt();
//         int[] arr = new int[num];
//         System.out.println("Input elements:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Sum is:" + TotalSum(num,arr));
//         System.out.print("\nFactorial is:" + Factorial(num,arr));
//     }

//        public static int sortArray(int[] arr){
//            Arrays.sort(arr);
//            System.out.println("Sorted array: ");
//            for(int i=0; i<arr.length; i++){
//               System.out.println(arr[i]);
//            }
//            return 0;
//        }

    
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);          /*Print the sorted array */
//            System.out.print("Size of an elements:");
//            int num=sc.nextInt();
//            int[] arr=new int[num];
//            System.out.println("Input unsorted elements:");
//            for (int i=0; i<arr.length; i++){
//                arr[i]=sc.nextInt();
//            }
//             sortArray(arr);
//        }    

    
// }
