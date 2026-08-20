package Opps;

//Polymorphism --- 2 types
//1. compile time poly  ---> Method overloading
//2. run time poly --> Method Overriding
//overloading -- paramters(number of p, type of p, order of p) ---
interface Sum{
    void sum(int a, int b);
    void sum(int a, float b);
    void sum(int a, int b, int c);
}
class Sum_impl implements Sum{

    @Override
    public void sum(int a, int b) {
        System.out.println("Sum: "+(a+b));
    }

    @Override
    public void sum(int a, float b) {
        System.out.println("Sum: "+(a+b));
    }

    @Override
    public void sum(int a, int b, int c) {
        System.out.println("Sum: "+(a+b+c));
    }
}
//overriding -- one method having different implementation
class Parent{
    void dispaly()
    {
        System.out.println("from parent");
    }
}
class Child extends Parent{
    void display()
    {
        System.out.println("from child ");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        Parent p=new Parent();
        p.dispaly();

        Parent p1=new Child();  //upcasting
        p1.dispaly();


        Sum_impl s1=new Sum_impl();
        s1.sum(10,20);
        s1.sum(10,230.25f);
        s1.sum(10,20,30);
    }
}
