package Java_basics_09_oops.oops;

public class Java_oops_concepts_91 {

    public static void main(String[] args) {

        // object created for class
        BankAccount bankAccount2=new BankAccount();
        bankAccount2.cus_details();

        System.out.println("---- -----");

        BankAccount bankAccount=new BankAccount("icici",1000, "test user 1");
        bankAccount.cus_details();

        System.out.println("--------- ----------");

        BankAccount bankAccount1=new BankAccount("HDFC",2000,"test user 2");
        bankAccount1.cus_details();



    }
}
