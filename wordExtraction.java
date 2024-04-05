package java_coaching;
import java.util.Scanner;

public class wordExtraction {
    public static void main(String[] args) {
        String a;
        System.out.print("enter any sentence");
        Scanner sc =new Scanner(System.in);
        a= sc .nextLine();
        a = a+" ";
        int j =0;
        int l = a.length();
        for (int i =0; i<l;i++)
        {
            char ch = a.charAt(i);
            if(ch == ' '){
                String b = a.substring(j,i);
                j = i+1;
                System.out.println(b);

            }
        }
    }

}