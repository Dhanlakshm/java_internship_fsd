package programs;

public class p1 {
    public static void main(String[] args) {

        int a[]={10,20,30,54,0,51,90};
        int sum=0;
        for(int x:a)
        {
            sum=sum+x;
        }
        System.out.println("sum: "+sum);
        System.out.println("avg: "+(sum/a.length));
        int min=a[0];
        int max=a[0];
        for(int x:a)
        {
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
      int b[][]={
              {1,2,3},
              {4,5,6},
              {7,8,9}
      };
      int sum2=0;
      for(int x[]:b)
      {
          for(int y:x)
          {
              sum2+=y;
          }
      }
        System.out.println("2d sum: "+sum2);
    }
}
