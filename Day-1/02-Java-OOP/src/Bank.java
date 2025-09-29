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

    void withdraw(double amount) throws InsufficientFundException{
        if(amount > balance){
            throw new InsufficientFundException("Insufficient balance to withdraw");
        }
        balance -= amount;
        this.showBalance();
    }

    public static void main(String[] args) {
        try {
            Bank acc1 = new Bank("ACC0010", "JOhn Smith", 1000);
            acc1.accDetails();
            acc1.withdraw(500);

            Bank acc2 = new Bank();
            acc2.accDetails();
            acc2.withdraw(100);
        }catch (InsufficientFundException e){
            System.out.println("Withdrawal Failed: "+ e.getMessage());
        }
    }
}
