package java_coaching;

public class nested3 {
    public static void main(String[] args) {
        int g=4;
        int j,l;
        for(int i=1; i<=5;i++) {

            for (int k = 1; k <= g; k++) {
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (  l = i-1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
            g--;
        }

    }
}
