package programs;

public class sample1 {
    public static void main(String[] args) {
//        int a=5;
//        String name=10;
//        System.out.println(x);
//        sample1 s=new sample1();
//        s.method1();
        int age=10;
        try {
            if(age<18)
            {
                throw new Exception("Something went wrong");  // throw = send, // Create the exception object
            }
                      else{
                            System.out.println("eligible to vote");
                        }
        } catch(Exception e) {  // catch = receive and handle, e is a reference variable that holds the exception object
            System.out.println("Caught: " + e.getMessage()); // Access it via reference variable
        }

    }
}
