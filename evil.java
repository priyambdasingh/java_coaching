package java_coaching;
//An Evil Number is a number which contains even number of 1's in its binary equivalent.
//Example: Binary equivalent of 10 = 1010 which contains even number on 1's.
//Thus, 10 is an Evil Number.
//Design a class Evil to check if a given number is an Evil number or not. Some of the members of the class are given below: •
//Class name  :Evil
//Data members/instance variables:
//num      to store a positive integer number
//bin       to store the binary equivalent
//Methods / Member functions:
//Evil() :   default constructor to initialize the data member
//            with legal initial value
//void acceptNum()   :to accept a positive integer number
//void rec_bin (int x)  : to convert the decimal number into its binary equivalent using recursive technique
//void check( )  : to check whether the given number is an Evil number by invoking the function rec_bin() and to display the result with an appropriate message
//
//Specify the class Evil giving details of the constructor ),void acceptNum( ), void rec_bin(int)
// and void check(). Define a main() function to create an object and call all the functions accordingly to enable the task.
//[10]

import java.util.Scanner;

public class evil {
    int num;
    int bin;
    evil(){
        num =0;
        bin=0;
    }
    void acceptNum(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a positive integer number");
        num = sc.nextInt();
        }
    int rec_bin (int x){

        if (x == 0)
        return 0;
        else{
            return x % 2 + 10 *(rec_bin(x/2));
        }
    }
    void check( ){
        bin=rec_bin(num);
int m=bin;
int c=0;
while(m>0) {
    int d = m % 10;
    if (d == 1)
        c++;
    m = m / 10;
}
if(c%2==0) {
    System.out.println("evil no.");
}
else {
    System.out.println("not evil no.");
}
}

    public static void main(String[] args) {
       evil obj=new evil();
       obj.acceptNum();
       obj.check();
    }
}
