package java_coaching;
//rev = 0;
//Question 7
//A super class Employee has been defined to store the details of an employee. Define a subclass Overtime to calculate the amount paid for working more than the normal hours.
//The details of the classes are given below:
//Class name                : Employee
//Data members/instance variables
// empe               : To store employee code.
//  bpy                : To store basic salary in double type.
//Member functions/methods
//Employee           : Constructor to assign 0 to empc and bpay.
//Employee (int c, double b)  : Constructor to assign 'c' to empc and 'b' bpay.
//void show()         : To display empe and bpay after performing the task.
//Class name        : Overtime
//Data members/instance variables:
//nd : To store number (int) of days extra worked.
// rate :To store rate (float) per day.
//Member functions/methods
//Overtime(int n, float r)  : Constructor to assign 'n' to nd and 'r' to rate.
//double calculate()        : To calculate  salary (salary paid for extra hours).
//void show                  : To display the amount paid for extra hours.
//Assume that the super class Employee has been defined. Using the concept of inheritance,
// specify the class Overtime giving the details of the constructor, double calculate and void show functions.
// The main() function need not be written.
import java.util.*;
public class Employee {
    int empc;
    double bpy;
    Employee (){
        empc=0;
        bpy=0.0;
    }

    Employee(int c,double b)
    {
        empc =c;
        bpy =b;
    }

    void show()
    {
        System.out.println(empc);
        System.out.println(bpy);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of days");
        int n = sc.nextInt();
        System.out.println("enter rate");
        float r = sc.nextFloat();
        System.out.println("enter no of,empcode");
        int c = sc.nextInt();
        System.out.println("enter no of basic salary");
        double b = sc.nextDouble();
        Employee.overtime obj = new Employee().new overtime(n, r, c, b);
        obj.show();
    }
    class overtime extends Employee
    {
        int nd;
        double rate;
        overtime (int n,float r,int c, double b)
        {
            super(c,b);
            nd=n;
            rate=r;
        }
        double calculate()
        {
            double eamt;
            eamt = nd*rate;
            return eamt;
        }
        void show()
        {
            super.show();
            double k=calculate();
            System.out.println("extra amt"+k);
        }
    }
}
