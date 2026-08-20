package Opps;

public class Bank {
    private int pin;
    private double balance;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    //deposite
    //this keyword is used to to diff between the instance and local variable, this keyword always referes to the current object
    void deposite(int pin, double amount){
        if(this.pin==pin)
        {
           balance=balance+amount ;
            System.out.println("Amount deposited succesfully ..!");
        }
        else {
            System.out.println("Invalid PIN");
        }
    }
    //withdrawal
    void withdrawal(int pin, double amount){
        if(this.pin==pin)
        {
            balance=balance-amount ;
            System.out.println("Amount withdrawn succesfully ..!");
        }
        else {
            System.out.println("Invalid PIN");
        }
    }
    //checkBalance
    void checkBalance(int pin){
        if(this.pin==pin)
        {
            System.out.println("Current balance: "+balance);
        }
        else {
            System.out.println("Invalid PIN");
        }
    }
}
