package java_coaching;
//Design a class Product with following members:
//Data members :num (long integer data)
//Member functions :
//(i) Product - a default constructor to assign a number of your choice to variable num.
// (ii)long ProductOfDigits- to print the number and return product of all the digits present in num.
//Write a main() method to print the required output by invoking suitable methods.
 class Product {
    long num;
    public Product(){
        num = 256;
    }
    long productOfDigit(){
        System.out.println("My numbers is"+num);
        long d;
        long p =1;
        while (num>0){
             d=num%10;
            p *=d;
            num = num/10;
        }
        return p;
    }

    public static void main(String[] args) {
        {
            Product obj = new Product();
            long k = obj.productOfDigit();
            System.out.println("product is"+k);
        }
    }

}
