package inheritance_topic;



//super keyword ==== you can access the variable and methods from the immedeiated parent class
class Parent {
   int a=20;
    void displayPArent(){
        System.out.println("from Parent");
    }
}
class child1 extends Parent{
    int b=10;
    void print(){
        System.out.println(super.a);
        super.displayPArent();
    }

}
public class Sample {
    public static void main(String[] args) {
        child1  c=new child1();
        c.print();

    }
}
