package oops;

public class Fees_structure {
    private int pin;
    private int balance;
    //gettter to print/display/retrive the private datamember
    public int getPin() {
        return pin;
    }


    public void setPin(int pin) {
        this.pin = pin;
    }

    void deposite(int amount, int pin)
    {
        if(this.pin==pin)
        {
            balance+=amount;
            System.out.println("Amount deposited");
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    void withdraw(int amount, int pin)
    {
        if(this.pin==pin)
        {
            balance-=amount;
            System.out.println("Amount withdrawn");
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    void check_balance(int pin)
    {
        if(this.pin==pin)
        {

            System.out.println("current balance: "+balance);
        }
        else{
            System.out.println("Invalid pin");
        }
    }
}
