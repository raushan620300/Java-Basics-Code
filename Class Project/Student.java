import java.util.Scanner;

public class Student {
    String name;
    int rollno;
    String standard;
    int age;
    String phone;

    //Constructor--
    public Student(String name, int rollno, String standard, int age, String phone) {
        this.name = name;
        this.rollno = rollno;
        this.standard = standard;
        this.age = age;
        this.phone = phone;
    }

    //getter methods--
    public String getName() {
        name = name.toUpperCase();
        return name;
    }
    public int getRollno() {
        return rollno;
    }
    public String getStandard() {
        return standard;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }

    //inputting method()--
    public static Student inputStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student`s name= ");
        String name = sc.nextLine();
        System.out.print("Roll no.= ");
        int rollno = sc.nextInt();
        System.out.print("Standard= ");
        String standard = sc.nextLine();
        System.out.print("Age= ");
        int age = sc.nextInt();
        System.out.print("Phone=");
        String phone = sc.nextLine();
        return new Student(name, rollno, standard, age, phone);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input total no. of students: ");
        int numStudent = sc.nextInt();
        //Create an array to store the students details--
        Student[] students = new Student[numStudent];
        for (int i = 0; i < numStudent; i++) {
            System.out.println("Enter Student`s " + (i + 1) + " details ---> ");
            students[i] = inputStudentDetails();
        }
        for (int i = 0; i < numStudent; i++) {
            System.out.println(" Student`s " + (i + 1) + " details ---> ");
            System.out.print("Name: " + students[i].getName());
            System.out.print("Roll no.: " + students[i].getRollno());
            System.out.print("Standard: " + students[i].getStandard());
            System.out.print("Age: " + students[i].getAge());
        }
    }
}                   