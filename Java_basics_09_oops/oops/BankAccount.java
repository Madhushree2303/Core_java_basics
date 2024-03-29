package Java_basics_09_oops.oops;

public class BankAccount {

    // attributes
    String bank_name;

    int bank_balance;

    String account_HolderName;

    //Noargument construter
    BankAccount(){
        System.out.println("default C");
        bank_name="SBI";
        bank_balance=3000;
        account_HolderName="test user 3";
    }

    // parameterized constructor
    BankAccount(String bname, int bbalance, String ahname){
        this.bank_name=bname;
        this.bank_balance=bbalance;
        this.account_HolderName=ahname;
    }

    // method to get details
    void cus_details(){
        System.out.println(bank_name);
        System.out.println(account_HolderName);
        System.out.println(bank_balance);
    }
}
