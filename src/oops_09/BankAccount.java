package src.oops_09;

public class BankAccount {

    String bankName;
    int balance;
    String bankCode;

    BankAccount()
    {
        bankName = "SBI";
        bankCode = "sbi001";
        System.out.println("Default Constructor");
    }

    BankAccount(String bName, String bCode)
    {
        this.bankName = bName;
        this.bankCode = bCode;
        System.out.println("Parameterized Constructor");
    }

    void printDetails()
    {
        System.out.println("Bank Name ->" + bankName);
        System.out.println("Balance ->" + balance);
        System.out.println("Bank Code ->" + bankCode);
    }

}
