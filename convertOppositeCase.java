package java_coaching;

import java.util.Scanner;

public class convertOppositeCase {
    public static void main(String[] args) {
        String a;
        System.out.println("enter any sentence");
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        int l = a.length();
        for (int i =0; i<l;i++){
            char ch = a.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }else {
                ch = Character.toUpperCase(ch);
            }
            System.out.print(ch);
        }

    }
}
