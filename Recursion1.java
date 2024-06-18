import java.util.Scanner;

public class Recursion1 {
    // public static void printNumber(int num, int last_num){
    // // Here, we`ll take a base condition to control this recursive function--
    // if (num==last_num) {
    // return;
    // }
    // System.out.println(num);
    // printNumber(num-1,last_num);
    // }
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);              /*Print number from n to 1 */
    // System.out.print("Input starting number=");
    // int num=sc.nextInt();
    // //Here we take reach point number for printing the number from num to till
    // number
    // System.out.print("Input a last point number=");
    // int last_num=sc.nextInt();
    // //Call function--
    // printNumber(num,last_num);
    // }

    // public static void printNumber(int start_num, int last_num){
    // //Take a base condition which point you wanna print--
    // if (start_num==last_num) {
    // return;
    // }
    // System.out.println(start_num);
    // printNumber(start_num+1, last_num);
    // }
    // public static void main(String[] args){
    // Scanner sc=new Scanner(System.in);              /*Print num fromm 1 to limited number */
    // System.out.print("Input a starting number= ");
    // int start_num=sc.nextInt();
    // System.out.print("Input last number=");
    // int last_num=sc.nextInt();
    // //Call --
    // printNumber(start_num, last_num);
    // }

    // public static void printSum(int i, int num, int sum) {
    // if (i>num){
    // sum+=i;
    // System.out.print("Total Sum:" +sum);
    // return;
    // }
    // sum+=i;
    // printSum(i+1, num, sum);
    // }
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);              /*Program to print sum of the given
    // natural number */
    // int i=1,sum=0;
    // System.out.print("Input a number=");
    // int num=sc.nextInt();
    // printSum(i, num, sum);
    // }

    // public static void printFact(int i, int num, int fact) {
    // if (i>num) {
    // fact *= i;
    // System.out.print("Factorial:" +fact);
    // return;
    // }
    // fact *= i;
    // printFact(i+1, num, fact);
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);              /*Program to print factorial of the
    // given number */
    // System.out.print("Input a no.:");
    // int num = sc.nextInt();
    // int i = 1, fact = 1;
    // printFact(i, num, fact);
    // }

    // public static void printName(int num) {
    // if (num>0){
    // System.out.println("Hello World!");
    // printName(num-1);
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);              /*Print your name n times */
    // int num=sc.nextInt();
    // printName(num);
    // }

    // public static void printTable(int i, int num) {
    // if (i==11) {
    // return;
    // }
    // System.out.println(num +"*"+ i +"="+ (num*i));
    // printTable(i+1,num);
    // }
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);              /*Print the table a given number */
    // int i=1;
    // System.out.print("Input a number=");
    // int num=sc.nextInt();
    // printTable(i,num);
    // }

    // public static void printFibonacci(int a, int b, int num) {
    //     if (num==0) {
    //         return;
    //     }
    //     //Here we take a third parameter for store total sum of a and b--
    //     int c=a+b;
    //     System.out.println(c);
    //     //Now b took a placed of a and c took placed of b--
    //     printFibonacci(b, c, num-1);
    // }
    // public static void main(String[] args) {                 
    //     int a =0, b=1;                    /*Print fibonacci series till nth term */
    //     System.out.println(a);
    //     System.out.println(b);
    //     int num=8;
    //     printFibonacci(a, b, num-2);
    // }

    // public static int printPower(int x, int num) {
    //     if (x==0){
    //         return 0;
    //     } if (num==0){
    //         return 1;
    //     }
    //         int xPownum1=printPower(x, num-1);
    //         int xPownum=x*xPownum1;
    //         return xPownum;
    //    }
    //    public static void main(String[] args) {
    //        //here x is base & num is power (2^5)--
    //        int x=2, num=5;                     /*Print x^num (stack height=num)*/
    //        int result=printPower(x, num);
    //        System.out.println("Power:" +result);
    //    }
  
    // public static int printPower(int x, int num) {
    //     if (x==0){
    //         return 0;
    //     } if (num==0){
    //         return 1;
    //     }
    //         //if num is even--
    //         if (num%2==0){
    //             return printPower(x, num/2) * printPower(x, num/2);
    //         }
    //         //if num is odd--
    //         return printPower(x, num/2) * printPower(x, num/2) * x;
    //    }
    //    public static void main(String[] args) {
    //        //here x is base & num is power (2^5)--
    //        int x=2, num=5;                     /*Print x^num (stack height=logn)*/
    //        int result=printPower(x, num);
    //        System.out.println("Power:" +result);
    //    }   

    // public static void towerofHanoi(int n, String src, String helper, String des) {    //src=source, des=destination
    //     if (n==1){
    //         System.out.println(" Transfer disk "+ n +" from "+ src +" to "+ des);
    //         return;
    //     }
    //     towerofHanoi(n-1, src, des, helper);
    //     System.out.println(" Transfer disk "+ n +" from "+ src +" to "+ des);
    //     towerofHanoi(n-1, helper, src, des);
    // }
    // public static void main(String[] args) {
    //     int n=2;
    //     towerofHanoi(n,"S", "H", "D");         /*Tower of Hanoi */
    // }

    // public static void printRev(String str, int index) {
    //     if (index==0){
    //         System.out.print(str.charAt(index));
    //         return;
    //     }
    //         System.out.print(str.charAt(index));
    //         printRev(str, index-1);
    //    }
    //    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);           /*Print String in reverse order */
    //         System.out.print("Input word:");
    //        String str=sc.nextLine();
    //         printRev(str, str.length()-1);
    //    }

    // public static boolean isSorted(int arr[], int idx) {
    //     if (idx==arr.length-1) {
    //         return true;
    //     }
    //        if (arr[idx] < arr[idx+1]){
    //             return isSorted(arr, idx+1);
    //        }else{
    //           return false;
    //        }
    //    }
    //    public static void main(String[] args) {
    //     int  arr[]={1,2,3,4};   
    //     System.out.println(isSorted(arr, 0));
    //    } 

}
