package java_coaching;

import java.util.Scanner;

public class cityName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 15 value");
        String n[] = new String[5];
          String a;
            System.out.print("enter value ");
            a = sc.nextLine();
            int f=0;
        for(int i =0;i< n.length;i++) {
            n[i] = sc.nextLine();
            if (n[i].equalsIgnoreCase(a))
            {
                f++;

                System.out.println("city present");
            }
        }
        if(f==0)
            System.out.println("Not present");


        }
    }

