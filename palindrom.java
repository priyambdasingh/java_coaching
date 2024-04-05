package java_coaching;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
            String r="";
            System.out.println("enter a word");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            int l =a.length();
            for (int i = l-1; i>=0; i--)
            {
                char ch = a.charAt(i);
                r+=ch;

            }
        if(r.equals(a)){
            System.out.println("palindrom sentence");
        }else{
            System.out.println("not palindrom sentence");
        }

        }

    }


