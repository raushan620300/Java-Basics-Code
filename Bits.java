import java.util.Scanner;
  public class Bits {
     public static void main(String[] args) {
             //Get Bit--
        // int num=5;   //5 is 0101
        // int position=3;
        // int BitMask=1<<position;
        // //check if bit is zero or non-zero
        // if ((BitMask & num)==0){
        //     System.out.println("Bit is zero");
        // }else{
        //     System.out.println("Bit is one");
        // }

        //Set Bit--
        // int num=5;
        // int pos=1;
        // int BitMask=1<<pos;
        // int newNumber=BitMask | num;
        // System.out.println(newNumber);

         //Clear Bit--
        //  int n=5;
        //  int pos=2;
        //  int BitMask=1<<pos;
         //NOw, we`ll use bitmask with NOT
        //  int notBitMask= ~(BitMask);
        //  int newNumber=notBitMask & n;
        //  System.out.println(newNumber);

        //Update Bit--
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Input operator: ");
        // //oper:1 set   oper=0 clear
        // int oper=sc.nextInt();
        // int n=5;
        // int pos=1;
        // int bitMask=1<<pos;
        // if (oper==1) {
        //     int newNumber=bitMask | n;
        //     System.out.println(newNumber);
        // }else{
        //     int newBitMask= ~(bitMask);
        //     int newNumber=newBitMask & n;
        // System.out.println(newNumber);
        // }
     } 
 }