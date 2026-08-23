package Abstraction;


//Abstarction --- displaying only what is neccessary and hiding the implementation details
//1. abstract classes and methods
//2. interfaces

interface Jcer{
   void cseDept();
     void eceDept();
     void aimlDept();
}

class departments implements Jcer{
    public void cseDept(){
        System.out.println("from cse dept");
    }
    public void eceDept(){
        System.out.println("from ece dept");
    }
    public void aimlDept(){
        System.out.println("from aiml dept");
    }
}
public class SAmple {
    public static void main(String[] args) {
       departments d=new departments();
       d.aimlDept();
       d.cseDept();
       d.eceDept();
    }
}
