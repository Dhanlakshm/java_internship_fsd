package strings;

public class Sample4 {
    static int count_digits(int n){
        int count=0;
          while (n!=0)
          {
                n=n/10;
                count++;
          }
     return count;
    }

    public static void main(String[] args) {
        int a[]={12,345,2,6,7896};
        int even_count=0;
        for (int i=0;i<a.length;i++)
        {
           int digits= count_digits(a[i]);
           if(digits%2==0)
           {
               even_count++;
           }
        }
        System.out.println("even_count: "+even_count);
    }
}
