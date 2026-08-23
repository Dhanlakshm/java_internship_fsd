package fundamentals;
//Types of variales
public class Test {
        int a=10;      //instnce variable --> Heap segment RAM
    static int b=20;  //static variable --> static segement of the RAM

     void display(){
        int c=30;  ///Local variable --> Stack segemnt ram
        System.out.println(c);
    }
    public static void main(String[] args) {
          Test t=new Test();
//        System.out.println(t.a); //10
        System.out.println(b);
       t.display();


    }
}
