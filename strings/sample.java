package strings;

class Parent{
    int x=10;
    void display(){
        System.out.println("hello");
    }
}
class child extends Parent{
    void print(){
        System.out.println(super.x);
        super.display();
    }
}
public class sample {
    public static void main(String[] args) {

        child c=new child();
        c.print();
    }
}
