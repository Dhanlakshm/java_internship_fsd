package Opps;

public class Student {
        String std_name;
        String std_usn;
        String branch;
        int age;

     void display_std_Details(){
         System.out.println(std_name+" "+std_usn+" "+branch+" "+age);
     }

    public static void main(String[] args) {
        Student s1=new Student();   //std_name=null, stdusn=null, branch=null, age=0;
        s1.std_name="riya";
        s1.std_usn="cse01";
        s1.branch="cse";
        s1.age=20;
        s1.display_std_Details();

        Student s2=new Student();
        s2.std_name="siya";
        s2.std_usn="cse02";
        s2.branch="cse";
        s2.age=20;
        s2.display_std_Details();
    }
}
