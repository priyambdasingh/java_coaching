package java_coaching;

class nested2 {
    public static void main(String[] args) {
        int g = 4;
        for (int i = 1; i <= 5; i++) {

            for (int k = 1; k <= g; k++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j );
            }
            System.out.println();
            g--;
        }
    }
}

