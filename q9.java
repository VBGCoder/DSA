import java.util.*;
public class q9 {
    public static void main(String[] args) {
        long arr[] = {3,1,2,5,3};
        long n=arr.length;
//        s-sn=x-y
//        s2-s2n=(x-y)(x+y)
        long sn=n*(n+1)/2;
        long s2n=n*(n+1)*(2*n+1)/6;
        long s=0;
        long s2=0;

        for (int i=0; i<n;i++) {
            s += arr[i];
            s2 += (long)arr[i]*(long)arr[i];
        }
        long val1= sn-s;
        long val2= s2n-s2;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        System.out.println(x);
        System.out.println(y);
    }
}
