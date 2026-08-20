package strings;

public class Sample2 {
    public static void main(String[] args) {
        //Immutable strings ---> values cannot be changes once initalized
        //create --2 ways
        //1. Type-1 decalaration
        String s1="Java";
        //2. Type-2 decelaration
        String s2=new String("Java");

        String x="Java";   //constant pool
        String y="Java";
        System.out.println(x==y);  //true

        String p=new String("Java");   //non--constant pool
        String q=new String("Java");
        System.out.println(p==q);   //flase

        //== memory location

        //string pool (Heap)  ---> string constant poool, string non-constant pool

        String a="jcer";
        String b="Jcer";
        System.out.println(a.equalsIgnoreCase(b));

        //==, equals, equalsIgnoreCase
    }
}
