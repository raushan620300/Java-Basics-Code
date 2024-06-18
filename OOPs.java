/*class Car {
    String color;
    String brand;
    public void drive() {
        System.out.println("Long way to drive:)");
    }
    public void car_Color() {
        System.out.println("Color:" +this.color);
    }
    public void car_Brand() {
        System.out.println("Brand:" +this.brand);
    }
}
public class OOPs {
    public static void main(String[] args) {
        Car-1--
        Car car1 = new Car();
        car1.color = "Black";
        car1.brand = "BMW";
        Car-1 details--
        car1.car_Color();
        car1.car_Brand();
        car1.drive();
        System.out.println();
        Car-2--
        Car car2 = new Car();
        car2.color = "Red";
        car2.brand = "Audi";
        Car-1 details--
        car2.car_Color();
        car2.car_Brand();
        car2.drive();
    }
}*/

// class Student {
//     String name;
//     int age;
//     public void studentInfo() {
//         System.out.println("Name:" +this.name);
//         System.out.println("Age:" +this.age);
//     }
//     Student(Student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//     }
//     Student() {
//     }
// }
// public class OOPs {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name="Raushan Sinha";
//         s1.age=18;
//         Student s2 = new Student(s1);    /*copy constructor */
//         s2.studentInfo();
//     }
// }




//Polymorphism(compile-time)--
/*import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    int age;

    //Functions overloading--
    public void infoStudent(String name) {
        System.out.println("Name:" +name);
    }
    public void infoStudent(int roll_no) {
        System.out.println("Roll_no.:" +roll_no);
    }
    
    public void infoStudent(String name, int roll_no, int age) {
        System.out.println("Name: "+ name + " " +" Roll_no: "+ roll_no + " " + " Age: "+ age);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter name:");
        s1.name = sc.nextLine();
        System.out.print("Roll:");
        s1.roll_no = sc.nextInt();
        System.out.print("Age:");
        s1.age = sc.nextInt();
        s1.infoStudent(s1.name,s1.roll_no,s1.age);
        
    }
} */

import java.util.*;
import bank;

//Inheritance--
class Shape {         //Parent or base class--
    public void area() {
        System.out.println("Displays area");
    }
}
//Single level inheritance--
class Triangle extends Shape {        //Child or  derived class--
     public void area(int l, int h) {
        System.out.println(1/2*l*h);
     }
}
//Multi level inheritance--
/*class EquilateralTriangle extends Triangle {
     public void area(int l, int h) {
        System.out.println(1/2*l*h);7
     }
} */

//Hierarchy inheritance--
class Circle extends Shape {
    public void are(int r) {
        System.out.println(3.14*r*r);
    }
}

public class OOPs {
    public static void main(String[] args) {
       bank.Account account1 = new Account
       
    }
}