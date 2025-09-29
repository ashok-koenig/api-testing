public class Bank {
    String accNumber;
    String accName;
    double balance;

    Bank(){
        // Calling parameterized constructor from default constructor
        this("0000", "Unknown", 0.0);
    }

    Bank(String accNumber, String accName, double balance){
        this.accNumber =  accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    void accDetails(){
        System.out.println("Account Number: "+ accNumber);
        System.out.println("Account Name: "+ accName);
        this.showBalance();
    }

    void showBalance(){
        System.out.println("Account Balance: "+ balance);
    }

    public static void main(String[] args) {
        Bank acc1 = new Bank("ACC0010", "JOhn Smith", 1000);
        acc1.accDetails();

        Bank acc2 = new Bank();
        acc2.accDetails();
    }
}
