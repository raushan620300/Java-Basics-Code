import java.util.Scanner;

class AtmInformation {
      String name;
      String acc_Num;
      String acc_Type;
      String acc_Balance;

      //constructor--
      public AtmInformation(String name, String acc_Num, String acc_Type, String acc_Balance) {
           this.name = name;
           this.acc_Num = acc_Num;
           this.acc_Type = acc_Type;
           this.acc_Balance = acc_Balance;
      }

      //getter methods--
      public String getName() {
           return name;
      }
      public String getAccNum() {
            return acc_Num;
      }
      public String getAccType() {
             return acc_Type;
      }
      public String getAccBalance() {
             return acc_Balance;
      }       
}


public class AtmMachine {
     public static AtmInformation HolderDeatails() {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter Account Holder`s name: ");
          String name = sc.nextLine();
          System.out.print("Account no.: ");
          String acc_Num = sc.nextLine();
          System.out.print("Account Type: ");
          String acc_Type = sc.nextLine();
          System.out.print("Account Balance: ");
          String acc_Balance = sc.nextLine();
            return new AtmInformation(name, acc_Num, acc_Type, acc_Balance);
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        AtmInformation details = new AtmInformation();
        details = HolderDeatails();
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~\n~~~~~~~~");
        System.out.println("~~~~~~~~WELCOME~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~\n~~~~~~~~");
            System.out.println("1. Enter your Bank details.");
            System.out.println("2. Show your Bank data.");
            System.out.println("3. Show Current Bank Balance.");
            System.out.println("4. Deposit Money.");
            System.out.println("5. Withdraw Money.");
            System.out.println("6. Cancel.");
              int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(details.name);
                        break;
                
                    default:
                        System.out.println("Inavlid");
                        break;
                }
    }
}
