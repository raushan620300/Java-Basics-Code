// import java.util.Scanner;

// class EmployeeDetail {
//     String name;
//     String id;
//     String phoneNo;

//     //constructor--
//     public EmployeeDetail(String name, String id, String phoneNo) {
//         this.name = name;
//         this.id = id;
//         this.phoneNo = phoneNo;
//     }

//     //Getter methods--
//     public String getName() {
//         name = name.toUpperCase();
//         return name;
//     }
//     public String getId() {
//         return id;
//     }
//     public String getPhoneNo() {
//         return phoneNo;
//     }
// }


// public class InfoEmployee {
//     //method to create inputing employee detail--
//     public static EmployeeDetail inputEmployeeDetail() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter employee name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter ID: ");
//         String id = sc.nextLine();
//         System.out.print("Enter Phone no.: ");
//         String phone = sc.nextLine();
//         return new EmployeeDetail(name, id, phone);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter total no. of employees:");
//         int numEmployee = sc.nextInt();
//         //create an array to input employee details--
//         EmployeeDetail[] employees = new EmployeeDetail[numEmployee];
//         for (int i = 0; i < numEmployee; i++) {
//             System.out.println("Enter Employee " + (i + 1) + " details:");
//             employees[i] = inputEmployeeDetail();
//         }       
//         //now create an array to output employee details--
//         for (int i = 0; i < numEmployee; i++) {
//             System.out.println("\nEmployee " + (i + 1) + " details:");
//             System.out.print("\tName: " +employees[i].getName());
//             System.out.print("\tID: " +employees[i].getId());
//             System.out.print("\tPhone no.: " +employees[i].getPhoneNo());
//         }
//     }
    
// }