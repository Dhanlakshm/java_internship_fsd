package arrays;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        //var-->Arrya

        int c[]={10,20,30,50};
        System.out.println(Arrays.toString(c));

//        for(int i=0;i<c.length;i++)
//        {
//            System.out.println(c[i]);
//        }
        int d[][]={
                {10,20,30},
                {40,50,30},
                {60,70,90}
        };
        System.out.println(Arrays.deepToString(d));
//        for(int i=0;i<d.length;i++)
//        {
//            for(int j=0;j<d.length;j++) {
//                System.out.print(d[i][j]+" ");
//            }
//            System.out.println();
//        }

        int a[]={585,26,5626,5,684,26,8,35,68};
        Arrays.sort(a,2,7);  //
        System.out.println(Arrays.toString(a));

        String b[]=new String[10];
//        [5,5,5,5,5,5,5]
        Arrays.fill(b, 2, 6,"v");
        System.out.println(Arrays.toString(b));

        int x[]={1,2,3,8};
        int y[]={1,2,3,18};
        boolean result=Arrays.equals(x,y);
        System.out.println(result);

        int s[][]={
                {10,20,30},
                {40,50,30},
                {60,70,90}
        };
        int t[][]={
                {10,20,30},
                {40,50,30},
                {60,70,90}
        };
        System.out.println(Arrays.deepEquals(s,t));

        int ar[]={1,3,6,256};

//        int index=Arrays.binarySearch(ar,2);
//        System.out.println(index);

        int ar_copy[]=Arrays.copyOf(ar,20);
        System.out.println(Arrays.toString(ar_copy));


        //2---> 2,4,6,8,10,12,14.20..
        //n=5---> 5,10,15,20...(odd)
        //10,20...
        //n=3--->3,6,9,12....(odd)
        //6,12...
        //2---> 2,4,6,8,10,12,14.20..
        //n=6 --> 6,12,18,24,30,36.........(even)
        //6,12,24...


    }
}
