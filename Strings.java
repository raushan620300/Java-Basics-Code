// import java.util.Scanner;
// public class Strings {
//     public static int StringFunction(String firstName, String lastName){
//         // Concatenation--
//         String fullName=firstName.concat(lastName);
//         System.out.println("Fullname:"+fullName);
//         //Length of fullname--
//         System.out.println("Length of Fullname:" +fullName.length());
//         //charAt--
//         System.out.println("Every a single character of fullname:");
//         for(int i=0; i<fullName.length(); i++){
//             System.out.println(fullName.charAt(i));
//         }
//         //Compare--
//         if(firstName.compareTo(lastName) == 0){
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("Strings are not equal");
//         }
//         //Substring--
//         String sub=firstName.substring(5);
//         System.out.println(sub);
//         return 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter User`s first name:");
//         String firstName = sc.next();
//         System.out.print("Enter User`s last name:");
//         String lastName = sc.next();
//         StringFunction(firstName,lastName);
//     }
// }




import java.util.Scanner;
public class Strings {
    // public static int CountVowelConsonant(String txt){
    //     //Here we will  vCount for counting the vowel and cCount for counting the consonant--
    //     int vCount=0, cCount=0;
    //     //Now we converted the text into lowercase order to comparison--
    //     txt=txt.toLowerCase();
    //     //using loop--
    //     for(int i=0; i<txt.length(); i++){
    //         //Checks whether the character is vowel--
    //         if(txt.charAt(i)=='a' || txt.charAt(i)=='e' || txt.charAt(i)=='i' || txt.charAt(i)=='o' || txt.charAt(i)=='u'){
    //             vCount++;
    //         }else if(txt.charAt(i)>='a' && txt.charAt(i)<='z'){
    //             cCount++;
    //         }
    //     }
    //     System.out.println("Total Vowel: " +vCount);
    //     System.out.println("Total Consonant: " +cCount);
    //     return 0;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);                     /*Find the total count of Vowels and Consonants in that user inputted text */
    //     System.out.print("Input text=");
    //     String txt=sc.nextLine();
    //     CountVowelConsonant(txt);
    // }

    // public static int RemoveWhiteSpace(String txt){
    //     //replaceAll()--
    //     txt=txt.replaceAll("\\s+","");
    //     System.out.println("After removing white spaces from the text= " +txt);
    //     return 0;
    // }
    // public static int ReplaceSpecificCharacter(String txt){
    //     Scanner sc= new Scanner(System.in);
    //     System.out.print("Input specific character:");
    //     char ch=sc.next().charAt(0);
    //     //replace()--
    //     txt=txt.replace(' ', ch);
    //     System.out.println("Text after replacing spaces with the given character= " +txt);
    //     return 0;
    // }
    // public static void main(String[] args){
    //     Scanner sc= new Scanner(System.in);       /*Remove all white spaces from the text */
    //     System.out.print("Input text=");
    //     String txt=sc.nextLine();
    //     //Calling RemoveWhiteSpace function--
    //     RemoveWhiteSpace(txt);
    //     //Calling ReplaceSpecificCharacter function--
    //     ReplaceSpecificCharacter(txt);
    // }


}