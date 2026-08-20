package programs;


class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class sample5 {
    static void checkAge() throws InvalidAgeException{
        int age=17;
        if(age<18)
        {
            throw new InvalidAgeException("not eligible");
        }

    }
    public static void main(String[] args)  {
        int age=17;

        try{
            if(age<18)
            {
                throw new InvalidAgeException("cannot vote");
            }
            System.out.println("eligible");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
