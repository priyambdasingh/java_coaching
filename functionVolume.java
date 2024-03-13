package java_coaching;

import java.util.Scanner;

//31. Write class to make overloaded function volume() to perform the following :
//(a) To find and return volume of cube using (side*side*side).
//(b) To find and return volume of cuboid using (length*breadth*height).
//(c) To find and return volume of cylinder using (3.14*r*r*h)
public class functionVolume {
    public static void cube(int s) {
        int cube=s*s*s;
        System.out.println("area is"+ " "+cube);
    }
    public static void cuboid(int l,int b,int h){
        int cuboid =l*b*h;
        System.out.println("area is"+ cuboid);
    }
    public static void cylinder(int r,int h){
        double cylinder = 3.14*r*r*h;
        System.out.println("area is"+ cylinder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side  value");
        int S= sc.nextInt();
        cube(S);
        System.out.println("enter value l, b,h");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        cuboid(l,b,h);
        System.out.println("enter value r,H");
        int r = sc.nextInt();
        int H = sc.nextInt();
        cylinder(r,H);
    }
}
