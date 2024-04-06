package java_coaching;
//A class SalaryCalculation has been defined to calculate the total salary of an employee on the fixed salary and allowances. The details of the class are as follows:
//Class name                                  : Salary Calculation
//Data members/ Instance variables            : codeNo (long integer type data)
//                                              basicPay, specialAlw, coveyance Alw, gross, pf,
//                                              netSalary, AnnualSal (all double type data)
//Methods / Members functions of the class :
//(i) void giveValues() -     to assign data members codeNo (code number), basicPay (basic salary)
//                           with some values and Rs. 1000.00 as conveyanceAlw (conveyance allowance).
//(ii) void SalaryCal() -    to calculate other allowances and salaries as given:
//                           specialAlw = 25% of basic salary (basicPay).
//                           gross = basicPay + specialAlw + conveyance Alw.
//                           pf = 8.33% of basicPay.
//                           netSalary = gross - pf.
//                           AnnualSal = 12 month netSalary.
//(iii) void display( )-  to print codeNo along with other data members with headings.



//Define a main() function to create the object of the class and invoke the methods to calculate allowances, salary and print all the data of an employee.
public class salaryCalculation {
    long codeNo;
    double  basicPay, specialAlw, coveyanceAlw,gross, pf,netSalary, AnnualSal;
    void giveValues(){
        codeNo =101;
        basicPay=25000;
        coveyanceAlw=1000;
    }
    void SalaryCal(){
        specialAlw = 0.25 * basicPay;
        gross = basicPay + specialAlw +coveyanceAlw;
        pf = 0.0833 * basicPay;
        netSalary = gross - pf;
        AnnualSal = 12 * netSalary;
    }
    void display( ){
        System.out.println("Employee Code: " + codeNo);
        System.out.println("Basic Pay: Rs." + basicPay);
        System.out.println("Special Allowance: Rs." + specialAlw);
        System.out.println("Conveyance Allowance: Rs." + coveyanceAlw);
        System.out.println("Gross Salary: Rs." + gross);
        System.out.println("PF Deduction: Rs." + pf);
        System.out.println("Net Salary: Rs." + netSalary);
        System.out.println("Annual Salary: Rs." + AnnualSal);
    }

    public static void main(String[] args) {
        salaryCalculation emp =new salaryCalculation();
        emp.giveValues();
        emp.SalaryCal();
        emp.display();
    }
}
