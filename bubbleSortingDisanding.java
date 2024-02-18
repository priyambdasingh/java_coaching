package java_coaching;

import java.util.Scanner;


public class bubbleSortingDisanding {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n[]=new  int[5];
            System.out.println("enter any 5 vqlue");
            for(int i =0; i<5; i++)
            {
                n[i]= sc.nextInt();
            }
            for (int i = 4; i>=0; i--)
            {
                for(int j=0; j<i; j++)
                {
                    if(n[j]<n[j+1])
                    {
                        int t= n[j];
                        n[j]=n[j+1];
                        n[j+1]=t;
                    }
                }

            }
            for(int i = 0; i<5;i++)
            {
                System.out.println(n[i]);
            }

        }
    }


