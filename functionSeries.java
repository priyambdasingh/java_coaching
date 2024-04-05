package java_coaching;

public class functionSeries {
    public static void star()
    {
        for(int i =1; i<=3;i++)
        {
            for(int j=1; j<=100;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        star();
        System.out.println("welcome");
        star();
        System.out.println("to function");
        star();

    }
}
