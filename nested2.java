package java_coaching;

class nested2 {
    public static void main(String[] args) {
        int g = 4;
        for (int i = 1; i <= 5; i++) {
            // Print spaces based on the value of 'g'
            for (int k = 1; k <= g; k++) {
                System.out.print(" ");
            }
            // Print numbers in decreasing order from 'i' to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j );
            }
            System.out.println();
            g--;
        }
    }
}

