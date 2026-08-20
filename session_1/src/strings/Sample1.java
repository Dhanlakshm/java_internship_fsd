package strings;

public class Sample1 {
    public static void main(String[] args) {
        //Mutable STring --STringBuilder, StringBuffer
        StringBuilder s1=new StringBuilder("Java");
        System.out.println(s1);

        StringBuffer s2=new StringBuffer("Python");
        System.out.println(s2);
        //append(), replace(), insert(), delete()  --> directly modify your original string
        s1.append("Language");
        System.out.println(s1);
        s1.insert(2, "abc");
        System.out.println(s1);
        s1.replace(2,5,"xyz");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.delete(1,3);
        System.out.println(s1);


    }
}
