package java_coaching;

import java.util.Scanner;

public class railwayTicket {
    String name ,coach;
    long mobileNo;
    int amt, totalAmt;
    void  accept(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter name coach ");
        coach =sc.nextLine();
        System.out.println("mobNO");
        mobileNo = sc.nextLong();
        System.out.println("amt");
        amt = sc.nextInt();
    }
    void update ()
    {
        if(coach.equals("first Ac"))
        {
            totalAmt =amt+700;
        }else if(coach.equals("scond ac")){
            totalAmt =amt+500;
        }else if (coach.equals("ThirdAc")){
            totalAmt=amt+250;
        }else{
            totalAmt=amt;
        }
    }
    void display(){
        System.out.println("name is "+" "+name);
        System.out.println("coach no "+" "+coach);
        System.out.println("mobileNO "+" "+mobileNo);
        System.out.println("totalamt "+" "+totalAmt);

    }

    public static void main(String[] args) {
        railwayTicket obj= new railwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}
