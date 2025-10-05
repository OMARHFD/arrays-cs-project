package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    Double[] transactins = new Double[1000];
    int notransactions=0;
    //initialize the constructor
    public BankAccount(String name, int startingBalance){
        this.name =name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if (amount>=0)
        {
            currentBalance += amount;
            transactins[notransactions] = amount;
            notransactions++;
            System.out.println("Depositor :Unknown | Amount : "+amount+" | Current Balance : "+currentBalance );
        }
        else
        {
            System.out.println("Error : UNSUCCESSFUL DEPOSIT");
        }
    }

    public void withdraw(double amount){
        if (amount<=currentBalance)
        {
            currentBalance -= amount;
            transactins[notransactions] = -amount;
            notransactions++;
            System.out.println("Withrawer : "+name+" | Amount : "+ (-amount) +" | Current Balance : "+currentBalance );
        }
        else
        {
            System.out.println("Error : UNSUCCESSFUL WITHRAWAL");
        }
    }

    public void displayTransactions(){
    for (Double val : transactins) System.out.println(val);
    }

    public void displayBalance(){
     System.out.println(currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
