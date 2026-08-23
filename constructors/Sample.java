package constructors;

public class Sample {

    //constructor ---> not have return type, name of the constructor shd be same as the name of the class
    int a;   //instance variable
     Sample(int a){   //local var
        System.out.println("Parameterized Constructor executed");
       this.a=a;   //this -keyword which is used to differentiate between instance abd local var,
        System.out.println(a);
    }

    Sample(){
        System.out.println("default constructor executed");
    }
    Sample(int x, int b)
    {

    }
    //number of para, types of para
//constructor overloading

    public static void main(String[] args) {
        Sample s=new Sample(10);
        Sample s1=new Sample();
    }
}
