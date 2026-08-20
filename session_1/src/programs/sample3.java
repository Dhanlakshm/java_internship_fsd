package programs;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class sample3 {
//    static void readFile() throws FileNotFoundException, ArithmeticException {
//        FileReader fr=new FileReader("E:\\Java_FSD_Internship_2026\\session_1\\src\\programs\\sample2.java");
//        int a=10;
//        int b=0;
//        System.out.println("result: "+(a/b));
//    }
//    public static void main(String[] args) {
//
//        try{
//            readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println("file not found");
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("cannot divide by zero");
//        }
//
//    }

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try{
            checkAge(15);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
