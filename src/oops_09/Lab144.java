package src.oops_09;

public class Lab144 {

    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        System.out.println("------  ------");

        BankAccount hdfc = new BankAccount("HDFC", "hdfc002");
        hdfc.printDetails();

        System.out.println("------  ------");

        BankAccount icici = new BankAccount("ICICI", "icici003");
        icici.printDetails();


    }


}
