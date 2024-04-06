package java_coaching;

import java.util.Scanner;

//Design a class roots with following members:
//Data members: a, b, c, X1, X2 ( all float data members)
//Member functions :
//(i) roots (float x, float y, float z)- a parameterized constructor to assign 'a = x', 'b = y', 'c=z'.
//(ii)void FindRoots() - to find and print the roots X1, X2 from the following relation:
//X1=ニ0+163-4ac/2a
//X2=ニ0-16-4ac/2a
//Write a main() program to create object of class and print the roots X1, X2 using above methods.
public class roots {
    float a,b,c,x1,x2;
    public roots(float x,float y,float z){
        a = x;
        b =y;
        c= z;
    }
    void findroots()
    {
        x1 =(-b+(float) Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b-(float) Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("the first value"+x1);
        System.out.println("the second value"+x2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value x");
        float x = sc.nextFloat();
        System.out.println("enter value y");
        float y = sc.nextFloat();
        System.out.println("enter value z");
        float z = sc.nextFloat();
        roots obj =new roots (x,y,z);
        obj.findroots();
    }
}
