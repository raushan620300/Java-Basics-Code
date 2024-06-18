import java.util.*;
 public class StringsBuilder{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Rohan");
        System.out.println(sb);
        /* Here we wanna know about the character of the given index */
        System.out.print("Input index: ");
        int index = sc.nextInt();
        // charAt()--
        System.out.println("Index character:"+sb.charAt(index));
        //Here we wanna set the character of the given index--
        System.out.print("Input a character:");
        char ch=sc.next().charAt(0);
        //setChar()--
        sb.setCharAt(index,ch);
        System.out.println("Set character:"+sb);
        //insert()--
        sb.insert(index,ch);
        System.out.println("Inserted character:"+sb);
        //delete the extra character--
        sb.delete(2,3);
        System.out.println("Deleted character:"+sb);
        //append()--
        sb.append("Kumar");
        System.out.println("After append:"+sb);
        //length()--
        System.out.println(sb.length());
        //Reverse the string--
        /*using loop */
        for(int i=0; i<sb.length()/2; i++){
          int front=i;
          int back=sb.length()-1-i;
          char frontChar=sb.charAt(front);
          char backChar=sb.charAt(back);
          //Now we set the character to the each position--
          sb.setCharAt(front,backChar);
          sb.setCharAt(back,frontChar);
    }
    System.out.println("Reverse string: "+sb);
  }
}