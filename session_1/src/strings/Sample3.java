package strings;

import java.util.Arrays;

public class Sample3 {
    public static void main(String[] args) {

        String s="RajaRamMohanRoy";

        System.out.println(s.charAt(5));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf('R'));  //first occurance
        System.out.println(s.lastIndexOf('R'));
        System.out.println(s.substring(2));

        char x[]=s.toCharArray();  //create a char array contraing characters present in s
        System.out.println(Arrays.toString(x));
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
        for(char c:s.toCharArray())
        {
            System.out.print(c);
        }

    }
}
