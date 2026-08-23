package programs;

import java.util.Arrays;

public class sample {
    //Methods without parameter, without return type
    void displayContent(){
        System.out.println("from displayCOntent()");
    }

//    Methods without parameter, with return type
        int method2(){
            return 10;
        }

        //Methods with parameter, without return type
    void method3(int a,int b)
    {
        System.out.println("sum: "+(a+b));
    }

    // Methods with parameter, with return type
    String method4(String name)
    {
        return name;
    }
    public static void main(String[] args) {
            sample s=new sample();
         s.displayContent();
         int res=s.method2();
        System.out.println(res);

        s.method3(10,20);

        String n =s.method4("Ujaini");
        System.out.println(n);
    }
}
