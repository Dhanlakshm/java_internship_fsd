package programs;

public class sample4 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
                if(b==0)
                {
                    throw new ArithmeticException("cannot divide by 0");
                }
                System.out.println("result: "+(a/b));
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

