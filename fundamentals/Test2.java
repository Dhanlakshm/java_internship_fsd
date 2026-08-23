package fundamentals;


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
    //Banking operations....
    //1. deposite
    //2. withdral
    //3. check balance

        Scanner s=new Scanner(System.in);
        System.out.println("Choose one from the below list: ");
        System.out.println("1. Deposite");
        System.out.println("2. withdrawal");
        System.out.println("3. Check balance");

        System.out.println("enter the chioce: ");
        int choice=s.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Depositing the amount to youe account");
                break;
            case 2:
                System.out.println("Withrawing money from your account");
                break;
            case 3:
                System.out.println("Calculating the balance");
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }


    }
}
