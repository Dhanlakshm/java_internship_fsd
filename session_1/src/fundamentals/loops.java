package fundamentals;

public class loops {
    public static void main(String[] args) {
        //for loop --use it when the end condition is known

//        for (int i=0;i<5;i++)
//        {
//            System.out.println("java internship");
//        }

        //counting the number of digits in the given input number
        //input --> 265132(6)
        //output-->6
//        int n=2651;
//        while(n!=0)  --> entry controlled
//        {
//
//        }

        //do-while ----(when you execute your code atleast once even if the condition is wrong)
        int i=5;            //exit controlled
        do{
            System.out.println("welcome");
            i++;
        }
        while (i<0);
    }
}
