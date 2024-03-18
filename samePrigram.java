package java_coaching;

import java.util.Scanner;

public class samePrigram {
    public static void main(String[] args) {
            String a;
            System.out.print("enter value ");
            Scanner sc =new Scanner(System.in);
            a = sc.nextLine();
            int l = a.length();
            int c1=0;
             int c2=0;
             int c3=0;
             int c4=0;
            for(int i =0 ;i<=l-1;i++){
                char ch1=a.charAt(i);
                if (ch1 >= 'A' && ch1 <= 'Z'){
                   c1++;

                } else if (ch1 >= 'a' && ch1 <= 'z'){
                     c2++;

                } else if (ch1 >='0' && ch1 <='9'){
                  c3++;

                }else {
                    c4++;
                }

            }
        System.out.println("uper case"+  c1);
        System.out.println("lower case"+c2);
        System.out.println("digit "+  c3);
        System.out.println("special"+ c4);

        }

    }











