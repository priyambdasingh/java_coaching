package java_coaching;

import java.util.Scanner;

public class consonantString {


        public static void main(String[] args) {
            String a;
            System.out.print("enter value ");
            Scanner sc =new Scanner(System.in);
            a = sc.nextLine();
            int l = a.length();
            int count=0;
            for(int i =0 ;i<=l-1;i++){
                char h=a.charAt(i);
                if(h!='a'&&h !='e'&&h !='i'&&h!='o'&&h !='u'&& h!= ' ') {
                    count++;
                }
            }
            System.out.println(count);
        }

    }









