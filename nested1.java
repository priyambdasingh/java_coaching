package java_coaching;

public class nested1 {
    public static void main(String[] args) {
        int g=4;
        for(int i =1; i<=5;i++){
            for(int k=1; k<=g;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               System.out.print(i);
            }
            System.out.println();
            g--;
        }
    }
 }
